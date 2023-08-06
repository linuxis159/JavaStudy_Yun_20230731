package methodreference_28;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference02 {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(1, 3, 5, 7, 9);
        JustSort js = new JustSort();
        //effectively final
        Consumer<List<Integer>> c = js::sort;
        c.accept(ls);
        System.out.println(ls);
        js = new JustSort();
        c.accept(ls);

    }
}

class JustSort {
    public void sort(List<?> lst){
        Collections.reverse(lst);
    }
}
