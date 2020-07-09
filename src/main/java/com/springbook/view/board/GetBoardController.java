package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springbook.biz.day02.board.BoardVO;
import com.springbook.biz.day02.board.impl.BoardDAO;

@Controller
public class GetBoardController {

  @RequestMapping("/getBoard.do")
  public ModelAndView getBoard(BoardVO vo, BoardDAO boardDAO, ModelAndView mav) {
    mav.addObject("board", boardDAO.getBoard(vo)); // Model 정보 저장
    mav.setViewName("getBoard.jsp");
    return mav;
  }
}
