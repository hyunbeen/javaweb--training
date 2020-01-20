<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String pjName = "/jsp"; %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
</head>
<body>

<%-- <% response.sendRedirect(pjName+"/Kosta"); %> --%>
<%-- <% response.sendRedirect(pjName+"/x.ksm?type=been"); %> --%>
<% response.sendRedirect(pjName+"/Kosta?type=kosta"); %>
</body>
</html>