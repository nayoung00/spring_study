package com.springbook.biz.day02.common;

public class AfterReturningAdvice {
  public void afterLog() {
    System.out.println("[사후 처리] 비즈니스 로직 수행 후 동작");
  }

}
