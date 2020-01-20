<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.json.simple.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.sql.*"%>
<%
// 안드로이드에서 보내준 데이터를 받기
	String user_id = request.getParameter("user_id");
String user_pw = request.getParameter("user_pw");
System.out.println("디비에서 확인 할것임 : "+user_id+":"+user_pw);
if(user_id!=null){
	Class.forName("oracle.jdbc.driver.OracleDriver");	
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.121:1521:orcl", "scott", "tiger");
	String sql = "Select * from emp where ename=? and empno=?";
	PreparedStatement ps = con.prepareStatement(sql);
	ps.setString(1, user_id);
	ps.setInt(2, Integer.parseInt(user_pw));
	ResultSet rs = ps.executeQuery();
	if(rs.next()){
		System.out.println("로그인성공");
		out.write("SUCCESS");
	}
	else{
		System.out.println("로그인실패");
		out.write("FAIL");
	}
	
}


%>