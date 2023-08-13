package lambda27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.random.RandomGenerator;

public class Lambda_WellKnownFunctionalInterface {
    interface Predicate<T> {
        boolean test(T t);
    }
    public static int sum(List<Integer> list){
        return list.stream()
                .filter(s -> s % 2 == 0)
                //Predicate
                .mapToInt(s -> s)
                .sum();
    }

    interface  Supplier<T> {
        T get();
    }
    public static List makeIntList(Supplier<Integer> s ,int n){
        List<Integer> list = new ArrayList();
        for(int i = 0; i < n; i++){
            list.add(s.get());
        }
        return list;
    }

    interface Consumer<T> {
        void accept(T t);
    }

    interface Fuction<T, R>{
        R apply(T t);
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        int s;
        System.out.println(sum(list));

        int n = 10;
        List<Integer> suppliedList = makeIntList(() -> RandomGenerator.getDefault().nextInt(), n);
        suppliedList.stream().forEach(item -> System.out.println(item));

        Consumer<String> c = str -> System.out.println(str);
        c.accept("Consumer");

    }
}
