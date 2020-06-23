package com.springbook.biz.day01.ex01;

public class TVUser {
  public static void main(String[] args) {
    TV tv = new SamsungTV();
    tv.powerOn();
    tv.volumeUp();
    tv.volumeDown();
    tv.powerOff();
  }
}
