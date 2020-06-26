package com.springbook.biz.day01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV {
  @Autowired
  private Speaker speaker;

  public LgTV() {
    System.out.println("===> LgTV 객체 생성");
  }

  @Override
  public void powerOn() {
    System.out.println("LgTV---전원 켠다.");
  }

  @Override
  public void powerOff() {
    System.out.println("LgTV---전원 끈다.");
  }

  @Override
  public void volumeUp() {
    System.out.println("LgTV---소리 올린다.");
  }

  @Override
  public void volumeDown() {
    System.out.println("LgTV---소리 내린다.");
  }

  public Speaker getSpeaker() {
    return speaker;
  }

  public void setSpeaker(Speaker speaker) {
    this.speaker = speaker;
  }


}