package com.jay.pojo;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/24 16:14
 * @description 学生类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class Student {

    private int id;
    private String name;

    private static int no;

    static {
        System.out.println("调用了静态代码块。。。");
    }

    public static void test(){
        System.out.println("调用了静态方法。。。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("设置bean属性:" + name);
    }

    public Student() {
        System.out.println("调用了构造方法。。。");
    }

    public void initMethod(){
        System.out.println("调用了初始化方法。。。");
    }

}
