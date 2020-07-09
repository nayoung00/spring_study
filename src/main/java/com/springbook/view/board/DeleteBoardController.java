package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.springbook.biz.day01.ex06.board.BoardVO;
import com.springbook.biz.day01.ex06.board.impl.BoardDAO;

@Controller
public class DeleteBoardController {

  @RequestMapping("/deleteBoard.do")
  public String handleRequest(BoardVO vo, BoardDAO boardDAO) {

    boardDAO.deleteBoard(vo);
    return "getBoardList.do";

  }
}
