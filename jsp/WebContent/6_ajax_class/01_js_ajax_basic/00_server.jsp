<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	// ***  한글이 깨지는 문제가 있지만 전반적인 흐름만 이해합니다.
	
	// 1. 이전 화면에서 넘겨받은 데이타
	String cate = request.getParameter("cate");
	String name = request.getParameter("name");
	
	// 2. 다시 화면으로 보낼 데이터 구성
	cate = "changed_"+cate;
	name = "form_"+name;
	
	
	// 3. 다시 00_normal_web.jsp 요청
	response.sendRedirect("00_normal_web.jsp?cate="+cate+"&name="+name);
%>    
