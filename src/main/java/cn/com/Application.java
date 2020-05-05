package cn.com;

import cn.com.util.BeanUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("cn.com.mapper")
public class Application extends SpringBootServletInitializer{
    public static void main(String args[]){
        SpringApplication.run(Application.class,args);
//        ConfigurableApplicationContext context = SpringApplication.run(Application.class);
//        BeanUtil.context=context;
    }

    //打包到服务器需要继承该初始化类
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }
}
