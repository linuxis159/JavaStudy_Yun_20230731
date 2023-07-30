package stream_29;

import java.util.Arrays;
import java.util.List;

public class Stream03_FilteringAndMapping
{
    public static void main(String[] args){
        //Fitering and Mapping is Intermediate Operation
        List<String> names = Arrays.asList("Yuu", "Arisa", "Suzuki");
        int stringLengthSum = names.stream()
                .mapToInt(s -> s.length())
                .sum();
        System.out.println(stringLengthSum);


    }
}
