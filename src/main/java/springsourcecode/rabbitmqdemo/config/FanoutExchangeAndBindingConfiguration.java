package springsourcecode.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * fanout路由策略（广播策略）的交换机注入，Queue与Exchange的绑定注入
 */
@Configuration
public class FanoutExchangeAndBindingConfiguration {


    /**
     * 注入Fanout策略的交换机实例
     * @return 实例
     */
    @Bean(name = "myFanoutExchange")
    FanoutExchange getFanoutExchange(){
        //创建并返回fanoutExchange交换器
        return new FanoutExchange("My-Fanout-Exchange");
    }

    /**
     * 将myFirstQueue队列绑定到myFanoutExchange交换机
     * @param myFirstQueue
     * @param myFanoutExchange
     * @return
     */
    @Bean
    Binding bindingQueueOneToFanoutExchange(@Qualifier("myFirstQueue")Queue myFirstQueue,
                                            @Qualifier("myFanoutExchange")FanoutExchange myFanoutExchange){
        return BindingBuilder.bind(myFirstQueue).to(myFanoutExchange);
    }

    /**
     * 将mySecondQueue队列绑定到myFanoutExchange交换机
     * @param mySecondQueue
     * @param myFanoutExchange
     * @return
     */
    @Bean
    Binding bindingQueueTwoToFanoutExchange(@Qualifier("mySecondQueue")Queue mySecondQueue,
                                            @Qualifier("myFanoutExchange")FanoutExchange myFanoutExchange){
        return BindingBuilder.bind(mySecondQueue).to(myFanoutExchange);
    }

    /**
     * 将myThirdQueue队列绑定到myFanoutExchange交换机
     * @param myThirdQueue
     * @param myFanoutExchange
     * @return
     */
    @Bean
    Binding bindingQueueThreeToFanoutExchange(@Qualifier("myThirdQueue")Queue myThirdQueue,
                                            @Qualifier("myFanoutExchange")FanoutExchange myFanoutExchange){
        return BindingBuilder.bind(myThirdQueue).to(myFanoutExchange);
    }
}
