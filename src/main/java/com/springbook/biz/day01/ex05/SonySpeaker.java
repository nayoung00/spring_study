package com.springbook.biz.day01.ex05;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker {
  public SonySpeaker() {
    System.out.println("====> SonySpeaker 객체생성");
  }

  @Override
  public void volumUp() {
    System.out.println("SonySpeaker--소리 올린다.");
  }

  @Override
  public void volumDown() {
    System.out.println("sonSpeaker--소리 내린다.");
  }

}
