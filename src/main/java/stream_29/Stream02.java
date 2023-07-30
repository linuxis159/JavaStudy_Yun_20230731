package stream_29;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args){
        String[] names = {"Yuu", "Arisa", "Suzuki"};

        //forEach -> 반환없는 최종연산

        Stream<String> stream = Arrays.stream(names);
        stream.forEach(name -> System.out.println(name));

        Arrays.stream(names)
                .forEach(name -> System.out.println(name));


    }
}
