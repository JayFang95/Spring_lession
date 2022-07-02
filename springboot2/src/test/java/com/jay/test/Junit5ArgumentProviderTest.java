package com.jay.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 15:50
 * @description 参数化测试
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Junit5ArgumentProviderTest {

    /**
     * ValueSource
     * NullSource 提供一个null值
     * EnumSource
     * CsFileSource
     * MethodSource 获取方法返回值，必须时Stream流
     */
    @ParameterizedTest
    @ValueSource(strings = {"value1", "value2", "value3"})
    @DisplayName("参数化测试： @ValueSource")
    void testValueSource(String name){
        System.out.println(name);
    }

}
