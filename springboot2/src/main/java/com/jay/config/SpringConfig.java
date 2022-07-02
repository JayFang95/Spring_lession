package com.jay.config;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.jay.interceptor.DemoInterceptor;
import com.sun.org.apache.bcel.internal.generic.NEW;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.Servlet;
import java.util.Arrays;
import java.util.Collections;


/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/29 19:59
 * @description 配置类
 * history
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Slf4j
@Configuration
public class SpringConfig implements WebMvcConfigurer {

    /**
     * // @EnableWebMvc 全面接管springMvc
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 配置拦截器信息
        registry.addInterceptor(new DemoInterceptor())
                .addPathPatterns("/demo/interceptor/**")
                .excludePathPatterns("/test","*.html");
    }

    /**
     * 配置servlet监控页
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        StatViewServlet servlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>(servlet, "/druid/*");
        registrationBean.addInitParameter("loginUsername","admin");
        registrationBean.addInitParameter("loginPassword","123456");
        return registrationBean;
    }

    /**
     * 用于采集web-jdbc关联监控数据
     */
    @Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter(){
        WebStatFilter filter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> registrationBean = new FilterRegistrationBean<>(filter);
        registrationBean.setUrlPatterns(Collections.singletonList("/*"));
        registrationBean.addInitParameter("exclusions", "*.js,*,gif,*.jpg,*.png,*.css,/druid/*");
        return registrationBean;
    }

}
