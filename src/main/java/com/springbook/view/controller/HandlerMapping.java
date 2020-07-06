package com.springbook.view.controller;

import java.util.HashMap;
import java.util.Map;

// 모든 Controller 객체들을 저장하고 있다가,
// 클라이언트의 요청을 처리할 특정 Controller를 검색하는 기능을 제공한다.
public class HandlerMapping {
  private Map<String, Controller> mappings;

  public HandlerMapping() {
    mappings = new HashMap<String, Controller>();
    mappings.put("/login.do", new LoginController());
    mappings.put("/getBoardList.do", new GetBoardListController());
    mappings.put("/getBoard.do", new GetBoardController());
    mappings.put("/insertBoard.do", new InsertController());
    mappings.put("/updateBoard.do", new UpdateBoardController());
    mappings.put("/deleteBoard.do", new DeleteBoardController());
  }

  public Controller getController(String path) {
    return mappings.get(path);
  }

}
