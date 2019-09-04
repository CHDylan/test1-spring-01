package com.spring.test;

import com.spring.pojo.Person;
import com.spring.pojo.Users;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUsrs {

    @Test
    public   void test05(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) classPathXmlApplicationContext.getBean("perosn02");
        System.out.println(person);


    }

    @Test
    public   void test04(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Users users = (Users) classPathXmlApplicationContext.getBean("users03");
        System.out.println(users);


    }
    @Test
    public   void test03(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Users users = (Users) classPathXmlApplicationContext.getBean("users02");
        System.out.println(users);


    }

    @Test
    public   void test02(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Users users = (Users) classPathXmlApplicationContext.getBean("users01");
        System.out.println(users);


    }

    /**
     *
     */
    @Test
    public   void test01(){
        ClassPathXmlApplicationContext classPathXmlApplicationContext
                = new ClassPathXmlApplicationContext("applicationContext.xml");

        Users users = (Users) classPathXmlApplicationContext.getBean("users");
        System.out.println(users);


    }




    /**
     *
     */
   public   void test(){
        Users users = new Users();
        users.setAge(11);//这些设置参数值，之前是程序员完成，spring帮我我设置参数
}

}
