package springsourcecode.rabbitmqdemo.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicExchangeAndBindingConfiguration {

    /**
     * 注入myTopicExchange实例
     * @return
     */
    @Bean(name = "myTopicExchange")
    TopicExchange getTopicExchange(){
        return new TopicExchange("My-Topic-Exchange");
    }

    /**
     * 将myFirstQueue绑定至myTopicExchange，并指定路由键为"routingKey.#"
     * 即：此交换器中，路由键以"routingKey."开头的Queue将被匹配到
     * @param myFirstQueue
     * @param myTopicExchange
     * @return
     */
    @Bean
    Binding bindingQueueOneToTopicExchange(@Qualifier("myFirstQueue")Queue myFirstQueue,
                                           @Qualifier("myTopicExchange")TopicExchange myTopicExchange){
        return BindingBuilder.bind(myFirstQueue).to(myTopicExchange).with("routingKey.#");
    }

    /**
     * 将mySecondQueue绑定至myTopicExchange，并指定路由键为"#.topic"
     * 即：此交换器中，路由键以".topic"结尾的Queue将被匹配到
     * @param mySecondQueue
     * @param myTopicExchange
     * @return
     */
    @Bean
    Binding bindingQueueTwoToTopicExchange(@Qualifier("mySecondQueue")Queue mySecondQueue,
                                           @Qualifier("myTopicExchange")TopicExchange myTopicExchange){
        return BindingBuilder.bind(mySecondQueue).to(myTopicExchange).with("#.topic");
    }

    /**
     * 将myThirdQueue绑定至myTopicExchange，并指定路由键为"#"
     * 即：此交换器中，任何queue都将被匹配到
     * @param myThirdQueue
     * @param myTopicExchange
     * @return
     */
    @Bean
    Binding bindingQueueThreeToTopicExchange(@Qualifier("myThirdQueue")Queue myThirdQueue,
                                           @Qualifier("myTopicExchange")TopicExchange myTopicExchange){
        return BindingBuilder.bind(myThirdQueue).to(myTopicExchange).with("#");
    }
}
