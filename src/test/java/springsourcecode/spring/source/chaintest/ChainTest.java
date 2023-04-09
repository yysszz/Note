package springsourcecode.spring.source.chaintest;

import com.sun.management.OperatingSystemMXBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springsourcecode.designpatterns.chainsofresponsibility.exp2.ChainPartternDemo;
import springsourcecode.SpringSourceCodeApplication;

import java.lang.management.ManagementFactory;

@SpringBootTest(classes = {SpringSourceCodeApplication.class})
@ActiveProfiles("test")
public class ChainTest {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    ChainPartternDemo chainPartternDemo;

    @Test
    public void  test(){
        chainPartternDemo.exec(null,null);
    }


    @Test
    public void testLogBug(){
        String res = "{jndi:Hello,World!}";
        logger.info("op=end_test,res={}",res);
    }

    @Test
    public void testSys(){
        OperatingSystemMXBean operatingSystemMXBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
//                = ManagementFactory.getOperatingSystemMXBean();
                ;
        System.out.println(operatingSystemMXBean.getProcessCpuLoad());

    }
}
