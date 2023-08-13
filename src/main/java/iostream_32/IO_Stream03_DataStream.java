package iostream_32;

import java.io.*;

public class IO_Stream03_DataStream {
    public static void main(String[] args) throws IOException {
        try(DataOutputStream out =
                    new DataOutputStream(new FileOutputStream("resource/testfileout.txt"))){
            out.writeInt(370);
            out.writeDouble(3.14);

        }

        try(DataInputStream in =
                    new DataInputStream(new FileInputStream("resource/testfileout.txt"))){

            System.out.println(in.readInt());

            System.out.println(in.readDouble());
        }
        
    }
}
