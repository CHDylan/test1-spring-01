package com.spring.test;

import com.spring.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

//帮助我们创建容器
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringJuntTest {

    @Resource(name = "users02")
    private Users  users;


    /**
     *
     */
    @Test
    public   void test(){
        System.out.println(users);


    }
}
