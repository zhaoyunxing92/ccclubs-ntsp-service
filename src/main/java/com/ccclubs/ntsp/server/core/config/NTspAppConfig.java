package com.ccclubs.ntsp.server.core.config;

import com.ccclubs.ntsp.server.core.common.aspect.NtspAppAspect;
import org.springframework.context.annotation.Import;

/**
 * @author sunny
 * @class: NTspAppConfig
 * @date: 2018-05-03 11:14
 * @des: 配置模块
 */
@Import({SwaggerConfig.class, NtspAppWebMvcConfig.class, NtspAppAspect.class})
public class NTspAppConfig {
}
