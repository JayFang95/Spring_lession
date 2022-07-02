package com.jay.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/29 20:15
 * @description 自定义数据源配置类
 * 可以使用和spring boot整合的starter
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Deprecated
//@Configuration
public class MyDatasourceConfig {

    /**
     * 默认的自动配置时当没有Datasource类时生效
     * 默认的数据库连接池时HikariDatasource
     */
    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource ds = new DruidDataSource();
        // 开启监控 stat http://localhost:8888/druid/sql.html
        // 开启防火墙 wall
        ds.setFilters("stat, wall");
        return ds;
    }

}
