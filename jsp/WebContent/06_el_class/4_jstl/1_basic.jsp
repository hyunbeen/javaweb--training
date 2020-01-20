<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
</head>
<body>
<!-- 변수선언	 -->
<c:set var='gender' value='male'/>
<c:if test="${gender eq 'male'}" >
당신은 남자 입니다.<hr/></c:if>

<c:set var='age' value='19' />


<!-- choose when 구문으로 10세 미만이면 어린이,10세 이상 20세 미만이면 청소년, 20 이상이면 성인 출력 -->
<c:choose>
       <c:when test="${age lt 10}">
           어린이<br/>
       </c:when>
       <c:when test="${age lt 20}">
     청소년<br/>
       </c:when>
       <c:when test="${age gt 20 or age eq 20}">
     성인<br/>
       </c:when>
       <c:otherwise>
          이상한 값...<br/>
       </c:otherwise>
</c:choose>

<%-- <c:set var='sum' value='0'/> --%> <!-- 변수선언 int sum = 0 -->
<c:forEach var='i' begin='1' end='100'>
<c:set var='sum' value='${sum+i}'/>
</c:forEach>


<c:forEach var='i' begin='1' end='100' step='2'>
<c:set var='esum' value='${esum+i+1}'/>
<c:set var='osum' value='${osum+i}'/>
</c:forEach>
1부터 100 까지의 합 : ${sum }<br/>
1부터 100 까지의 홀수의합 : ${osum }<br/>
1부터 100 까지의 짝수의합 : ${esum }<br/>

<c:set var='num' value='9'/>
<c:forEach var='i' begin='1' end='9'>
${num} * ${i} = ${i*num} <br/>
</c:forEach>





</body>
</html>