package com.ccclubs.ntsp.server.config;

import com.ccclubs.ntsp.server.interceptor.NtspAppInterceptor;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.config.NtspAppWebMvcConfig
 * @date: 2018-05-04 0:42
 * @des:
 */
public class NtspAppWebMvcConfig extends WebMvcConfigurerAdapter {
  /**
   * 跨域配置
   *
   * @param registry
   */
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins("*")
        .allowCredentials(true)
        .allowedMethods("GET", "POST", "DELETE", "PUT")
        .maxAge(3600);

  }

  /**
   * 拦截器配置
   *
   * @param registry
   */
  @Override
  public void addInterceptors(InterceptorRegistry registry) {
    WebContentInterceptor webContentInterceptor = new WebContentInterceptor();
    CacheControl nocache = CacheControl.noCache();
    webContentInterceptor.addCacheMapping(nocache, "/**");
    registry.addInterceptor(webContentInterceptor);
    //添加拦截器
    registry.addInterceptor(new NtspAppInterceptor()).addPathPatterns("/**");
    super.addInterceptors(registry);

  }

}
