<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.*"%>
<%
JSONObject json = new JSONObject();
json.put("name","홍길동");
json.put("dept","컴공");
out.write(json.toString());
%>