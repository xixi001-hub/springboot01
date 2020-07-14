package com.self;

import com.self.entity.User;
import com.self.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class SpringbootMainTest {

    @Autowired
    ApplicationContext ac;

    @Resource
    UserMapper userMapper;

    @Test
    public void test(){
        boolean b = ac.containsBean("userMapper");
        System.out.println(b);
    }

    @Test
    public void test2(){
        List<User> list = userMapper.getList();
        for(int i=0;i<list.size();i++){
            User user = list.get(i);
            System.out.println(user);
        }
    }

}
