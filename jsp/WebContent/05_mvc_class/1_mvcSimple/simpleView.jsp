<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    
<%
	// 클라이언트로부터 파라미터(데이터)를 받을때 : request.getParameter()
	// 서버측에서 동일한 request(요청)을 받을 떄 : request.getAttribute()
	Object obj = request.getAttribute("param");
	String type = request.getParameter("type");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 메인이라네 </title>
</head>
<body>
	
		<%= obj %> / <%= type %> <br/>
		복잡하다고 지나친 좌절과 놀람은 금물입니다. <br/><br/>
		<img src="05_mvc_class/1_mvcSimple/imgs/sponge_1.JPG"/><br/><br/>

</body>
</html>