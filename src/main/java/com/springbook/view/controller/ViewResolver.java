package com.springbook.view.controller;

// DispactcherServlet의 init()메소드가 호출될 때 생성됨.
public class ViewResolver {

  public String prefix;
  public String suffix;

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }

  public String getView(String viewName) {
    return prefix + viewName + suffix;
  }

}
