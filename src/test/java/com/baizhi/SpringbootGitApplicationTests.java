package com.baizhi;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootGitApplicationTests {
    @Autowired
    /* private UserDao userDao;*/
    private UserMapper userMapper;

    @Test
    public void test1() {
        List<User> list = userMapper.selectAll();
        for (User user : list) {
            System.out.println(user);
        }
    }

}
