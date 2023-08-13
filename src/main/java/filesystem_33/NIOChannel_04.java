package filesystem_33;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOChannel_04 {
    //Stream vs Channel
    //Stream : One direction
    //Channel : Both direction, Connected Buffer
    public static void main(String[] args) throws IOException {
        Path src = Paths.get("nio2/source.txt");
        Path dst = Paths.get("nio2/destination.txt");

        ByteBuffer buf = ByteBuffer.allocate(1024);
        try(FileChannel ifc = FileChannel.open(src, StandardOpenOption.READ);
                FileChannel ofc = FileChannel.open(dst, StandardOpenOption.WRITE, StandardOpenOption.CREATE)){
            int num;
            while (true){
                num = ifc.read(buf);
                // buffer mode change
                buf.flip();
                ofc.write(buf);
                buf.clear();
            }

        }

    }
}
