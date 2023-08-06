package methodreference_28;

import java.util.function.Consumer;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;

public class MethodReference04 {
    static class IBox{
        private int n;
        public IBox(int i){
            this.n = i;
        }
        public int larger(IBox b){
            if(n > b.n)
                return n;
            else
                return b.n;
        }
    }
    public static void main(String[] args){
        IBox ib1 = new IBox(5);
        IBox ib2 = new IBox(7);

        ToIntBiFunction<IBox, IBox> bf = (b1, b2) -> b1.larger(b2);
        int bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);

        //ib1.larger(ib2) -> protocol
        bf = IBox::larger;
        bigNum = bf.applyAsInt(ib1, ib2);
        System.out.println(bigNum);

    }
}
