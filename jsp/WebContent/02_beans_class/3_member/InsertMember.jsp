<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="member.beans.*" %>

<!-- 하나씩 천천히 도전합시다 -->
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="bean" class="member.beans.Member">
<jsp:setProperty name="bean" property="id"/>
<jsp:setProperty name="bean" property="password"/>
<jsp:setProperty name="bean" property="name"/>
<jsp:setProperty name="bean" property="tel"/>
<jsp:setProperty name="bean" property="addr"/>
</jsp:useBean>

<%
	MemberDao dao = MemberDao.getInstance();
	dao.insertMember(bean);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 회원가입 확인  </title>
</head>
<body>
	아이디 : <jsp:getProperty name="bean" property="id"/><br>
	패스워드 : <jsp:getProperty name="bean" property="password"/><br>
	이름 : <jsp:getProperty name="bean" property="name"/><br>
	전화 : <jsp:getProperty name="bean" property="tel"/><br>
	주소 : <jsp:getProperty name="bean" property="addr"/><br>
</body>
</html>