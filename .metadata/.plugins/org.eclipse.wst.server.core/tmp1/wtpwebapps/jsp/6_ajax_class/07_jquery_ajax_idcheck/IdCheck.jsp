<%@ page contentType="text/xml; charset=utf-8" %>
<%@ page language="java" import="java.sql.*"%>
<%@ page import = "org.json.simple.JSONArray" %>
<%@ page import = "org.json.simple.JSONObject" %>

<%
String driver="oracle.jdbc.driver.OracleDriver";
String user="seung";
String pass="seung";
String dbURL="jdbc:oracle:thin:@192.168.0.138:1521:orcl";


	Class.forName(driver);
	Connection connection=DriverManager.getConnection(dbURL,user,pass);
	
	String sql = "select distinct pgu2 pgu2 from post2 where pgu1 = '" + request.getParameter("addr")+"'";
	
	Statement stmt = connection.createStatement();
	
	ResultSet rs = stmt.executeQuery(sql);		
	

	JSONArray jArray = new JSONArray();//배열이 필요할때
		
		while(rs.next()){
		JSONObject sObject = new JSONObject();//배열 내에 들어갈 json
		sObject.put("pgu2", rs.getString("pgu2"));
		jArray.add(sObject);
		}
		JSONObject result = new JSONObject();
		result.put("result",jArray);
	out.print( result.toString()); //CSV
		

	
			
	
%>

