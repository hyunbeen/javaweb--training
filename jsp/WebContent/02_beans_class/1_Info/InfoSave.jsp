<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!-- 빈즈의 범위 : page(default)/request/session/application -->
<jsp:useBean id="bean" class="info.Info" scope='session'>
<jsp:setProperty name="bean" property="name"/>
<jsp:setProperty name="bean" property="id"/>
</jsp:useBean>
<!DOCTYPE html>
<html>
<body>
	<h2>  당신의 신상명세서 확인 </h2>
	이   름  : <jsp:getProperty name="bean" property="name"/><br/>
	주민번호 : <jsp:getProperty name="bean" property="id"/><br/>
	성  별   : <jsp:getProperty name="bean" property="gender"/><br/>  
	맞습니까????
</body>
</html>