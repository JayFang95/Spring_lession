package com.jay.aopDemo;


import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 10:04
 * @description aop简单测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class AopTest {

    @Test
    public void test01(){
        TestDao proxyInstance = (TestDao)Proxy.newProxyInstance(AopTest.class.getClassLoader(),
                new Class[]{TestDao.class},
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("代理前。。。");
                //执行源方法
                System.out.println("代理后。。。");
                return 1;
            }
        });
        proxyInstance.add(1, 2);
    }

}
