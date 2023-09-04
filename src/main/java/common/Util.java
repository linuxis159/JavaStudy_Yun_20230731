package common;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<Integer> getRandomIntegerList(){
        List<Integer> randomList = new ArrayList();
        for(int i=0; i<20; i++){
            randomList.add((int)(Math.random() * 100));
            System.out.println("created Integer :" + randomList.get(i));
        }
        return randomList;

    }

}
