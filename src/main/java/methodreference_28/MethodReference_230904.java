package methodreference_28;

public class MethodReference_230904 {
    @FunctionalInterface
    interface Printable {
        void print(String s);
    };
    public static void main(String[] args){
        Printable p = System.out::print;
        p.print("Hello");
        p.print("Hello");
        p.print("Hello");
    }
}
