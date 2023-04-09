package springsourcecode.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 */
@Configuration
public class DirectExchangeAndBindingConfiguration {


    /**
     * 注入Direct路由策略的交换机实例
     * @return
     */
    @Bean(name = "myDirectExchange")
    DirectExchange getDirectExchange(){
        return new DirectExchange("My-Direct-Exchange");
    }

    @Bean
    Binding bindingQueueToDirectExchange(@Qualifier("myFirstQueue")Queue myFirstQueue,
                                         @Qualifier("myDirectExchange")DirectExchange myDirectExchange){
        return BindingBuilder.bind(myFirstQueue).to(myDirectExchange).with("routingKey.First");
    }

}
