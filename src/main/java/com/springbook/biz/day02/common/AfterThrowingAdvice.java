package com.springbook.biz.day02.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class AfterThrowingAdvice {
  @Pointcut("eecution(*com.springbook.biz.day02..*Impl.*(..))")
  public void allPointcut() {}

  @AfterThrowing(pointcut = "allPointcut()", throwing = "exceptObj")
  public void exceptionLog(JoinPoint jp, Exception exceptObj) {
    String method = jp.getSignature().getName();
    System.out.println("[예외 처리]" + method + "()메소드 수행 중 발생된 예외 메시지 :" + exceptObj.getMessage());

    if (exceptObj instanceof IllegalArgumentException) {
      System.out.println("부적절한 값이 입력되었습니다.");
    } else if (exceptObj instanceof NumberFormatException) {
      System.out.println("숫자 형식의 값이 아닙니다.");
    } else if (exceptObj instanceof Exception) {
      System.out.println("문제가 발생했습니다.");
    }
  }

}