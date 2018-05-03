package com.ccclubs.ntsp.server.config;

import org.springframework.context.annotation.Import;

/**
 * @author sunny
 * @class: NTspAppConfig
 * @date: 2018-05-03 11:14
 * @des: 配置模块
 */
@Import({SwaggerConfig.class, NtspAppWebMvcConfig.class})
public class NTspAppConfig {
}
