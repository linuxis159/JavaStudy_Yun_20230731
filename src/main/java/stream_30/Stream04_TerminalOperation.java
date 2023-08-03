package stream_30;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream04_TerminalOperation {
    public static void main(String[] args){
        //average, min, max is wrapped optional
        IntStream.of(1,3,5,7,9)
                .min()
                .ifPresent(s -> System.out.println(s));
        IntStream.of(1,3,5,7,9)
                .max()
                .ifPresent(s -> System.out.println(s));
        IntStream.of(1,3,5,7,9)
                .average()
                .ifPresent(s -> System.out.println(s));


        boolean result01 = IntStream.of(1,3,5,7,9)
                .allMatch(n -> n%2 == 0);
        System.out.println(result01);

        boolean result02 = IntStream.of(1,3,5,7,9)
                .anyMatch(n -> n%2 == 0);
        System.out.println(result02);

        boolean result03 = IntStream.of(1,3,5,7,9)
                .noneMatch(n -> n%2 == 0);
        System.out.println(result03);


    }
}
