package methodreference_28;

import java.util.Arrays;
import java.util.List;

public class MethodReference03 {
    public static void main(String[] args){
        List list = Arrays.asList("Yuu", "Arisa", "Suzuki");
        list.forEach(System.out::println);
    }
}
