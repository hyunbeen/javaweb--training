<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.*,board.service.*" %>

<%
	request.setCharacterEncoding("UTF-8");
	
	String articleid = request.getParameter("articleid3");
	
	
	
	
	int result = (int)request.getAttribute("update");
	
%>
 
<!-- 1. 이전 화면의 입력값을 넘겨받아 BoardRec 객체의 각 멤버변수로 지정 -->


<%
	// 2. Service에 update() 호출하여 레코드 수정

%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판글수정</title>
</head>
<body>

<%  
	// 게시글 수정이 성공적으로 되었다면 그 해당 게시글을 보여주는 페이지로 이동하고
    // 그렇지 않다면, "암호가 잘못 입력되었습니다"를 출력
	if(result==0){
%>암호가 잘못 입력되었습니다</br><%}else{ 
	
response.sendRedirect("/jsp/Board?cmd=BoardView&aId="+articleid);
} %>

</body>
</html>