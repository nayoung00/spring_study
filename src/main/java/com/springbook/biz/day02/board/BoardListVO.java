package com.springbook.biz.day02.board;

import java.util.List;

@XMlRootElement(name = "boardList")
@XmlAccessorType(XmlAccessType.FIELD)
public class BoardListVO {

  @XmlElement(name = "board")
  private List<BoardVO> boardList;

  public List<BoardVO> getBoardList() {
    return boardList;
  }

  public void setBoardList(List<BoardVO> boardLIst) {
    this.boardList = boardList;
  }

}
