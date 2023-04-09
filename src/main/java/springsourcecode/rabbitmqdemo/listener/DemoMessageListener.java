package springsourcecode.rabbitmqdemo.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class DemoMessageListener {

    /**
     * 指定队列
     * @param message
     */
    @RabbitListener(queues = "My-First-Queue")
    public void firstConsumer(String message) {
        System.out.println("My-First-Queue:" + message);
    }

    @RabbitListener(queues = "My-Second-Queue")
    public void secondConsumer(String message) {
        System.out.println("My-Second-Queue:" + message);
    }

    @RabbitListener(queues = "My-Third-Queue")
    public void thirdConsumer(String message) {
        System.out.println("My-Third-Queue:" + message);
    }
}
