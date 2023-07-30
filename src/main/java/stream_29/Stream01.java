package stream_29;

import java.util.*;
import java.util.stream.IntStream;

public class Stream01 {
    public static void main(String[] args){
        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {1,2,3,4,5};

/*
        filter -> 중간연산
        sum    -> 최종연산
*/
        IntStream arrStream1 = Arrays.stream(arr1);
        IntStream arrStream2 = arrStream1.filter(n -> n%2 == 1);
        int arrSum1 = arrStream2.sum();

        int arrSum2 = Arrays.stream(arr2)
                .filter(n -> n%2 == 1)
                .sum();

        System.out.println(arrSum1 +","+arrSum2);




    }
}
