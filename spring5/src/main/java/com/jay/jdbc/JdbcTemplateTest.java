package com.jay.jdbc;

import com.jay.jdbc.pojo.Book;
import com.jay.jdbc.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 14:18
 * @description JDBC测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class JdbcTemplateTest {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcDemo.xml");
        BookService service = context.getBean("bookServiceImpl", BookService.class);
        Book book = new Book();
        book.setId(1).setName("mysql").setCategory("Java").setPrice(new BigDecimal("50.25"));
        int add = service.add(book);
        System.out.println("操作结果： " + add);
    }

}
