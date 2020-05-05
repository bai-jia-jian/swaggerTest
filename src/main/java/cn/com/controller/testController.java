package cn.com.controller;

import cn.com.service.UserService;
import cn.com.util.RedisUtil;
import cn.com.vo.PageResult;
import cn.com.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/test")
public class testController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtil redisUtil;

//    @ResponseBody
    @RequestMapping("/hello")
    public String test(@RequestParam(value = "id") String id, Model model){
        model.addAttribute("ss","1");
        PageResult<User> list = userService.queryUserById(id);
//        redisUtil.set("tb",user.toString());
//        BeanController con=new BeanController();
//        String bean = con.getBean("1");
        return "index";
    }
    @RequestMapping("/fuck")
    public String fuck(Model model,@RequestParam(value = "id") String id){
        User user =new User();
        user.setName("测试");
        model.addAttribute("user", user);
        model.addAttribute("ss","2222");
        return "main";
    }
}
