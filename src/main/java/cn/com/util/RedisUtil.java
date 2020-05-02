package cn.com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class RedisUtil{
    @Autowired
    private RedisTemplate<String,String> template;
    //读取缓存
    public String  get(final String key){
        return template.opsForValue().get(key);
    }
    //存数据进缓存
    public boolean set(final String key,String value){
        boolean result = false;
        template.opsForValue().set(key,value);
        result = true;
        return result;
    }
    //更新缓存
    public boolean getAndSet(final String key,String value){
        boolean result=false;
        template.opsForValue().getAndSet(key,value);
        result=true;
        return result;
    }
    public boolean delete(final String key){
        boolean result=false;
        template.delete(key);
        result=true;
        return result;
    }
}
