package urlshortener;

import idgenerator.IdGenerator;
import io.seruco.encoding.base62.Base62;

import java.util.zip.CRC32;

public class URLShortener {

    IdGenerator generator;
    Base62 base62 = Base62.createInstance();

    public URLShortener()
    {
        generator= new IdGenerator(1);
    }

    public String createShortURL(String longURL)
    {
        String id = "1234567890123";//"" + generator.nextId();
        byte[] shortURL = base62.encode(id.getBytes());
        return new String(shortURL);
    }
    public String createShortURLUsingCRC32(String longURL)
    {
        CRC32 crc32 = new CRC32();
         crc32.update(longURL.getBytes());
        return Long.toHexString(crc32.getValue());
    }
    public static void main(String[] args)
    {
        String longURL = "http://www.yahoo.com/fjdkfjdkjfdskjfdskjfdskjfdskjfdskjfdskjfsdkjfdksjfdsjf";
        System.out.println(new URLShortener().createShortURL(longURL));

        //System.out.println(new URLShortener().createShortURLUsingCRC32(longURL));

    }
}
