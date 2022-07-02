package com.jay.demo;

import com.jay.aopDemo.TestDao;
import com.jay.demo.anno.TestService;
import com.jay.demo.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 9:07
 * @description 注解模式
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class TestDemo2 {

    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanDemo2.xml");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        TestService testService = applicationContext.getBean("testService", TestService.class);
        testService.test();
    }

}
