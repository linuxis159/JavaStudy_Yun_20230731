package filesystem_33;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE_NEW;

public class PathsAndPath_Fuction02 {
    public static void main(String[] args) throws IOException {
        try {
            Path path = Paths.get("resource/createdBy_");
            path = Files.createFile(path);
            //path = Paths.get("notEffectiveDir/createdBy_");
            //path = Files.createFile(path);
        }catch (Exception e){
            System.out.println("fail creating file");
        }
        // open, close process not necessary
        Path path = Paths.get("resource/KR");
        path = Files.createFile(path);
        Files.write(path, Arrays.asList("안녕하세요"));
        byte[] byteArr = Files.readAllBytes(path);
        path = Paths.get("resource/KR_COPY");
        Files.write(path, byteArr, CREATE_NEW);
        Files.write(path, byteArr, APPEND);

        String str1 = "첫번째 문자열";
        String str2 = "두번째 문자열";
        List<String> stringList = Arrays.asList(str1 ,str2);

        Files.write(path, stringList, APPEND);

        //ile dir = new File("resource");
        //List<File> fileList  = List.of(dir.listFiles());
        //fileList.stream().forEach(file -> file.delete());

    }
}
