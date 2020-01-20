<%@ page contentType="text/html; charset=UTF-8" 
pageEncoding="UTF-8"%>

<!--  EL : expression language
뷰단에서 사용 -->
<% request.setCharacterEncoding("UTF-8"); %>

<jsp:useBean id="info" class="info.Info">
	<jsp:setProperty name="info" property="*" />
</jsp:useBean>

<!DOCTYPE html>
<HTML>
<HEAD><TITLE> 자료 출력 </TITLE></HEAD>
<BODY>
	<H2>  당신의 신상명세서 확인 </H2>
	이   름  : ${info.name}<br/>
	주민번호 : ${info.id}<br/>
	성  별   : ${info.gender}<br/>  <!--  info dksdp getGender / isGender -->
	맞습니까????
</BODY>
</HTML>