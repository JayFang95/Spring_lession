package com.jay;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 11:12
 * @description 自定义代码生成器
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
public class MyGenerator {

    private static final String URL = "jdbc:mysql://localhost:3306/monitor?serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8&useSSL=false&nullCatalogMeansCurrent=true";

    public static void main(String[] args) {
        FastAutoGenerator.create(URL, "root", "root")
                .globalConfig(builder -> {
                    builder.author("jay.fang") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .outputDir("E:\\dev\\IdeaProjects\\Spring_lession\\springboot2\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.jay.code") // 设置父包名
                            .moduleName("") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "E:\\dev\\IdeaProjects\\Spring_lession\\springboot2\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .addTablePrefix("t_", "c_") // 设置过滤表前缀
                            .entityBuilder().enableLombok();
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
