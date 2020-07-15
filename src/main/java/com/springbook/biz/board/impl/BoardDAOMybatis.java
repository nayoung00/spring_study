// DAO클래스 구현 - 방법1.SqlSessionDaoSupport 클래스를 상속하여 구현
package com.springbook.biz.board.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.springbook.biz.board.BoardVO;

@Repository
public class BoardDAOMybatis extends SqlSessionDaoSupport {

  @Override
  @Autowired
  public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
    super.setSqlSessionFactory(sqlSessionFactory);
  }

  public void insertBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 insertBoard() 기능 처리");
    getSqlSession().insert("BoardDAO.insertBoard", vo);
  }

  public void updateBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 updateBoard() 기능 처리");
    getSqlSession().update("BoardDAO.updateBoard", vo);
  }

  public void deleteBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 deleteBoard() 기능 처리");
    getSqlSession().delete("BoardDAO.deleteBoard", vo);
  }

  // 단 건 조회
  public BoardVO getBoard(BoardVO vo) {
    System.out.println("===> Mybatis로 getBoard() 기능 처리");
    return (BoardVO) getSqlSession().selectOne("BoardDAO.getBoard", vo);
  }


  // 목록 조회
  public List<BoardVO> getBoardList(BoardVO vo) {
    System.out.println("===> Mybatis로 getBoardList() 기능 처리");
    return getSqlSession().selectList("BoardDAO.getBoardList", vo);
  }

}
