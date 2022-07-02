package com.jay.hidicator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * Copyright(c),2018-2021,合肥市鼎足空间技术有限公司
 *
 * @author jing.fang
 * @date 2022/6/30 16:40
 * @description 应用信息
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
@Component
public class AppInfoIndicator implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("应用名称", "springboot2测试")
                .withDetail("应用版本号", "1.0.0")
                .withDetail("开发时间", "2022-06-30 17：00：00")
                .withDetail("使用权限", "仅限个人学习测试");
    }

}
