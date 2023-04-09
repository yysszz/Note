package springsourcecode.util;

import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

    private List<String> list;

    {
        list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("2");
        list.add("3");
    }

    public void testForEach(){
        list.forEach(s -> System.out.println(s));
    }

    public void testCollect(){
        List<Integer> collectList = list.stream().map(s -> Integer.valueOf(s)).collect(Collectors.toList());
    }

    public void testFilter(){
        List<String> filterList = list.stream().filter(str -> "1".equals(str)).collect(Collectors.toList());
    }

    public void testMap(){
        List<String> lowerCaseList = list.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
    }

    public void testMapToInt(){
        list.stream().mapToInt(s -> Integer.valueOf(s)).mapToObj(s ->s).collect(Collectors.toList());
        double sum = list.stream().mapToDouble(s -> Double.valueOf(s)).sum();
    }

    public void testDistinct(){
        list.stream().map(s -> Integer.valueOf(s)).distinct().collect(Collectors.toList());
    }

    public void testSorted(){
        list.stream().map(s -> Integer.valueOf(s)).sorted().collect(Collectors.toList());
        list.stream().map(s -> Integer.valueOf(s)).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public void testGroupBy(){
        Map<String, List<String>> collect = list.stream().collect(Collectors.groupingBy(s -> {
            if ("2".equals(s)) {
                return "2";
            } else {
                return "1";
            }
        }));
    }

    public void testFindFirst(){
        String s1 = list.stream().filter(s -> "2".equals(s)).findFirst().get();
        //findFirst为null返回3
        String s2 = list.stream().filter(s -> "2".equals(s)).findFirst().orElse("3");
        Optional<String> first = list.stream().filter(s -> "2".equals(s)).findFirst();
        if (first.isPresent()) {
            return;
        }
    }

    public void testReduce(){
        Integer integer = list.stream().map(s -> Integer.valueOf(s)).reduce((s, s2) -> s + s2).orElse(0);
        Integer reduce = list.stream().map(s -> Integer.valueOf(s)).reduce(100, (s1, s2) -> s1 + s2);
    }

    public void testPeek(){
        List<Integer> collect = list.stream().map(s -> Integer.valueOf(s)).peek(s -> System.out.println(s)).collect(Collectors.toList());
    }

    public void testLimit(){
        list.stream().map(s -> Integer.valueOf(s)).limit(2L).collect(Collectors.toList());
    }

    public void testMaxMin(){
        list.stream().max(Comparator.comparing(s -> Integer.valueOf(s))).get();
        list.stream().min(Comparator.comparing(s -> Integer.valueOf(s))).get();
    }


}
