package springsourcecode.guava;

import com.google.common.collect.Sets;

import java.util.*;
import java.util.concurrent.atomic.LongAdder;
import java.util.stream.IntStream;

public class GuavaTest {


    public static void guavaTestMethod() throws Exception{

//        Map<String, String> map = Maps.newHashMap();
//        List<String> list = Lists.newArrayList(new String[]{"aa","bb",null,"cc"});
//        List<String> list2 = Lists.newArrayList(new String[]{"aa","bb","cc"});
//        list2.remove("aa");
//        System.out.println(list2);
////        Set<String> set = Sets.newTreeSet();
//////        Objects.equals(list,map);
////
////        String x = Joiner.on("x").skipNulls().join(list);
////        System.out.println(x);
////
//        String[] strings = {"aa"};
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (int i = 0; i < strings.length; i++) {
//            stringBuilder.append(strings[i]);
//            if(i != strings.length - 1){
//                stringBuilder.append(",");
//            }
//        }
//        System.out.println(stringBuilder.toString().trim());
////        List<String> list1 = Arrays.asList(strings);
////        double random = Math.random();
////        int i = new Random().nextInt(list2.size());
////        System.out.println(list2.get(i));
//
//
//        BigDecimal bigDecimal = new BigDecimal("0");
//        List<BigDecimal> bigDecimals = Arrays.asList(new BigDecimal[]{new BigDecimal("3"),new BigDecimal("5"),new BigDecimal("7")});
//
//        for (BigDecimal decimal : bigDecimals) {
//            bigDecimal = bigDecimal.add(decimal);
//        }
//        System.out.println(bigDecimal);

//        Date date = DateUtils.parseDate("2021-06-29","yyyy-MM-dd");
//        System.out.println(date);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String formatStr = dateFormat.format(date);
//        formatStr = formatStr + " 00:00:00";
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime result = LocalDateTime.parse(formatStr,dateTimeFormatter);
//        System.out.println(result);
//        System.out.println(dateTimeFormatter.format(result));
//        LocalDateTime localDateTime1 = result.plusHours(24);
//        System.out.println((dateTimeFormatter.format(localDateTime1)));

        StringJoiner stringJoiner = new StringJoiner("1");
        stringJoiner.add("str");
        String s = stringJoiner.toString();
        System.out.println(s);
        Objects.requireNonNull(s);

        StringBuilder stringBuilder = new StringBuilder(s);
        IntStream.range(1,10).forEach(i -> {
            if (i<10) {
                stringBuilder.append(",");
            }
            stringBuilder.append(i);

        });
        System.out.println(stringBuilder.toString());

        StringJoiner joiner = new StringJoiner(",");
        IntStream.range(1,10).forEach(
                i -> joiner.add(i +"")
        );
        System.out.println(joiner.toString());

        LongAdder longAdder = new LongAdder();
        longAdder.increment();
    }

    public int majorityElement(int[] nums) {

        return 0;
    }

    public int search(int[] nums, int target) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0] == target?1:0;
        }
        int leftPoint = 0;
        int rightPoint = nums.length - 1;
        while (nums[leftPoint] < target){
            leftPoint++;
        }

        return rightPoint - leftPoint + 1;
    }

    public static void hashSetTest(){
        Set<String> set = Sets.newHashSet();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("3");
        set.add("3");
        set.add("3");
        set.forEach(System.out::println);
    }

    public static void main(String[] args) {
        hashSetTest();
    }
}
