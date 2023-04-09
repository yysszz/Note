package springsourcecode.problem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ProblemTest {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5);
//        integers.add(10);
        System.out.println(integers);

        String[] strings = new String[]{"1","3","5"};
        List<String> list = Arrays.asList(strings);
        System.out.println(list);
        strings[0] = "9";
        System.out.println(list);
    }


    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 1 && nums[0] == k){
            return nums[0];
        }
        int head = nums[0];
        int tail = nums[nums.length - 1];
        int mid = nums[nums.length/2];

        return 1;
    }

    private static String getMonthBegin(String specifiedDay) {
        Date data = null;
        try {
            data = new SimpleDateFormat("yyyy-MM").parse(specifiedDay);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(data);
        //设置为1号,当前日期既为本月第一天
        c.set(Calendar.DAY_OF_MONTH, 1);
        // 本月第一天的时间戳转换为字符串
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(sdf.format(new Date(new Long(c.getTimeInMillis()))));
            //Date date = sdf.parse(sdf.format(new Long(s)));// 等价于
            return sdf.format(date);
        } catch (NumberFormatException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO 自动生成的 catch 块
            e.printStackTrace();
        }
        return null;
    }

}
