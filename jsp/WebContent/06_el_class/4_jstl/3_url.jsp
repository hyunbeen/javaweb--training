<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 
	1.@include file='xxxx'
	2.jsp:include page='xxxx'
	3.taglib c:import
 -->
 
 <% 
 String result = request.getParameter("result"); 
 String search = request.getParameter("search"); 
 %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>

</head>
<body>
<%-- <c:import url="https://www.flickr.com/search/"> --%>
<%-- <c:param name='text' value='설현'></c:param> --%>
<%-- <c:param name='text'>설현</c:param> --%>

<!-- 1.유투브에서 고양이 검색 -->
<%-- <c:redirect url="https://www.youtube.com/results"> --%>
<%-- <c:param name='search_query' value='고양이'></c:param> --%>
<%-- </c:redirect> --%>

<!-- 2.다음에서 검색 -->
<%-- <c:import url="https://search.daum.net/search"> --%>
<%-- <c:param name='w' value='img'></c:param> --%>
<%-- <c:param name='nil_search' value='btn'></c:param> --%>
<%-- <c:param name='DA' value='NTB'></c:param> --%>
<%-- <c:param name='enc' value='utf8'></c:param> --%>
<%-- <c:param name='q' value='고양이'></c:param> --%>
<%-- </c:import> --%>

<!-- 페이지 전환 -->
<%-- <c:redirect url='2_QuizNumberEL.jsp'></c:redirect> --%>
<%-- <c:import url='2_QuizNumberEL.jsp'></c:import> --%>

<!-- #1. import 와 redirect 차이점은? --> 
<!-- #1. forwarding 차이점은? -->
<!-- import include 합치기 redirect 사이트 옮기기 url이 바뀜 forwarding 왓다 갔던것 처럼 표시하기 url이 안바뀜 -->
<%-- <c:import url='https://www.naver.com'></c:import> --%>


<%-- <c:import url="https://www.flickr.com/search/"> --%>
<%-- <c:param name='text' value='고양이'></c:param> --%>
<%-- </c:import> --%>

<%-- <c:redirect url="https://www.youtube.com/results"> --%>
<%-- <c:param name='search_query' value='고양이'></c:param> --%>
<%-- </c:redirect> --%>

<%-- <c:import url="https://search.daum.net/search"> --%>
<%-- <c:param name='w' value='img'></c:param> --%>
<%-- <c:param name='nil_search' value='btn'></c:param> --%>
<%-- <c:param name='DA' value='NTB'></c:param> --%>
<%-- <c:param name='enc' value='utf8'></c:param> --%>
<%-- <c:param name='q' value='고양이'></c:param> --%>
<%-- </c:import> --%>

<%--  <% if(result==null){%> --%>

<%-- 	<%}else if(result.equals("flicker")){%> --%>
<%-- 	<c:import url="https://www.flickr.com/search/"> --%>
<%-- 	<c:param name='text'><%=search %></c:param> --%>
<%-- 	</c:import> --%>
<%-- 	<%}else if(result.equals("youtube")){%> --%>
<%-- 	<c:redirect url="https://www.youtube.com/results"> --%>
<%-- 	<c:param name='search_query'><%=search %></c:param> --%>
<%-- 	</c:redirect> --%>
<%-- 	<%}else if(result.equals("daum")){%> --%>
<%-- 	<c:import url="https://search.daum.net/search"> --%>
<%-- 	<c:param name='w' value='img'></c:param> --%>
<%-- 	<c:param name='nil_search' value='btn'></c:param> --%>
<%-- 	<c:param name='DA' value='NTB'></c:param> --%>
<%-- 	<c:param name='enc' value='utf8'></c:param> --%>
<%-- 	<c:param name='q'><%=search %></c:param> --%>
<%-- 	</c:import> --%>
<%-- 	<%}%> --%>

<!-- <form> -->
<!-- <input name='search' type="text"/> -->
<!-- <input name='result' type="submit" value="flicker"/> -->
<!-- <input name='result' type="submit" value="daum"/> -->
<!-- <input name='result' type="submit" value="youtube"/> -->
<!-- </form> -->

<%-- <c:url var='flickr' --%>
<%--       value='https://www.flickr.com/search/?text=${param.guess }' /> --%>
<%--    <c:url var='Daum' --%>
<%--       value='https://search.daum.net/search?w=img&nil_search=btn&DA=NTB&enc=utf8&q=%EA%B3%A0%EC%96%91%EC%9D%B4' /> --%>
<%--    <%-- <c:url var='YouTube' value='https://www.flickr.com/search/?text=%EA%B3%A0%EC%96%91%EC%9D%B4'/> --%> --%>


   
   
 
   
<!--    <br> -->
   
<!--    <input type='text' name='guess'> -->
<%--    <input type='submit' action='${flickr }' value='flicker'> --%>
<%--    <input type='submit' action='${Daum }' value='Daum'> --%>
<%--    <input type='submit' action='${YouTube }' value='YouTube'> --%>


</body>
</html>