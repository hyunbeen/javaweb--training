<%@ page language="java" contentType="text/html; charset=utf-8"%>
 <%@ page import="mybatis.guest.model.*" %>   
 <%@ page import="mybatis.guest.service.*" %>   
  
      
  <!-- 키에 해당하는 글번호를 넘겨받아 서비스의 메소드 호출  -->
  <% 
  long commentNo = Integer.parseInt(request.getParameter("cId"));
  String scommentNo = String.valueOf(commentNo);
  Comment comment = CommentService.getInstance().selectCommentByPrimaryKey(commentNo);  
  %>
     
<!DOCTYPE HTML>
<html>
<head>
	<meta charset="UTF-8">
<title> 메세지 보기 </title>
</head>
<body> 
<form action="modify.jsp?cId=<%=scommentNo%>">
<table border="1">
	<input type="hidden" name="cId" value='<%=scommentNo%>'/>
		<tr><td>작성자</td><td><input type="text" name="UserId" value='<%=  comment.getUserId() %>'/></td></tr>
		<tr><td>메세지</td><td><input type="text" name="CommentContent" value='<%=  comment.getCommentContent()%>'/></td></tr>
		<tr><td>등록일</td><td><input type="text" name="RegDate" value='<%=  comment.getRegDate()%>'/></td></tr>
		<tr><td colspan="2">
				<input type="submit" id="btnModify" value="수정" />
				</td></tr>
</table>
</form>
</body>
</html>