package com.ccclubs.ntsp.server.core.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author sunny
 * @class: com.ccclubs.ntsp.server.core.common.aspect.NtspAppAspect
 * @date: 2018-05-07 12:29
 * @des:
 */
@Aspect
public class NtspAppAspect {
  @Pointcut("execution(* com.ccclubs.ntsp.server.controller..*.*(..))")
  public void declareControllerJoinPointExpression() {

  }

  // 前置通知：目标方法开始前执行
  @Before(value = "declareControllerJoinPointExpression()", argNames = "joinPoint")
  public void beforeMethod(JoinPoint joinPoint) {
    Signature signature = joinPoint.getSignature();
    Class<?> clazz = signature.getDeclaringType();
    MethodSignature methodSignature = (MethodSignature) signature;
    Method method = methodSignature.getMethod();
    String methodName = clazz.getName() + "." + method.getName();
    System.out.println(">>>>  " + methodName);

  }

}
