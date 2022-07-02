package com.jay.aopDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 11:04
 * @description 创建代理
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Component
@Aspect
public class TestDaoAop {

    @Pointcut(value = "execution(* com.jay.aopDemo.TestDaoImpl.*(..))")
    public void aopPj(){}

    @Before("aopPj()")
    public void before(){
        System.out.println("before ...");
    }

    @After("aopPj()")
    public void after(){
        System.out.println("after ...");
    }

    @Around("aopPj()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before ...");
        Object o = pjp.proceed();
        System.out.println("around after ...");
        return o;
    }

}
