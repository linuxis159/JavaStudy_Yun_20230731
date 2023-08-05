package nested_26;

public class Nested01_StaticNestedClass {
    public static void main(String[] args){
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());
    }


    class Outer{
        private static int num = 0;
        //static nested class
        //share static member variable num
        static class Nested1 {
            void add(int n){
                num += n;
            }
        }
        static class Nested2 {
            int get(){
                return num;
            }
        }
    }
}