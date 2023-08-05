package nested_26;

public class Lambda01 {
    interface Printable {
        void print(String s);
    }

    public static void main(String[] args){
        //is interface
        //method signature
        Printable prn = (s) -> {
            System.out.println();

        };
        prn.print("hello");

    }



}
