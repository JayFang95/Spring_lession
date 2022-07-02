package com.jay;

import com.netflix.eureka.lease.Lease;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/7/1 14:23
 * @description eureka-server启动类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    public static void main(String[] args) {
        Lease<Object> lease = new Lease<>(new Object(), 1000);
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
