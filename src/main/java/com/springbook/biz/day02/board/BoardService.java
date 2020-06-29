package com.springbook.biz.day02.board;

import java.util.List;


public interface BoardService {

  void insertBoard(BoardVO vo);

  // 글 수정
  void updateBoard(BoardVO vo);

  // 글 삭제
  void deleteBoard(BoardVO vo);

  // 글 상세 조회
  BoardVO getBoard(BoardVO vo);

  // 글 목록 조회
  List<BoardVO> getBoardList(BoardVO vo);

}
