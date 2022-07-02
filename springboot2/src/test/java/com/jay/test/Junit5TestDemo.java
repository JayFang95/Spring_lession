package com.jay.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 14:54
 * @description junit5测试
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Slf4j
@DisplayName("junit5注解测试")
//@SpringBootTest 启动springboot容器
public class Junit5TestDemo {

    /**
     * @BootstrapWith(SpringBootTestContextBootstrapper.class)
     * @ExtendWith(SpringExtension.class)
     */


//    @BeforeEach
    @DisplayName("方法执行前")
    void beforeEach(){
        log.info("单个方法执行前。。。");
    }

//    @AfterEach
    @DisplayName("方法执行后")
    void afterEach(){
        log.info("单个方法执行后。。。");
    }

//    @BeforeAll
    @DisplayName("所有方法执行前")
    static void allBefore(){
        log.info("所有方法执行前。。。");
    }

//    @AfterAll
    @DisplayName("所有方法执行后")
    static void allAfter(){
        log.info("所有方法执行后。。。");
    }

    @Test
    @DisplayName("test01方法")
    void test01(){
        log.info("测试方法：{}", "test01");
    }

    @Test
    @DisplayName("test02方法")
    void test02(){
        log.info("测试方法：{}", "test02");
    }

    @Test
    @Timeout(unit = TimeUnit.MILLISECONDS, value = 1000)
    @DisplayName("方法超时测试")
    void testTimeOut() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(500);
        log.info("超时方法下执行完成");
    }

    @Test
    @Disabled
    @DisplayName("Disabled方法测试")
    void testDisable(){
        System.out.println("disable方法测试");
    }

    @RepeatedTest(3)
    @DisplayName("方法重复测试")
    void testRepeated(){
        System.out.println("RepeatedTest方法测试");
    }

    @Test
    @DisplayName("简单断言方法测试")
    void testSimpleAssert(){
        assertEquals(2, 2, "判断是否相等失败");
        assertSame(1, 1, "判断对象是否相同失败");
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2}, "判断数组内容是否相同1"); // 对应位置元素相同
        assertTrue(this::getBool, "判断结果是否为true");
        assertNull(null, "判断对象是否为null");
        assertAll("测试",
                () -> assertTrue(this::getBool, "全部测试1错误"),
                () -> assertEquals(2, 2, "全部测试2错误"));
        log.info("所有断言执行成功");
    }

    @Test
    @DisplayName("异常断言方法测试")
    void testExceptionAssert(){
        // 断定业务一定会有异常
        assertThrows(ArithmeticException.class, () -> {
            int i = 10 / 0;
        }, "数学运算居然成功");
        log.info("异常断言执行成功");
    }

    @Test
    @DisplayName("测试失败")
    void testFail(){
        if (!getBool()){
            fail("判定成功失败了,程序结束");
        }
        log.info("测试失败执行失败");
    }

    @Test
    @DisplayName("测试前置条件")
    void testAssumptions(){
        Assumptions.assumeTrue(this::getBool, "测试前置条件失败");
        log.info("测试前置条件成功");
    }

    private boolean getBool(){
        double a = 11;
        double b = Math.random() * 10 ;
        return a > b;
    }

}
