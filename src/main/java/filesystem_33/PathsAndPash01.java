package filesystem_33;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndPash01 {
    public static void main(String[] args){
        //if path not effective this code run
        Path existPath = Paths.get("C:\\Users\\Ikgyeong.kim\\Documents\\JavaStudy\\JavaStudy\\src\\main\\java\\filesystem_33");
        Path notExistPath = Paths.get(File.separator +"NotExist");
        Path p1 = existPath.getRoot();
        Path p2 = existPath.getParent();
        Path p3 = existPath.getFileName();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Path p4 = notExistPath.getRoot();
        Path p5 = notExistPath.getParent();
        Path p6 = notExistPath.getFileName();

        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

        Path currentPath = Paths.get("");
        System.out.println(currentPath.toAbsolutePath());
        System.out.println(currentPath.toAbsolutePath());

    }
}
