package com.jay.demo.anno;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/27 9:09
 * @description 测试注解
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Component
public class TestService {

    public void test(){
        System.out.println("test...");
    }
}
