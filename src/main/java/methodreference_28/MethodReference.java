package methodreference_28;

public class MethodReference {
    @FunctionalInterface
    interface Printable{
        void print(String s);
    }
    public static void main(String[] args) {
        Printable printExpression = System.out::print;
        printExpression.print("hello");

    }
}
