package cn.com;

import cn.com.util.BeanUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("cn.com.mapper")
public class Application {
    public static void main(String args[]){
        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
        BeanUtil.context=context;
    }
}
