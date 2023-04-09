package springsourcecode.binarysearchtest;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest {

    public static void main(String[] args) {
        List list = Lists.newArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(9);
        Collections.sort(list);

        int i = Collections.binarySearch(list, 4);
        System.out.println(i);


        int[] arr = new int[]{2,3,1,4,5,6};
        Arrays.sort(arr);
        int i1 = Arrays.binarySearch(arr, 4);
        System.out.println(i1);

        List<List> lists = Collections.singletonList(list);
        List<List> lists1 = Collections.synchronizedList(list);
    }
}
