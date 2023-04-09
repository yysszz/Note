package springsourcecode.jdk.stream;

import com.rabbitmq.client.ConfirmCallback;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo02 {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        Stream<String> a = Stream.of("a", "b", "c");
        Stream<String> b = Stream.of("d", "e", "f");
        Stream<String> concat = Stream.concat(a, b);

        Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 3, 4);
        Integer integer = integerStream1.max(Integer::compareTo).get();
        System.out.println(integer);

        Comparator<Integer> comparator = (x, y) -> (x.intValue() < y.intValue()? -1 : (x.equals(y)) ? 0 : 1);
        Integer integer1 = integerStream.max(comparator).get();
        /*Stream<Integer> parallel = integerStream.parallel();
        Integer integer2 = parallel.min(comparator).get();
        System.out.println(integer1 + "," + integer2);*/

        /*Integer integer3 = integerStream.findFirst().get();
        System.out.println(integer3);*/

        String s = concat.findAny().get();
        System.out.println(s);

        //long count = concat.count();

        Stream<String> a1 = Stream.of("a", "b", "c");
        List<String> collect = a1.peek(e -> System.out.println(e.toUpperCase())).collect(Collectors.toList());

        /*a1.forEach(d ->{
            System.out.println(d.toLowerCase());
        });*/

        Stream<String> x1 = Stream.of("x", "y", "z");
        Stream<String> x2 = Stream.of("x", "y", "z");
        x1.parallel().forEach(x->{
            System.out.println(x.toUpperCase());
        });

        x2.parallel().forEachOrdered(x->{
            System.out.println(x.toUpperCase());
        });

        Stream<Integer> integerStream2 = Stream.of(1, 2, 3, 4);

        Stream<Integer> limit = Stream.iterate(0, (x) -> x + 2).limit(5);
        limit.forEach(System.out::println);

    }



}
