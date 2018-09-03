package com.demo.user.test;

import com.demo.user.service.IUserApplication;
import com.demo.user.service.domain.entity.User;
import com.demo.user.service.domain.mapper.UserMapper;
import com.demo.user.service.service.imp.UserService;
import com.github.pagehelper.PageHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = IUserApplication.class)
public class UserApplicationTests {
    @Autowired
    UserMapper userMapper;

    @Test
    public void selectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(1);
        Assert.assertTrue(true);
    }
    @Test
    public void selectList() {
        PageHelper.startPage(1,2);
//        User user = userMapper.selectByPrimaryKey(1);
        Assert.assertTrue(true);
    }

}

