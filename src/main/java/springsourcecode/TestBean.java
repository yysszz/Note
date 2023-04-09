package springsourcecode;

import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean implements ApplicationContextAware {
    
    private String name;
    
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public TestBean(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private ApplicationContext applicationContext;

    @Override
    public String toString() {
        return "TestBean Created!";
    }

    public static TestBean createTestBean(){
        return new TestBean();
    }

    public TestBean(){};

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beanconfig/bean.xml");
        TestBean testBean = (TestBean)applicationContext.getBean("TestBean");
        System.out.println(testBean.toString());

        TestBean testBean1 = (TestBean)testBean.applicationContext.getBean("TestBean");
        System.out.println("1" + testBean1.toString());
        System.out.println(testBean == testBean1);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
