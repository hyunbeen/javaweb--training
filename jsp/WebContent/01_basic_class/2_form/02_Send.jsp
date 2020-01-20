<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//0.post 전송방식에 한글 처리
	request.setCharacterEncoding("UTF-8");
	// 이전 화면의 입력값을 얻어오기
	String name = request.getParameter("name");
	String gender = request.getParameter("gender");
	String occupation = request.getParameter("occupation");
	String hobby[] = request.getParameterValues("hobby");
	String hobbystr="";
	for(int i=0; hobby!=null && i<hobby.length; i++){
		hobbystr += hobby[i] + "/";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
</head>
<body>
	이름 : <%= name %>  <br/>
	성별 : <%= gender %>  <br/>
	직업 : <%= occupation %>  <br/>
	취미 : <%= hobbystr %>  <br/>
</body>
</html>