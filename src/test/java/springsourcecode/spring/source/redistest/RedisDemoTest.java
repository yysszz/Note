package springsourcecode.spring.source.redistest;

import com.google.common.collect.Maps;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.test.context.ActiveProfiles;
import springsourcecode.SpringSourceCodeApplication;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest(classes = {SpringSourceCodeApplication.class})
@ActiveProfiles("test")
public class RedisDemoTest {

    @Autowired
    RedisTemplate redisTemplate;

    @BeforeEach
    public void setting(){
        this.redisTemplate.setKeySerializer(new StringRedisSerializer());
        this.redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        this.redisTemplate.setHashKeySerializer(new GenericJackson2JsonRedisSerializer());
        this.redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.afterPropertiesSet();
    }



    @Test
    public void stringTest1(){
        redisTemplate.delete("firstString");
        redisTemplate.delete("secondString");
        redisTemplate.opsForValue().set("firstString","qqqq");
        redisTemplate.opsForValue().set("secondString","wwww");
        System.out.println(redisTemplate.opsForValue().get("firstString"));
        System.out.println(redisTemplate.opsForValue().get("secondString"));
    }

    @Test
    public void stringTest2(){
        //获取并设置
//        redisTemplate.opsForValue().getAndSet("firstString","eeee");
//        redisTemplate.opsForValue().getAndSet("secondString","rrrr");
//        System.out.println(redisTemplate.opsForValue().get("firstString"));
//        System.out.println(redisTemplate.opsForValue().get("secondString"));



        //设置多个key-value
//        Map<String, String> map = Maps.newHashMap();
//        map.put("threeString","grrrrrr");
//        map.put("fourString","drrrrrr");
//        redisTemplate.opsForValue().multiSet(map);


        //获取多个key
//        System.out.println(redisTemplate.opsForValue().multiGet(map.keySet()));


        redisTemplate.opsForValue().set("num",1);
        redisTemplate.opsForValue().increment("num",666);
        System.out.println(redisTemplate.opsForValue().get("num"));
    }

    @Test
    public void listTest(){

    }
}
