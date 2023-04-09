package springsourcecode.spring.source.code;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest()
@ActiveProfiles("test")
class CodeApplicationTests {

//    @Autowired
//    private ConcurrentHashMap<String, AutowiredTest> testMap;
//    private RedisTemplate redisTemplate;

//    @Autowired
//    private void setRedisTemplate(RedisTemplate redisTemplate){
////        RedisConnectionFactory jedisConnectionFactory = new JedisConnectionFactory();
//        this.redisTemplate = redisTemplate;
////        RedisSerializer redisSerializer = new StringRedisSerializer();
////        this.redisTemplate.setKeySerializer(redisSerializer);
////        this.redisTemplate.setValueSerializer(redisSerializer);
////        this.redisTemplate.setHashKeySerializer(redisSerializer);
////        this.redisTemplate.setHashValueSerializer(redisSerializer);
//    }

//    @BeforeAll
//    public void initial(){
//        RedisSerializer redisSerializer = new StringRedisSerializer();
//        redisTemplate.setKeySerializer(redisSerializer);
//        redisTemplate.setValueSerializer(redisSerializer);
//        redisTemplate.setHashKeySerializer(redisSerializer);
//        redisTemplate.setHashValueSerializer(redisSerializer);
//    }

//    @Test
//    public void redisTest(){
////        redisTemplate.boundValueOps("key2:test").set("{value2:test}");
////        String key1 = (String)redisTemplate.boundValueOps("key2:test").get();
////        System.out.println(key1);
//
////        redisTemplate.opsForValue().set("opsKey1","opsValue1");
////        String opsKey1 = (String)redisTemplate.opsForValue().get("opsKey1");
////        System.out.println(opsKey1);
//
//        redisTemplate.opsForValue().set("opsKey2","opsValue2");
//        String opsKey1 = (String)redisTemplate.opsForValue().get("opsKey2");
//        System.out.println(opsKey1);
//    }

    @Test
    public void redisListTest(){

    }

//    @Test
//    void contextLoads() {
//        testMap.forEach((s, autowiredTest) -> System.out.println(s +"" + autowiredTest));
//    }

}
