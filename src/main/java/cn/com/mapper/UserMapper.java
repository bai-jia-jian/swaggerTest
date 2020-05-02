package cn.com.mapper;

import cn.com.vo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
   /* @Select("select * from user where id=#{id}")
    User queryUserById(String id);*/

    List<User> queryUserById(String id);
}
