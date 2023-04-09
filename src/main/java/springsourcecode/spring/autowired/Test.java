package springsourcecode.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    @Autowired
    private ConcurrentHashMap<String,AutowiredTest> testMap;

    public static void main(String[] args) {
        Test test = new Test();
        test.test();
    }

    void test(){
        for (Map.Entry<String, AutowiredTest> entry : testMap.entrySet()) {
            System.out.println(entry.getKey()+entry.getKey());
        }
    }
}
