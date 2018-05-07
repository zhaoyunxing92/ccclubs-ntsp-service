package com.ccclubs.ntsp.server.core.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.core.config.interceptor.NtspAppInterceptor
 * @date: 2018-05-04 0:34
 * @des: controller层拦截器
 */
public class NtspAppInterceptor implements HandlerInterceptor {
  private static final String[] EXCLUDES = {/*"/swagger-resources", "/configuration/security", "/v2/api-docs", "/configuration/ui",*/"/pay","/error","/example"};

  @Override
  public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
    String path = req.getServletPath();
    if (isInterceptor(path)) {
      res.setContentType("application/json; charset=utf-8");
      res.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
      res.getWriter().write("请先登录吧！");
      return false;
    } else {
      return true;
    }
  }


  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

  }

  /**
   * 是否拦截path ,默认都拦截
   *
   * @param path
   * @return
   */
  private boolean isInterceptor(String path) {
    for (String exclude : EXCLUDES) {
      if (path.startsWith(exclude)) {
        return false;
      }
    }
    return true;
  }
}
