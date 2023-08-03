package stream_30;

import java.util.stream.Stream;

public class Stream03_Sorting {
    public static void main(String[] args){
        //We are when doing sort using comparable interface
        Stream.of("Yuu", "Arisa", "Suzuki")
                .sorted()
                .forEach( s -> System.out.println(s));
        //We can create comparable standard
        Stream.of("Yuu", "Arisa", "Suzuki")
                .sorted( (s1, s2) -> s1.length() - s2.length() )
                .forEach(s -> System.out.println(s));
        //forEach is looping and  terminal operation
        //but peek is intermediate operation and looping
        Stream.of("Yuu", "Arisa", "Suzuki")
                .peek(s -> System.out.println(s.length()))
                .forEach(s -> System.out.println(s));


    }
}
