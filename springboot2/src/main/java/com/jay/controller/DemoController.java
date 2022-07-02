package com.jay.controller;

import com.jay.entity.Person;
import com.jay.entity.UserInfo;
import com.jay.service.HelloService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/28 15:25
 * @description 模拟rest请求
 *  表单模式提交，添加隐藏属性_method,值对应需要的请求方法，form必须是post提交_method才可以生效
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@RestController
public class DemoController {

    private Counter counter;
    public DemoController(MeterRegistry registry){
        counter = registry.counter("test.sql.count");
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private Person person;
    @Autowired
    private UserInfo user;

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getMethod(){
        return "getMethod 方法" + helloService.sayHello("GET方法");
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String postMethod(){
        return "postMethod 方法";
    }

    @RequestMapping(value = "/test", method = RequestMethod.PUT)
    public String putMethod(){
        return "putMethod 方法";
    }

    @RequestMapping(value = "/test", method = RequestMethod.DELETE)
    public String deleteMethod(){
        return "deleteMethod 方法";
    }

    @RequestMapping("test/{id}/{name}")
    public Map<String, Object> getPathValue(@PathVariable("id") int id,
                                            @PathVariable("name") String name,
                                            @PathVariable Map<String, Object> map
                                            ){
        Map<String, Object> hashMap = new HashMap<>(16);
        hashMap.put("id", id);
        hashMap.put("name", name);
        hashMap.put("pv", map);
        hashMap.put("person", person);
        hashMap.put("user", user);
        return hashMap;
    }

    @RequestMapping("test/sql")
    public void testSql(){
        counter.increment();
        Long aLong = jdbcTemplate.queryForObject("select count(*) from user", Long.class);
        System.out.println(aLong + "");
    }

}
