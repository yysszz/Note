package springsourcecode.jdk.stream;

import com.google.common.base.Function;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

public class Demo01 {

    public static void main(String[] args) {
        /*new Thread(() ->{
            System.out.println("Lambda代替匿名内部类");
        }).start();*/
        final Function<String, Integer> stringIntegerFunction = Integer::parseInt;
        Integer apply = stringIntegerFunction.apply("555");
        System.out.println(apply);

        //Function
        Comparator<Integer> compare = Integer::compare;
        int compare1 = compare.compare(12, 10);
        System.out.println(compare1);

        IntBinaryOperator compare2 = Integer::compare;
        int i = compare2.applyAsInt(66, 66);
        System.out.println(i);

        KiteFunction<String, String, LocalDateTime> dateFormat = FunctionTest::DateFormat;
        dateFormat.run(LocalDateTime.now(),"yyyy-MM-dd HH:mm:ss");

        KiteFunction<String, String, LocalDateTime> kiteFunction = new KiteFunction<String, String, LocalDateTime>() {
            @Override
            public String run(LocalDateTime t, String s) {
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(s);
                System.out.println("test");
                return dateTimeFormatter.format(t);
            }
        };

        KiteFunction<String, String, LocalDateTime> kiteFunction1 = (LocalDateTime dateTime, String pattern) -> {
            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
            return dateTimeFormatter.format(dateTime);
        };
        String run = kiteFunction1.run(LocalDateTime.now(), "yyyy-MM-dd HH:mm:ss");
        System.out.println(run);
    }

}
