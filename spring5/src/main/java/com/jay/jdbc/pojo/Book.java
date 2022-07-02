package com.jay.jdbc.pojo;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 13:57
 * @description 书籍对象
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Data
@ToString
@Accessors(chain = true)
public class Book {

    private int id;
    private String name;
    private String category;
    private BigDecimal price;
    private Date createTime;

}
