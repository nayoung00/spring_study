package com.springbook.view.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.springbook.biz.day02.board.BoardVO;
import com.springbook.biz.day02.board.impl.BoardDAO;

@Controller
public class BoardController {

  // 글 등록
  @RequestMapping("/insertBoard.do")
  public String insertBoard(BoardVO vo, BoardDAO boardDAO) {
    boardDAO.insertBoard(vo);
    return "getBoardList.do";
  }

  // 글 수정
  @RequestMapping("/updateBoard.do")
  public String updateBoard(BoardVO vo, BoardDAO boardDAO) {
    boardDAO.updateBoard(vo);
    return "getBoardList.do";
  }

  // 글 삭제
  @RequestMapping("/deleteBoard.do")
  public String deleteBoard(BoardVO vo, BoardDAO boardDAO) {
    boardDAO.deleteBoard(vo);
    return "getBoardList.do";
  }

  // 글 상세 조회
  @RequestMapping("/getBoard.do")
  public String getBoard(BoardVO vo, BoardDAO boardDAO, Model model) {
    model.addAttribute("board", boardDAO.getBoard(vo)); // Model 정보 저장
    return "getBoard.jsp"; // View 이름 리턴
  }

  // 글 목록 검색
  @RequestMapping("/getBoardList.do")
  public String getBoardList(@RequestParam(//
      value = "searchCondition", // 화면으로 전달될 파라미터 이름
      defaultValue = "TITLE", // 화면으로 전달도리 파라미터 정보가 없을 때, 설정할 기본값
      required = false // 파라미터의 생략 여부
  ) String condition,
      @RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword,
      BoardDAO boardDAO, Model model) {
    System.out.println("검색 조건 : " + condition);
    System.out.println("검색 단어 : " + keyword);
    // model.addAttribute("boardList", boardDAO.getBoardList(vo)); // Model 정보 저장
    return "getBoardList.jsp"; // View 이름 리턴
  }


}
