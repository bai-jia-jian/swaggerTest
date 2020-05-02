package cn.com.test;

import cn.com.service.UserService;
import cn.com.util.RedisUtil;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class RedisTest {

    /*@Autowired
    private RedisUtil redisUtil;
    @Test
    public void set(){
        redisUtil.set("tb","1111");
    }
    @Test
    public  void get(){
        String id = redisUtil.get("tb");
        System.out.print(id);
    }*/
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    UserService userService;

    /**
     * 测试redis
     */
    @Test
    public void test(){
//        stringRedisTemplate.opsForValue().set("qq","sdsd");
        redisTemplate.opsForValue().set(JSON.toJSONString("user"), JSON.toJSONString(userService.queryUserById("1")));
    }
}
