package nested_26;

public class Nested04_LocalClass {
    interface Printable{
        void print();
    }
    public static void main(String[] args){

    }
    static class Papers_Local{
        private String con;
        public Papers_Local(String s){
            con = s;
        }
        public Printable getPrinter(){
            //LocalClass
            class Printer implements Printable {
                public void print(){
                    System.out.println(con);
                }
            }
            return new Printer();
        }

    }

    static class Papers_AnonymousClass{
        private String con;
        public Papers_AnonymousClass(String s){
            con = s;
        }
        public Printable getPrinter(){
            //AnonymousClass
            return new Printable(){
                public void print(){
                    System.out.println(con);
                }
            };
        }

    }
}
