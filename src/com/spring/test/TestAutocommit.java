package com.spring.test;

import com.spring.autocommit.serivce.IStudentSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAutocommit {

    @Resource(name = "studentSerivce")
    private IStudentSerivce  iStudentSerivce;

/**
 *
 */
        @Test
        public   void test(){
            iStudentSerivce.testUpdateAndAdd(1,2,1000F);

        }
}
