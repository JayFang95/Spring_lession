package com.jay.hidicator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 16:38
 * @description 自定义健康检查信息
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Component
public class MyCustomHealthIndicator extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        // 查询检查一些组件运行状况
        HashMap<String, Object> map = new HashMap<>(16);
        if (getBool()){
            builder.up();
            map.put("mongoDB", "UP");
            map.put("mysql", "UP");
            map.put("redis", "UP");
            map.put("code", 1001);
        }else {
            builder.status(Status.OUT_OF_SERVICE);
            map.put("mongoDB", "UP");
            map.put("mysql", "UP");
            map.put("redis", "DOWN");
            map.put("code", 2001);
        }
        builder.withDetail("result", "finish").withDetails(map);
    }

    private static boolean getBool(){
        return Math.random() * 10 > 5;
    }
}
