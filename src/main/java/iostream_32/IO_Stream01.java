package iostream_32;

import java.io.*;

public class IO_Stream01 {
    public static void main(String[] args) {
        //I/O target -> file, network, memory
        try(InputStream in = new FileInputStream("resource/testfile.txt");
            OutputStream out = new FileOutputStream("resource/testfileout.txt")) {
            //read binary data
            int data = in.read();
            System.out.println(data);
            out.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
