<%@ page import="com.springbook.biz.day02.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.day02.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
  // 1. 검색할 게시글 번호 추출
  request.setCharacterEncoding("UTF-8");
  String title = request.getParameter("title");
  String writer = request.getParameter("writer");
  String content = request.getParameter("content");
  
  // 2. DB 연동 처리
  BoardVO vo = new BoardVO();
  vo.setTitle(title);
  vo.setWriter(writer);
  vo.setContent(content);
  
  BoardDAO boardDAO = new BoardDAO();
  BoardVO board = boardDAO.getBoard(vo);
  
  // 3. 화면 네비게이션
  response.sendRedirect("getBoardList.jsp");
%> 