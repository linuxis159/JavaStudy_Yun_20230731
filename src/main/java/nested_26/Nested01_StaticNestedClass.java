package nested_26;

public class Nested01_StaticNestedClass {
    public static void main(String[] args){
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(5);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());

        System.out.println(Outer.Nested3.nested3);
        Outer.Nested3.nested3Print();
        System.out.println(NormalClass.normalClassID);
    }


    class Outer{
        private static int staticNum = 0;
        //share only static variable
        private int instanceNum = 0;
        //static nested class
        //share static member variable num
        static class Nested1 {
            void add(int n){
                staticNum += n;
            }
        }
        static class Nested2 {
            int get(){
                return staticNum;
            }
        }

        static class Nested3{
            static int nested3 = 30;
            static void nested3Print(){
                System.out.println();
            }
        }
    }
}

class NormalClass{
    static int normalClassID = 3000;
}
