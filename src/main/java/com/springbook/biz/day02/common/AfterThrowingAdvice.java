package com.springbook.biz.day02.common;

import org.aspectj.lang.JoinPoint;

public class AfterThrowingAdvice {
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
