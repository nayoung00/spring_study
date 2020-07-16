// DAO클래스 구현 - 방법2.SqlSessionTemplate 클래스를 <bean> 등록하여 사용
package com.springbook.biz.board.impl;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis extends SqlSessionDaoSupport {

  @Autowired
  private SqlSessionTemplate mybatis;


  public void insertBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 insertBoard() 기능 처리");
    mybatis.insert("BoardDAO.insertBoard", vo);
  }

  public void updateBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 updateBoard() 기능 처리");
    mybatis.update("BoardDAO.updateBoard", vo);
  }

  public void deleteBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
    mybatis.delete("BoardDAO.deleteBoard", vo);
  }

  // 단 건 조회
  public BoardVO getBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 getBoard() 기능 처리");
    return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
  }


  // 목록 조회
  public List<BoardVO> getBoardList(BoardVO vo) {
    System.out.println("===> Mybatis로 getBoardList() 기능 처리");
    return mybatis.selectList("BoardDAO.getBoardList", vo);
  }

}
