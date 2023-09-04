package nested_26;

public class Nested2_InnerClass {
    //
    public static void main(String[] args){
        Outer o1 = new Outer();
        Outer o2 = new Outer();
        Outer.Member olm1 = o1.new Member();
        Outer.Member olm2 = o2.new Member();

        o1 = null;
        o2 = null;
        //never Collected, because member class exist
        for(;;){
            System.gc();
        }

    }
    static class Outer{
        private int num = 0;
        //Member class
        //Also Member class is exist in Method Memory Area
        //If Outer class garbage Collected Member class not 100% garbage Collected
        //Meber class using wtih interface
        class Member{
            void add(int n){
                num += n;
            }
            int get(){
                return num;
            }
            @Override
            protected void finalize() throws Throwable {
                System.out.println("Member Class Collected");
            }

        }
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Outer Class Collected");
        }

    }
}
