package idgenerator;

import java.time.Instant;

//https://instagram-engineering.com/sharding-ids-at-instagram-1cf5a71e5a5c
public class IdGenerator
{
     //Lock for sequence and lastTimestamp.
     private final Object lock = new Object();

    private static final int TOTAL_BITS = 64;
    private static final int EPOCH_BITS = 41;
    private static final int NODE_ID_BITS = 10;
    private static final int SEQUENCE_BITS = 13;  //can generate 1023 ids per milli second!

    private static final long maxNodeId   = (1L << NODE_ID_BITS) - 1;     // Maximum nodes = 2 ^ 13 -1 =
    private static final long maxSequence = (1L << SEQUENCE_BITS) - 1;  // Maximum sequence = 2 ^ 10 - 1 = 1023

    //Custom epoch starts from 01, Jan 2022
    private static final long DEFAULT_CUSTOM_EPOCH = 1640975400000L;

    private long nodeId;
    private long customEpoch;

    private volatile long lastTimestamp = -1L;
    private volatile long sequence = 0L;

    public IdGenerator(long nodeId)
    {
        if(nodeId < 0 || nodeId > maxNodeId)
        {
            throw new IllegalArgumentException(String.format("NodeId must be between %d and %d", 0, maxNodeId));
        }
        this.nodeId = nodeId;
        this.customEpoch = DEFAULT_CUSTOM_EPOCH;
    }
    public synchronized long nextId()
    {
        long currentTimestamp = timestamp();

        //synchronized (lock)
        //{
            if(currentTimestamp < lastTimestamp)
            {
                throw new IllegalStateException("Invalid System Clock!");
            }
            if(currentTimestamp == lastTimestamp)
            {
                //Same milli second time slot. Increment sequence
                if(sequence >= maxSequence)
                {
                    //throw new IllegalStateException("Too many calls. Slow down ! " + sequence);
                    waitNextMillis();
                }
                ++sequence;
            }
            else
            {
                sequence = 0; //Reset sequence
                lastTimestamp = currentTimestamp;
            }
            //Generate the id
            long id = currentTimestamp << (NODE_ID_BITS + SEQUENCE_BITS)
                    | (nodeId << SEQUENCE_BITS)
                    | sequence;

            return id;
        //}
    }
    // Get current timestamp in milliseconds, adjust for the custom epoch.
    private long timestamp()
    {
        return Instant.now().toEpochMilli() - customEpoch;
    }
    // Block and wait till next millisecond
    private void waitNextMillis()
    {
        try
        {
            Thread.sleep(1);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }


}
