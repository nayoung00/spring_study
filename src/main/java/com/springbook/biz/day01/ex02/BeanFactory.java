package com.springbook.biz.day01.ex02;

public class BeanFactory {
  public Object getBean(String beanName) {
    if (beanName.equals("samsung")) {
      return new SamsungTV();
    } else if (beanName.equals("lg")) {
      return new LgTV();
    }
    return null;
  }

}
