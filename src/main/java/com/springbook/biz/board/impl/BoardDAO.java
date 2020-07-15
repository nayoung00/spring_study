// Mybatis를 이용하여 데이터베이스 연동을 처리하는 BoardDAO클래스
package com.springbook.biz.board.impl;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.util.SqlSessionFactoryBean;


public class BoardDAO {

  private SqlSession mybatis;

  public BoardDAO() {
    mybatis = SqlSessionFactoryBean.getSqlSessionInstance();
  }

  public void insertBoard(BoardVO vo) {
    mybatis.insert("BoardDAO.insertBoard", vo);
    mybatis.commit();
  }

  public void updateBoard(BoardVO vo) {
    mybatis.update("BoardDAO.updateBoard", vo);
    mybatis.commit();
  }

  public void deleteBoard(BoardVO vo) {
    mybatis.delete("BoardDAO.deleteBoard", vo);
    mybatis.commit();
  }

  // 단 건 조회
  public BoardVO getBoard(BoardVO vo) {
    return (BoardVO) mybatis.selectOne("BoardDAO.getBoard", vo);
  }


  // 목록 조회
  public List<BoardVO> getBoardList(BoardVO vo) {
    return mybatis.selectList("BoardDAO.getBoardList", vo);
  }

}
