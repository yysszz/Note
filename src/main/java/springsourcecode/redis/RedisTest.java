//package springsourcecode.redis;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//
//public class RedisTest {
//
//    @Autowired
//    private static RedisTemplate<String, Object> redisTemplate = new RedisTemplate();
//
//    public static void main(String[] args) {
//        redisTemplate.opsForValue().set("key1","value1");
//
//        String key1 = (String)redisTemplate.opsForValue().get("key1");
//        String key = (String)redisTemplate.opsForValue().get("key1");
//        System.out.println(key);
//        System.out.println(key1);
//    }
//
//}
