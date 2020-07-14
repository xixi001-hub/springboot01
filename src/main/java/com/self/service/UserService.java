package com.self.service;

import com.self.entity.User;
import com.self.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    @Resource
    UserMapper userMapper;

    public List<User> getList(){
        List<User> list = userMapper.getList();
        return list;
    }

}
