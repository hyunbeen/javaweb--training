<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import="pds.service.ListPdsItemService"%>
<%@ page import="pds.model.PdsItem"%>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	ListPdsItemService listSerivce = ListPdsItemService.getInstance();
	List<PdsItem> itemListModel = listSerivce.getPdsItemList();
	request.setAttribute("listModel", itemListModel);
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.addHeader("Cache-Control", "no-store");
	response.setDateHeader("Expires", 1L);
%>
<html>
<head><title>그림목록</title></head>
<body>
<table border="1">

	
<c:choose>
	<c:when test="${empty listModel}">
	<tr>
		<td colspan="5">
			게시글이 없습니다.
		</td>
	</tr>
	</c:when>
	<c:otherwise>
	<c:set var='br' value='0'/>
	
	<c:forEach var='item' items='${listModel}'>
	
	
	
	<c:if test="${br mod 3 eq 0}">
	<tr>
	</c:if>	
		<td><img src='../upload/${item.realPath}'></td>
	<c:if test="${br mod 3 eq 2}">
	</tr>
	</c:if>	

	
	<c:set var='br' value='${br+1}'/>
	</c:forEach>
	</c:otherwise>

</c:choose>
	

</table>
</body>
</html>