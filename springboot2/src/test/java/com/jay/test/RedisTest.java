package com.jay.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 14:15
 * @description redis测试类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
//@RunWith(SpringRunner.class) //springboot2.4及以上时不需要了
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisTemplate<String ,String> stringRedisTemplate;
    @Autowired
    private RedisConnectionFactory redisConnectionFactory;

    @Test
    public void contextLoads(){

    }

    @Test
    public void test01(){
        stringRedisTemplate.opsForValue().set("testKey", "testValue");
        System.out.println(redisConnectionFactory);
    }

}
