package lambda27;

public class Lambda02_FunctionalInterface {
    //allow only one abstract function
/*    @FunctionalInterface
    interface Calculate{
        int cal(int left, int right);
        int add(int left, int right);
    }
*/

    @FunctionalInterface
    interface Calculate <T extends Number>{
        T cal (T a, T b);
    }

    public static void main(String[] args){
        Calculate<Integer> c = (left, right) -> left + right;
        System.out.println(c.cal(100, 200));
    }
}
