package com.ccclubs.ntsp.server.config;

import com.ccclubs.ntsp.server.config.interceptor.NtspAppInterceptor;
import com.google.gson.GsonBuilder;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.WebContentInterceptor;

import java.util.List;

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

  @Bean
  public HttpMessageConverters gsonJsonHttpMessageConverters() {

    GsonHttpMessageConverter gsonHttpMessageConverter = new GsonHttpMessageConverter();
    GsonBuilder gsonBuilder = new GsonBuilder();
    gsonBuilder.setDateFormat("yyyy-MM-dd HH:mm:ss");
    gsonHttpMessageConverter.setGson(gsonBuilder.create());
    return new HttpMessageConverters(gsonHttpMessageConverter);
  }
}
