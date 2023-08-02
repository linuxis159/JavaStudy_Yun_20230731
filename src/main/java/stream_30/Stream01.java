package stream_30;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args){
        //using of
        Stream.of(10, 20, 30, 40, 50)
                .forEach(item -> System.out.println(item));
        //using stream concat
        Stream<String> ss1 = Stream.of("Yuu", "Arisa", "Suzuki");
        Stream<String> ss2 = Stream.of("Kanna", "Azusa", "Noa");
        Stream.concat(ss1, ss2)
                .forEach(s -> System.out.println(s));
    }
}
