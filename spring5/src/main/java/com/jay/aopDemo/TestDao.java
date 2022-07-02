package com.jay.aopDemo;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 10:02
 * @description 接口测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public interface TestDao {

    /**
     * 新增
     *
     * @description
     * @author jing.fang
     * @date 2022/6/27 10:02
     * @param a a
     * @param b b
     **/
    void add(int a, int b);

    /**
     * todo
     *
     * @description
     * @author jing.fang
     * @date 2022/6/27 11:03
     **/
    void testAop();
}
