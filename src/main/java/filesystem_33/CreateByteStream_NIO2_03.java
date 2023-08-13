package filesystem_33;

import javax.xml.crypto.Data;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateByteStream_NIO2_03 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("nio2/data.txt");
        Files.createFile(path);
        try(DataOutputStream out = new DataOutputStream(Files.newOutputStream(path));
            DataInputStream in = new DataInputStream(Files.newInputStream(path))){
            out.writeInt(370);
            out.writeDouble(3.14);
            out.close();

            int readingInt = in.readInt();
            double readDouble = in.readDouble();
            System.out.println(readingInt + readDouble);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(BufferedWriter bw = Files.newBufferedWriter(path)){
            String str = "버퍼라이터스트림생성";
            bw.write(str);

        }

    }
}
