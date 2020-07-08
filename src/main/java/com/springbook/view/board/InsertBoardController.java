package com.springbook.view.board;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import com.springbook.biz.day02.board.BoardVO;
import com.springbook.biz.day02.board.impl.BoardDAO;

@Controller
public class InsertBoardController {

  public void insertBoard(HttpServletRequest request) {
    System.out.println("글 등록 처리");

    // 1. 사용자 입력 정보 추출
    // request.setCharacterEncoding("UTF-8");
    String title = request.getParameter("title");
    String writer = request.getParameter("writer");
    String content = request.getParameter("content");

    // 2. DB 연동 처리
    BoardVO vo = new BoardVO();
    vo.setTitle(title);
    vo.setWriter(writer);
    vo.setContent(content);

    BoardDAO boardDAO = new BoardDAO();
    boardDAO.insertBoard(vo);

  }
}
