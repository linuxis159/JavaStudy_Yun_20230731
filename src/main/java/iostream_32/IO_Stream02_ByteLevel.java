package iostream_32;

import java.io.*;
import java.nio.file.Files;

public class IO_Stream02_ByteLevel {
    public static void main(String[] args) throws IOException {
            long start, end;


            start = System.currentTimeMillis();
            fileSlowCopy();
            end = System.currentTimeMillis();
            System.out.println("slow copy :" + (end-start));

            start = System.currentTimeMillis();
            fileCopyUsingBuffer();
            end = System.currentTimeMillis();
            System.out.println("using buffer copy :" + (end-start));



        }



    static void fileSlowCopy() throws IOException {
        try(InputStream in = new FileInputStream("resource/testfile.txt");
            OutputStream out = new FileOutputStream("resource/testfileout.txt")) {
            int data;
            while (true) {
                data = in.read();
                if (data == -1)
                    break;
                else
                    out.write(data);
            }
        }
        File file = new File("resource/testfileout.txt");
        file.delete();

    }

    static void fileCopyUsingBuffer() throws IOException {
        try(InputStream in = new FileInputStream("resource/testfile.txt");
            OutputStream out = new FileOutputStream("resource/testfileout.txt")) {
            byte[] buf = new byte[1024];
            int len;
            while (true) {
                len = in.read(buf);
                if (len == -1)
                    break;
                else
                    out.write(buf, 0, len);
            }
        }
        File file = new File("resource/testfileout.txt");
        file.delete();
    }
}
