<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<title> 우리 페이지 </title>
</head>
<body>

<%
	//##########
	// 1. 요청을 통해 전송된 쿠키들을 얻어오기
	// 2. 내가 지정한 이름의 쿠키를 찾기
	// 3. 해당하는 그 쿠키의 값을 얻어와 변수에 저장
	
	//해당하는 쿠키 없다면(정상적인 로그인 절차 없이 접근 한 경우)
	//02_LoginForm.jsp 이동

	Cookie [] c = request.getCookies();
	
	String id=null;
	for(int i=0; c!=null && i<c.length;i++){
		if((c[i].getName()).equals("User")){
		id = c[i].getValue();
		}
	}
	if(id==null){
		response.sendRedirect("02_LoginForm.jsp");
	}
%>

	<h2> 이 페이지는 로그인을 하셔야만 볼 수 있는 페이지 입니다 </h2><br/><br/><br/>
	<%= id %>님, 로그인 중입니다.
		

</body>
</html>