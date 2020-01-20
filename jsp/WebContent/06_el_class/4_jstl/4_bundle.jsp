<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>
<%-- <fmt:setLocale value="sp"/> --%>
<!-- 우리 확인 위해서 지정 (브라우저에서 지정) -->


<fmt:bundle basename="resource.message">
<fmt:message key='TITLE' var='ttl'/>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
</head>
<body>
	<fmt:message key='GREETING'/><hr/>
	제목 : ${ttl}<hr/>
	<c:if test="${not empty param.name }">
		<fmt:message key='NAME'>
			<fmt:param value='${param.name }'/>
		</fmt:message>
	</c:if>
</body>
</html>
</fmt:bundle>