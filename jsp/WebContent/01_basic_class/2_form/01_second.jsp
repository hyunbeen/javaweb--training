<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
	// 이전 화면에서 넘어오는 값 받기
	 String user1 = request.getParameter("User");
	 String pass1 = request.getParameter("Pass");
	 
	 //-----------------JDBC
	 // 1. 드라이버 로딩
	Class.forName("oracle.jdbc.driver.OracleDriver");
	// 2. 연결객체 얻어오기
	String url = "jdbc:oracle:thin:@192.168.0.156:1521:orcl";
	String User = "scott";
	String Pass = "tiger";
	Connection con = DriverManager.getConnection(url,User,Pass);
	
	String sql = "SELECT * FROM EMP WHERE ename='"+user1+"' AND empno="+pass1;
	
	Statement st = con.createStatement();
	ResultSet rs = st.executeQuery(sql);
	if(!rs.next()){
		response.sendRedirect("01_first.jsp");
	}
%> 
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 폼의 입력값 처리 </title>
</head>
<body>
	<h2>폼의 입력값 넘겨받아 처리</h2>
	입력한 아이디 : <%= user1 %>  <br/>
	입력한 패스워드 : <%= pass1 %>
</body>
</html>