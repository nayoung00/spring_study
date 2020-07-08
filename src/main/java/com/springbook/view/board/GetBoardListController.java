package com.springbook.view.board;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.springbook.biz.day02.board.BoardVO;
import com.springbook.biz.day02.board.impl.BoardDAO;

public class GetBoardListController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) {
    System.out.println("글 목록 검색 처리");

    // 1. 사용자 입력 정보 추출(검색 가능은 나중에 구현)
    // 2. DB 연동 처리
    BoardVO vo = new BoardVO();
    BoardDAO boardDAO = new BoardDAO();
    // 세션에 저장된 글 목록을 꺼낸다.
    List<BoardVO> boardList = boardDAO.getBoardList(vo);

    // 3. 검색 결과를 세션에 저장하고 목록 화면을 리턴한다.
    // HttpSession session = request.getSession();
    // session.setAttribute("boardList", boardList);
    // return "getBoardList";

    // 3. 검색 결과와 화면 정보를 ModelAndVie에 저장하여 리턴한다.
    ModelAndView mav = new ModelAndView();
    mav.addObject("boardList", boardList); // Model 정보 저장
    mav.setViewName("getBoardList");
    // 확장자 .jsp 생략하면 ViewResolver가 접두사와 접미사를 적절히 할당하여
    // '/WEB-INF/board/getBoardList.jsp' 파일을 실행한다.
    return mav;
  }
}
