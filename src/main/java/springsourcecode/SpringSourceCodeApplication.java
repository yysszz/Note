package springsourcecode;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @SpringBootConfiguration 扫当前包及其子包
 */
//@EnableRabbit
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringSourceCodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSourceCodeApplication.class,args);
    }
}
