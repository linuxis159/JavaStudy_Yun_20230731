package nested_26;

public class Lambda {
    @FunctionalInterface
    interface Printable<String>{
        void printString(String s);
    }



    public static void main(String[] args){
        Printable printExpression01 =
                s -> System.out.println("println :" + s);
        printExpression01.printString("Hello");

        printExpression01 = s -> System.out.printf("printf :%s", s);
        printExpression01.printString("Hello");
    }
}
