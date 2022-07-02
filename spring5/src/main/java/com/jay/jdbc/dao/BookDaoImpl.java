package com.jay.jdbc.dao;

import com.jay.jdbc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 14:00
 * @description 数据连接实现
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int add(Book book) {
        String sql = "insert into book(id ,name , category, price) values (?, ?, ?, ?)";
        Object[] args = new Object[]{book.getId(), book.getName(), book.getCategory(), book.getPrice()};
        Integer count = jdbcTemplate.queryForObject("select count(*) from book", Integer.class);
        System.out.println("表中先有: " + count + " 条数据");

        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int update(Book book) {
        Book bk = jdbcTemplate.queryForObject("select * from book where id = ?", new BeanPropertyRowMapper<>(Book.class), 1);
        List<Book> list = jdbcTemplate.query("select * from book", new BeanPropertyRowMapper<>(Book.class));
        return 0;
    }
}
