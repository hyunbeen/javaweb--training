<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "org.json.simple.JSONObject" %>

<%// 1. 이전 화면에서 넘겨받은 데이타
	String cate = request.getParameter("cate");
	String name = request.getParameter("name");
	
	// 2. 다시 화면으로 보낼 데이터 구성
	String result ="";
	//json { 변수 : 값 }
// 	result += "{";
// 	result += " 'first' : " + " '서버에서 보낸" + cate + "' , ";
// 	result += " 'second' : " + " '" + name + "님이 보냄' , ";
// 	result += "}";
	//json-simple-1.1.jar webContent/WEB_INF/lib
	//import
	JSONObject obj = new JSONObject();
	obj.put("first","cate"+"보냄");
	obj.put("second","아이유신곡좀");
	out.write(String.valueOf(obj));
	
%>    
