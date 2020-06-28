package com.springbook.biz.day01.ex06.board.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springbook.biz.day01.ex06.board.BoardService;
import com.springbook.biz.day01.ex06.board.BoardVO;

@Service("boardService")
public class BoardServceImpl implements BoardService {

  @Autowired
  private BoardDAO boardDAO;

  @Override
  public void insertBoard(BoardVO vo) {
    boardDAO.insertBoard(vo);
  }

  @Override
  public void updateBoard(BoardVO vo) {
    boardDAO.updateBoard(vo);

  }

  @Override
  public void deleteBoard(BoardVO vo) {
    boardDAO.deleteBoard(vo);
  }

  @Override
  public BoardVO getBoard(BoardVO vo) {
    return boardDAO.getBoard(vo);
  }

  @Override
  public List<BoardVO> getBoardList(BoardVO vo) {
    return boardDAO.getBoardList(vo);
  }

}
