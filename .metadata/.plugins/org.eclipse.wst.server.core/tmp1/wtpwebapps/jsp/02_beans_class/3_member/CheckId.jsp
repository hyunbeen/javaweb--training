<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  %>
 <%@ page import="member.beans.*" %>
 <% 
 	String userId =request.getParameter("userId");
 	MemberDao dao = MemberDao.getInstance();
 	boolean result = dao.isDuplicatedId(userId);
 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 아이디 중복 확인 </title>
<script type="text/javascript">
window.onload = function(){
	var close = document.getElementById("ok");
	if(close!=null){
		close.onclick = screen;
		function screen(){
		opener.document.getElementsByName("id")[0].value = document.getElementById("id").value; 
		window.close();
		}
	}
	
}
</script>
</head>
<body>
<form>
	<input type='text' id='id' name="userId" value = '<%= userId %>' />
	<input type='submit' value='중복확인'/>
	
</form>
<%
	if(result) {
%>
		사용중인 아이디가 있습니다. 다시 입력하여 주십시오.
<%  }else { %>
		사용할 수 있는 아이디입니다.
		<input type='button' id='ok' value='적용'/>
<%  } %>
</body>
</html>