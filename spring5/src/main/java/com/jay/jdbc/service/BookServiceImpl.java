package com.jay.jdbc.service;

import com.jay.jdbc.dao.BookDao;
import com.jay.jdbc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 14:00
 * @description 服务实现
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public int add(Book book){
        return bookDao.add(book);
    }

    @Override
    public int update(Book book){
        return bookDao.update(book);
    }


}
