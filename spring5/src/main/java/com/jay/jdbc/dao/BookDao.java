package com.jay.jdbc.dao;

import com.jay.jdbc.pojo.Book;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 13:56
 * @description 数据连接层
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface BookDao {
    /**
     * 添加
     *
     * @description 添加
     * @author jing.fang
     * @date 2022/6/27 14:07
     * @param book book
     * @return int
    **/
    int add(Book book);

    /**
     * 修改
     *
     * @description 修改
     * @author jing.fang
     * @date 2022/6/27 14:07
     * @param book book
     * @return int
     **/
    int update(Book book);
}
