package stream_30;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02_IntermediateOperation {
    public static void main(String[] args){
        // 1:N , 01_Yuu -> 01, yUU, 02_Arisa -> 02, Arisa, 03_Suzuki -> 03, Suzuki
        Stream<String> ss1 = Stream.of("01_Yuu", "02_Arisa", "03_Suzuki");

        Stream<String> ss2 = ss1.flatMap(s -> Arrays.stream(s.split("_")));
        ss2.forEach(s -> System.out.println(s));


        // 1:N , ReportCard : 10,20,30
        ReportCard reportCard = new ReportCard(10,20,30);
        Stream<ReportCard> reportCardStream = Stream.of(reportCard);
        IntStream intStream = reportCardStream.flatMapToInt(r -> IntStream.of(r.kor, r.eng, r.math));
        intStream.forEach(i -> System.out.println(i));
    }

    static class ReportCard {
        int kor;
        int eng;
        int math;
        public ReportCard(int kor, int eng, int math){
            this.kor = kor;
            this.eng = eng;
            this.math = math;

        }

    }
}
