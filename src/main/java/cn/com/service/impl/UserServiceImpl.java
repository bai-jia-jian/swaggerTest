package cn.com.service.impl;

import cn.com.mapper.UserMapper;
import cn.com.service.UserService;
import cn.com.vo.PageResult;
import cn.com.vo.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public PageResult<User> queryUserById(String id) {
        PageHelper.startPage(1,3);
        List<User> users = userMapper.queryUserById("1");
        PageInfo<User> info=new PageInfo<>(users);
        return new PageResult<>(info.getTotal(), users);
    }
}
