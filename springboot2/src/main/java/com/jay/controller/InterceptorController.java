package com.jay.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/29 20:26
 * @description 测试自定义拦截器
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
@RequestMapping("demo")
public class InterceptorController {

    @RequestMapping("interceptor/test")
    public String testInterceptor(){
        return "hello interceptor";
    }

}
