<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--3.HTML 주석  : 브라우저가 실행하지 않음--> 
<%--1.JSP 주석  : jsp에서 java 변환될 때--%>
<% //2.JAVA 주석 : java에서 class 컴파일 될때 %>   
<%! String msg = "민우맛난거"; %>
<% String name = "짝꿍"; %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%= name %> 님 만나서 밥 먹자.
	
</body>
</html>