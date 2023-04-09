package springsourcecode.collection;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionDemo {


    public static void list2Array(){
        List<String> objects = Lists.newArrayList();
        objects.add("11");
        Collections.reverse(objects);
        String[]strings = objects.toArray(new String[0]);
        System.out.println(objects);
    }

    public static void array2List(){
        String[] fruits = new String[]{"apple","banana","orange"};
        //list等同于list1
        List<String> list = Arrays.asList(fruits);
        List<String> list1 = Arrays.asList("dog", "cat", "bird");
        //Arrays内部类未重写List add、remove、clear方法，抛出UnsupportedOperationException
        /*list.add("11");
        list.remove("11");
        list.clear();*/

        //正确做法
        List<String> list2 = new ArrayList<>(Arrays.asList(fruits));
        list2.add("11");
        list2.remove("222");
        System.out.println(list2);


        //必须为对象类型数组
        int[] myArray = {1, 2, 3};
        List myList = Arrays.asList(myArray);
        System.out.println(myList.size());//1
        System.out.println(myList.get(0));//数组地址值
        System.out.println(myList.get(1));//报错：ArrayIndexOutOfBoundsException
        int[] array = (int[]) myList.get(0);
        System.out.println(array[0]);//1

        //stream boxed转包装类
        List<Integer> collect = Arrays.stream(myArray).boxed().collect(Collectors.toList());
    }



    public static void main(String[] args) {
        //list2Array();
        array2List();
    }
}
