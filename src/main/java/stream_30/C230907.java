package stream_30;

import common.Util;

import java.util.List;

public class C230907 {
    public static void main(String[] args){
        problem1(Util.getRandomIntegerList());
        problem2(Util.getRandomStringList());
        problem3(Util.getRandomIntegerList());
        problem4(Util.getRandomStringList());

    }
    //주어진 List<Integer>에서 모든 홀수를 찾아 새로운 리스트로 반환하세요.
    static void problem1(List<Integer> list){
        List<Integer> resultList = list.stream().filter(integer -> integer % 2 == 1).toList();
        resultList.stream().forEach(item -> System.out.println("홀수 : " + item));
    }

    //주어진 List<String>에서 문자열을 알파벳 순으로 정렬하세요.
    static void problem2(List<String> list){
        list.stream().sorted();
    }
    //주어진 List<Integer>에서 최댓값을 찾아 반환하세요.
    static void problem3(List<Integer> list){
        int max = list.stream().reduce((left, right) -> {
            if(left > right)
                return left;
            else
                return right;

            }
        ).get();

        System.out.println("최대값 : " + max);
    }
    //주어진 List<String>에서 중복된 요소를 제거한 후 새로운 리스트로 반환하세요.

    static void problem4(List<String> list){


    }
}
