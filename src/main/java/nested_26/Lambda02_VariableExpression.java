package nested_26;

public class Lambda02_VariableExpression {
    interface Printable {
        void print(String s);
    }

    public static void main(String[] args){
        Printable expression1 = (String s) -> {
            System.out.println(s);
        };
        expression1.print("expression1");



        Printable expression2 = (s) -> {
            System.out.println(s);
        };
        expression2.print("expression2");


        Printable expression3 = (s) -> System.out.println(s);

        expression2.print("expression3");


    }
}
