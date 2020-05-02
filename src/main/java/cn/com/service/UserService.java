package cn.com.service;

import cn.com.vo.PageResult;
import cn.com.vo.User;

public interface UserService {
    PageResult<User> queryUserById(String id);
}
