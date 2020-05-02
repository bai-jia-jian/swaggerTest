package cn.com.controller;

import cn.com.service.UserService;
import cn.com.util.BeanUtil;
import org.springframework.web.bind.annotation.RequestParam;

public class BeanController {
    public String getBean(@RequestParam(value = "id") String id){
        UserService userService= BeanUtil.getBean(UserService.class);
        userService.queryUserById("1");
        return null;
    }
}
