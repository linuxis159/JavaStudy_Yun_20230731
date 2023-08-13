package stream_29;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Stream04_Reduction {
    // Reduction is operaion reduceing data
    // using called reduce function
    public static void main(String[] args){
        List<String> names = Arrays.asList("Yuu", "Arisa", "Suzuki");
        // 1.Yuu compare with Arisa
        // 2.Arisa is more long
        // 3.Arisa comapre with Suzuki
        // 4.Suzuki more long
        // 5.return Suzuki

        // reduce fist argument added first array item
        String str = names.stream().reduce("", (s1,s2) -> {
            if(s1.length() > s2.length())
                return s1;
            else
                return s2;
        });
        System.out.println(str);

    }
}
