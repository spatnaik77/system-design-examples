package idgenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test
{
    public static void main(String[] args) throws Exception
    {
        singleThreadedTest();


    }
    private static void singleThreadedTest()
    {
        long startTime = System.currentTimeMillis();
        HashSet<Long> set = new HashSet<Long>();
        long duplicateCount = 0;
        long totalCount = 1000000;

        set.add(1l);
        IdGenerator generator = new IdGenerator(1);
        for(int c =1; c <= totalCount; c++)
        {
            boolean result = set.add(generator.nextId());
            if(!result)
            {
                duplicateCount++;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime-startTime));
        System.out.println("Total: " + totalCount + " Duplicate count: " + duplicateCount + " Count in set: " + set.size());
    }

}
class Task implements Runnable
{
    private IdGenerator generator;
    private HashSet<Long> set;
    private HashSet<Long> duplicateSet;
    CountDownLatch latch;
    public Task(IdGenerator generator, CountDownLatch latch, HashSet<Long> set, HashSet<Long> duplicateSet)
    {
        this.generator = generator;
        this.set = set;
        this.duplicateSet = duplicateSet;
        this.latch = latch;
    }
    public void run()
    {
        long id = generator.nextId();
        boolean result = set.add(id);
        if(!result)
        {
            System.out.println("--------Dddddd");
            duplicateSet.add(id);
        }
        latch.countDown();
    }
}