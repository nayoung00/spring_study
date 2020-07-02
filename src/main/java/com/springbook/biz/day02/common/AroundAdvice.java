package com.springbook.biz.day02.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;
import org.springframework.util.StopWatch;

@Service
@Aspect
public class AroundAdvice {
  @Pointcut("execution(* com.springbook.biz.day02..*Impl.*(..))")
  public void allPointcut() {}

  @Around("allPointcut()")
  // Around메소드에서만 JoinPoint가 아닌 ProceedingJoinPoint 객체를 매개변수로 받는다.
  public Object aroundLog(ProceedingJoinPoint pjp) throws Throwable {
    String method = pjp.getSignature().getName();

    StopWatch stopWatch = new StopWatch();
    stopWatch.start();

    Object obj = pjp.proceed();

    stopWatch.stop();
    System.out.println(method + "()메소드 수행에 걸린 시간: " + stopWatch.getTotalTimeMillis() + "(ms)초");
    return obj;
  }

}
