package com.jay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/29 15:51
 * @description 视图页面跳转
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Controller
public class PageController {

    @RequestMapping("to/test")
    public String toTestPage(MultipartFile file){
        return "123";
    }
    @RequestMapping("123")
    public String toPage2(){
        return "redirect:/test.html";
    }

    @RequestMapping("to/redirect")
    public String toPage(){
        return "redirect:/test.html";
    }

}
