package cn.com.util;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class BeanUtil {
    public static ConfigurableApplicationContext context;
    public static <T> T getBean(Class<T> t){
        return context.getBean(t);
    }
}
