package com.spring.aop.dao.imp;

import com.spring.aop.dao.IUsers;

public class UsersImp implements IUsers {


    @Override
    public void save() {

        //System.out.println(1 / 0);
        //不能在调用日志的方
        System.out.println("执行的添加方法");
    }

    @Override
    public void del() {
        System.out.println("执行的删除方法");
    }
}


