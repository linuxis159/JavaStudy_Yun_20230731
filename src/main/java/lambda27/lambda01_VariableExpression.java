package lambda27;

public class lambda01_VariableExpression {
    interface Printable {
        void print(String s);
    }

    interface Calculate {
        int cal(int left, int right);
    }
    public static void main(String[] args){
        Printable p;

        p = (String s) -> {
            System.out.println(s);
        };
        // Instance creating four time
        p.print("Exprssion1");
        //Incase One Line omitting curly braces
        p = (String s) -> System.out.println(s);

        p.print("Exprssion2");

        p = (s) -> System.out.println(s);

        p.print("Exprssion3");

        p = s -> System.out.println(s);

        p.print("Exprssion4");

        Calculate c;
        c = (a, b) -> {
            return a+b;
        };
        System.out.println(c.cal(10, 20));

        // omit return
        // if value remain return
        c = (a, b) -> a + b;
        c.cal(10, 20);
        System.out.println(c.cal(40, 60));

    }
}
