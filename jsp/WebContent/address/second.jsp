<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="address.*" %>
<%@ page import="java.util.*" %>
   <%
		String select =request.getParameter("select");
		AddressDao dao = AddressDao.getInstance();
		ArrayList result = dao.isSelect(select);
   %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
window.onload = function(){
	var close = document.getElementsByName("close");

	if(close!=null){
		
	
		for(var i=0;i<close.length;i++){

			close[i].onclick = function screen(){
				opener.document.getElementById("first").value = this.innerHTML; 
				window.close();
			};

		}
		
		
	}
	
}

</script>
</head>
<body>
<form>
<input type="text" name="select" size=10 value = '<%= select %>'> <input id="select" type="submit" value="검색"><br/>
</form>

<table border=2>
<% for(int i=0;i<result.size();i++){
%>
<tr><td name="close"><%= result.get(i) %></td></tr>
<%}%>
</table>

</body>
</html>