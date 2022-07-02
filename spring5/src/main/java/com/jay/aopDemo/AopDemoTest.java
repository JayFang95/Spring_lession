package com.jay.aopDemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 11:14
 * @description aop测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class AopDemoTest {

    @Test
    public void testAop01(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AopConfig.class);
        TestDao testDao = applicationContext.getBean("testDaoImpl", TestDao.class);
        testDao.testAop();
    }
}
