package stream_29;

import common.Util;

import java.util.List;

public class Stream230904 {
    public static void main(String[] args){
        List<Integer> list = Util.getRandomIntegerList();
        int largest = list.stream().reduce(0, (i1, i2) -> {
                            if(i1 >= i2) return i1;
                            else return i2;
                        });
        System.out.println(largest);

    }
}
