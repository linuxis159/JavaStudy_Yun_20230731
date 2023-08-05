package nested_26;


public class Nested03_WhenUsingInnerClass {
    interface Printable{
        void print();
    }
    public static void main(String[] args){
        Papers p = new Papers("Hello");
        Printable pi = p.getPrinter();
        pi.print();

    }


    static class Papers{
        private String con;
        public Papers(String s){
            con = s;
        }
        public Printable getPrinter(){
            return new Printer();
        }

        private class Printer implements Printable{
            public void print(){
                System.out.println(con);
            }
        }
    }

}
