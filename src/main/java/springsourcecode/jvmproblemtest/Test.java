package springsourcecode.jvmproblemtest;

import com.google.common.collect.Lists;

import java.util.List;

public class Test {

    private static final Integer K = 1024;

    public static void main(String[] args) {
        int size = K * K * 8;
        List<byte[]> bytes = Lists.newArrayList();
        for (Integer i = 0; i < K; i++) {
            System.out.println("JVM写入数据"+(i+1)+"M");
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
            bytes.add(new byte[size]);
        }
    }
}
