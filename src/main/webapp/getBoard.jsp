<%@ page import="java.util.List" %>
<%@ page import="com.springbook.biz.day02.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.day02.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
 // 세션에 저장된 게시글 정보를 꺼낸다.
 BoardVO board = (BoardVO) session.getAttribute("board");
%>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                      "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR charset=UTF-8">
<title>글 목록</title>
</head>
<body>
<center>
<h1>글 목록</h1>
<h3>테스트님 환영합니다... <a href="loguot_proc.jsp">Log-out</a></h3>

<!-- 검색 시작 -->
<form action="getBoardList.jsp" method="post">
<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
<td align="right">
 <select name ="searchCondition">
    <option value="TITLE">제목
    <option value="CONTENT">내용
 </select>
    <input name="searchKeyword" type="text"/>
    <input type="submit" value="검색"/>
 <td>
</tr>    
</table>
</form>
<!-- 검색 종료 -->

<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
    <th bgcolor="orange" width="100">번호</th>
    <th bgcolor="orange" width="200">제목</th>
    <th bgcolor="orange" width="150">작성자</th>
    <th bgcolor="orange" width="150">등록수</th>
    <th bgcolor="orange" width="100">조회수</th>
</tr>

</center>
</body>
</html>
