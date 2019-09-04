package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * 通知
 *
 * 前置通知
 后置通知
 异常通知
 最终通知
 环绕通知
 */

@Aspect
public class UsersAdvice {

    /**
     *配置的切入点expression
     */
    @Pointcut("execution(* com.spring.aop.dao.*.UsersImp.*(..))")
    public   void pc(){

    }

    /**
     * 前置通知
     */
    @Before("UsersAdvice.pc()")
    public   void    getBefore(){
        System.out.println("我的日志................. ");
        System.out.println("------------前置通知---------------------");
    }



    /**
     * 最终通知
     */
    @After("UsersAdvice.pc()")
    public   void    getAfter(){
        System.out.println("------------最终通知============");
    }


    /**
     * 环绕通知
     */
    @Around("execution(* com.spring.aop.dao.*.UsersImp.*(..))")
    public   Object    getAroud(ProceedingJoinPoint  point) throws Throwable {
        System.out.println("------------环绕通知---前============");

        Object proceed = point.proceed();//调用目标对象
        System.out.println("------------环绕通知---后============");
        return  proceed;
    }



    /**
     * 异常通知
     */
    @AfterThrowing("execution(* com.spring.aop.dao.*.UsersImp.*(..))")
    public   void    getException(){
        System.out.println("------------异常通知============");
    }


    /**
     * 后置通知
     */
    @AfterReturning("execution(* com.spring.aop.dao.*.UsersImp.*(..))")
    public   void    getAfterException(){
        System.out.println("------------后置通知============");
    }









}
