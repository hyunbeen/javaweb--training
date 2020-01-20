<%@ page language="java" contentType="text/html; charset=utf-8"%>
 <%@ page import="mybatis.guest.model.*" %>   
 <%@ page import="mybatis.guest.service.*" %>   
  
      
  <!-- 키에 해당하는 글번호를 넘겨받아 서비스의 메소드 호출  -->
  <% 
  long commentNo = Integer.parseInt(request.getParameter("cId"));
  String scommentNo = String.valueOf(commentNo);
  String UserId = request.getParameter("UserId");
  String CommentContent = request.getParameter("CommentContent");
  String RegDate = request.getParameter("RegDate");
	System.out.println("1:"+commentNo);
	System.out.println("2:"+UserId);
	System.out.println("3:"+CommentContent);
	System.out.println("4:"+RegDate);
  int result = CommentService.getInstance().update(commentNo,UserId,CommentContent,RegDate);  
  %>
      
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
<title> 메세지 보기 </title>
</head>
<body>
<% if(result==1){ %>
수정이 완료되었습니다
<% }else{ %>
수정을 실패했습니다
<%} %>

</body>
</html>