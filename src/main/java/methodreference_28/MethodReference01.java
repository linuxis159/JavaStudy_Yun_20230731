package methodreference_28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class MethodReference01 {
    public static void main(String args[]){
        List<Integer> ls = Arrays.asList(1,3,5,7,9);
        Consumer<List<Integer>> c = l -> Collections.reverse(l);
        c.accept(ls);
        System.out.println(ls);

        c = Collections::reverse;
        c.accept(ls);
        System.out.println(ls);

    }
}
