package com.jay.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 17:03
 * @description 自定义端点
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Component
@Endpoint(id = "customPoint")
public class CustomEndPoint {

    @ReadOperation
    public Map<String, String> getInfo(){
        return Collections.singletonMap("redis", "redis working");
    }

    @WriteOperation
    public void setInfo(){
        System.out.println("设置参数值。。。");
    }

}
