package com.jay.demo;

import com.jay.pojo.Student;
import com.jay.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/24 14:49
 * @description 测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class TestDemo {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanDemo.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
        user.printName();
        System.out.println();

        Student student = applicationContext.getBean("student", Student.class);
    }

}
