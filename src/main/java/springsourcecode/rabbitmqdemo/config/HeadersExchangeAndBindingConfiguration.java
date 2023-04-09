package springsourcecode.rabbitmqdemo.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.HeadersExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class HeadersExchangeAndBindingConfiguration {

    @Bean(name = "myHeadersExchange")
    HeadersExchange getHeadersExchange(){
        return new HeadersExchange("My-Headers-Exchange");
    }

    /**
     * 将queue绑定至headersExchange（当headers中所有map都被此queue匹配时，才使用此队列）
     *
     * 接受消息中的MessageProperties中的map（keys）需要全部与绑定的map（keys）匹配
     *
     * @param myFirstQueue
     * @param myHeadersExchange
     * @return
     */
    @Bean
    Binding bindingQueueOneToHeadersAllExchange(@Qualifier("myFirstQueue")Queue myFirstQueue,
                                                @Qualifier("myHeadersExchange")HeadersExchange myHeadersExchange){
        Map<String, Object> map = new HashMap<>();
        map.put("国庆","day03");
        map.put("pm","14.30");
        return BindingBuilder.bind(myFirstQueue).to(myHeadersExchange).whereAll(map).match();
    }

    /**
     * 将queue绑定至headersExchange（当headers中任意一个map都被此queue匹配时，才使用此队列）
     *
     * 接受消息中的MessageProperties中的map（keys）至少含有绑定的map（keys）中的一个
     *
     * @param mySecondQueue
     * @param myHeadersExchange
     * @return
     */
    @Bean
    Binding bindingQueueTwoToHeadersAllExchange(@Qualifier("mySecondQueue")Queue mySecondQueue,
                                                @Qualifier("myHeadersExchange")HeadersExchange myHeadersExchange){
        Map<String, Object> map = new HashMap<>();
        map.put("国庆","day03");
        map.put("pm","14.30");
        return BindingBuilder.bind(mySecondQueue).to(myHeadersExchange).whereAny(map).match();
    }

    /**
     * 将queue绑定至headersExchange（当headers中任意一个map都被此queue匹配时，才使用此队列）
     *
     * 接受消息中的MessageProperties中的map（keys）需要全部与绑定的map（keys）匹配   可大于绑定的map（keys）
     *
     * @param myThirdQueue
     * @param myHeadersExchange
     * @return
     */
    @Bean
    Binding bindingQueueThreeToHeadersAllExchange(@Qualifier("myThirdQueue")Queue myThirdQueue,
                                                @Qualifier("myHeadersExchange")HeadersExchange myHeadersExchange){
        return BindingBuilder.bind(myThirdQueue).to(myHeadersExchange).whereAll("one","two","three").exist();
    }



}
