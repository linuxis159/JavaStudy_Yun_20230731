package common;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static void main(String[] args){
        getRandomIntegerList().stream().forEach(item -> System.out.println(item));
        getRandomStringList().stream().forEach(item -> System.out.println(item));

    }
    public static List<Integer> getRandomIntegerList(){
        List<Integer> randomList = new ArrayList();
        for(int i=0; i<20; i++){
            randomList.add((int)(Math.random() * 100));
            System.out.println("created Integer :" + randomList.get(i));
        }
        return randomList;

    }

    public static List<String> getRandomStringList(){
        List<String> randomList = new ArrayList();
        for(int i=0; i<20; i++){
            String s = "";
            for(int j=0; j<5; j++){
                int ii = (int)(Math.random() * 300);
                char c = (char)ii;
                s += c;
            }
            randomList.add(s);
        }
        return randomList;

    }

    public static List<String> getDuplicationStringList(){
        List<String> randomList = new ArrayList();
        for(int i=0; i<5; i++){

            for(int j=0; j<5; j++){
                randomList.add("hello" + i);
            }
        }
        return randomList;

    }

}
