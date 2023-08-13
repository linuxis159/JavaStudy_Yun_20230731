package iostream_32;

import java.io.*;

public class IO_Stream04_BufferStream {
    public static void main(String[] args) throws IOException {
        try(BufferedInputStream in = new BufferedInputStream(
                new FileInputStream("resource/testfile.txt"));
            BufferedOutputStream out = new BufferedOutputStream(
                    new FileOutputStream("resource/testfileout.txt"))
        ){
            int data;
            long start = System.currentTimeMillis();
            while (true){
                data = in.read();
                if(data == -1)
                    break;
                out.write(data);
            }
            in.close();
            out.close();
            long end = System.currentTimeMillis();
            System.out.println(end - start);
            File file = new File("resource/testfileout.txt");
            file.delete();
        }

    }
}
