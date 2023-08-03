package stream_30;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Stream05_Collect {
    public static void main(String[] args){
        List<Integer> list = IntStream.of(1,3,5,7,9)
                .filter(num -> num % 3 == 0)
                .collect(() ->  new ArrayList<Integer>(),
                        (c,s) -> c.add(s),
                        (lst1, lst2) -> lst1.addAll(lst2));
        list.stream().forEach(num -> System.out.println(num));





    }
}
