package springsourcecode.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author
 */
@Configuration
public class QueueConfiguration {

    /**
     * 注入第一个队列实例
     * @return
     */
    @Bean(name = "myFirstQueue")
    public Queue getFirstQueue(){
        return new Queue("My-First-Queue");
    }

    @Bean(name = "mySecondQueue")
    public Queue getSecondQueue(){
        return new Queue("My-Second-Queue");
    }

    @Bean(name = "myThirdQueue")
    public Queue getThirdQueue(){
        return new Queue("My-Third-Queue");
    }
}
