package com.springbook.biz.day01.ex02;

public class TVUser {
  public static void main(String[] args) {
    BeanFactory factory = new BeanFactory();
    TV tv = (TV) factory.getBean(args[0]);
    tv.powerOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.powerOff();
  }
}
