package springsourcecode.spring.source.rabbitmqtest;


import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import springsourcecode.SpringSourceCodeApplication;


@SpringBootTest(classes = {SpringSourceCodeApplication.class})
@ActiveProfiles("test")
public class rabbitmqTest {

    @Autowired
    AmqpTemplate amqpTemplate;

    @Test
    public void fanoutTest(){
        amqpTemplate.convertAndSend("My-Fanout-Exchange","","123");
    }


    @Test
    public void directTest(){
        amqpTemplate.convertAndSend("My-Direct-Exchange","routingKey.First","123454");
    }


    @Test
    public void topicTestOne(){
        amqpTemplate.convertAndSend("My-Topic-Exchange","routingKey.itsFirst","test1");
    }

    @Test
    public void topicTestTwo(){
        amqpTemplate.convertAndSend("My-Topic-Exchange","itsTwo.topic","test2");
    }

    @Test
    public void topicTestThree(){
        amqpTemplate.convertAndSend("My-Topic-Exchange","itsThree","test3");
    }


    @Test
    public void headersTestAll(){
        MessageProperties messageProperties = new MessageProperties();
        messageProperties.setHeader("国庆","day03");
        messageProperties.setHeader("pm","14.0");
        String messageString = "全部匹配";
        Message message = new Message(messageString.getBytes(), messageProperties);
        amqpTemplate.convertAndSend("My-Headers-Exchange","",message);
    }

    @Test
    public void headersTestAnyKeys(){
        MessageProperties messageProperties = new MessageProperties();
        String messageString = "全部匹配";
        messageProperties.setHeader("one","any1");
        messageProperties.setHeader("two","any2");
        messageProperties.setHeader("three","any3");
        messageProperties.setHeader("four","any4");
        messageProperties.setHeader("five","any5");
        Message message = new Message(messageString.getBytes(), messageProperties);
        amqpTemplate.convertAndSend("My-Headers-Exchange","",message);
    }
}
