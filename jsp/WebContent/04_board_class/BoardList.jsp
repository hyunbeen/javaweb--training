<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="board.model.*, board.service.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>

<%  //웹브라우저가 게시글 목록을 캐싱할 경우 새로운 글이 추가되더라도 새글이 목록에 안 보일 수 있기 때문에 설정
	response.setHeader("Pragma","No-cache");		// HTTP 1.0 version
	response.setHeader("Cache-Control","no-cache");	// HTTP 1.1 version
	response.setHeader("Cache-Control","no-store"); // 일부 파이어폭스 버스 관련
	response.setDateHeader("Expires", 1L);			// 현재 시간 이전으로 만료일을 지정함으로써 응답결과가 캐쉬되지 않도록 설정
%> 

<%

// Service에 getArticleList()함수를 호출하여 전체 메세지 레코드 검색 

 String pageno = request.getParameter("pageno");
	if(pageno==null){
		pageno = "1";
	}else if(Integer.parseInt(pageno)<1){//현재 페이지
		pageno = "1";
	}
	
	
	System.out.println("total : "+request.getAttribute("total_page"));
	List <BoardRec> mList = (List)request.getAttribute("mList");
	int total_page = (int)request.getAttribute("total_page");
 
	
	
	if(Integer.parseInt(pageno)>total_page){
		pageno = String.valueOf(total_page);
	}
	
	int group_per_page_cnt = 4;
	
// 	현재 페이지(정수) / 한페이지 당 보여줄 페지 번호 수(정수) + (그룹 번호는 현제 페이지(정수) % 한페이지 당 보여줄 페지 번호 수(정수)>0 ? 1 : 0)
	int group_no = Integer.parseInt(pageno)/group_per_page_cnt+( Integer.parseInt(pageno)%group_per_page_cnt>0 ? 1:0);
//		현재 그룹번호 = 현재페이지 / 페이지당 보여줄 번호수 (현재 페이지 % 페이지당 보여줄 번호 수 >0 ? 1:0)	
//	ex) 	14		=	13(몫)		=	 (66 / 5)		1	(1(나머지) =66 % 5)			  
	
	int page_eno = group_no*group_per_page_cnt;		
//		현재 그룹 끝 번호 = 현재 그룹번호 * 페이지당 보여줄 번호 
//	ex) 	70		=	14	*	5
	int page_sno = page_eno-(group_per_page_cnt-1);	
// 		현재 그룹 시작 번호 = 현재 그룹 끝 번호 - (페이지당 보여줄 번호 수 -1)
//	ex) 	66	=	70 - 	4 (5 -1)
	
	if(page_eno>total_page){
//	   현재 그룹 끝 번호가 전체페이지 수 보다 클 경우		
		page_eno=total_page;
//	   현재 그룹 끝 번호와 = 전체페이지 수를 같게
	}
	
	int prev_pageno = page_sno - group_per_page_cnt;  // <<  *[이전]* [21],[22],[23]... [30] [다음]  >>
//		이전 페이지 번호	= 현재 그룹 시작 번호 - 페이지당 보여줄 번호수	
//	ex)		46		=	51 - 5				
	int next_pageno = page_sno + group_per_page_cnt;	// <<  [이전] [21],[22],[23]... [30] *[다음]*  >>
//		다음 페이지 번호 = 현재 그룹 시작 번호 + 페이지당 보여줄 번호수
//	ex)		56		=	51 - 5
	if(prev_pageno<1){
//		이전 페이지 번호가 1보다 작을 경우		
		prev_pageno=1;
//		이전 페이지를 1로
	}
	if(next_pageno>total_page){
//		다음 페이지보다 전체페이지 수보가 클경우		
		next_pageno=total_page/group_per_page_cnt*group_per_page_cnt+1;
//		next_pageno=total_page
//		다음 페이지 = 전체페이지수 / 페이지당 보여줄 번호수 * 페이지당 보여줄 번호수 + 1 
//	ex)			   = 	76 / 5 * 5 + 1	???????? 		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 게시글 목록 </title>
</head>

<BODY>

	<h3> 게시판 목록 </h3>
	
	<table border="1" bordercolor="darkblue">
	
	<tr>
		<td width=100> 글번호</td>
		<td width=200> 제 목 </td>
		<td width=100> 작성자 </td>
		<td width=300> 작성일  </td>
		<td width=100> 조회수 </td>
	</tr>


	<% if( mList.isEmpty() ) { %>
		<tr><td colspan="5"> 등록된 게시물이 없습니다. </td></tr>
	<% } else { %>
	
		
		<% for(BoardRec rec : mList){  %>
	<tr>
		<td width=100>  <%=rec.getArticleId()%> </td>
			
		<td width=200>
			<%	for(int i=0;i<rec.getLevel();i++){%>
			&nbsp;
			<% } %>
			<% if(rec.getLevel() != 0) {%>
				<img src ='04_board_class/imgs/board_re.gif'/>
			<% } %>
			 <a href='/jsp/Board?cmd=BoardView&aId=<%=rec.getArticleId()%>'><%=rec.getTitle() %></a>
				<% if(rec.getPostingDate().substring(0, 10).equals(new SimpleDateFormat("yyyy-MM-dd").format(new Date()))){
				%>★new	
				<%} %>
			 </td>
		<td width=100> <%=rec.getWriterName() %> </td>
		<td width=300> <%=rec.getPostingDate() %> </td>
		<td width=100> <%=rec.getReadCount() %> </td>
	</tr>
	<%}%>

	<% } // end else %>
	
		<tr>
			<td colspan="5">
				<a href="/jsp/Board?cmd=BoardInputForm">글쓰기</a>
			</td>
		</tr>
	</table>
	<a href="BoardList.jsp?pageno=1"><input type="button" value="<<"/></a>
<a href="/jsp/Board?cmd=BoardList&pageno=<%=Integer.parseInt(pageno)-1%>"><input type="button" value="<"/></a> 
<%for(int i =page_sno;i<=page_eno;i++){%> 
	<a href="/jsp/Board?cmd=BoardList&pageno=<%=i %>"> 
		<%if(Integer.parseInt(pageno) == i){ %> 
			[<%=i %>] 
		<%}else{ %> 
			<%=i %> 
		<%} %> 
	</a>  
<%--	콤마		 --%>
	<%if(i<page_eno){ %>
		,
	<%} %>
<%} %>
  
<a href="/jsp/Board?cmd=BoardList&pageno=<%=Integer.parseInt(pageno)+1%>" ><input type="button" value=">"/></a>
<a href="/jsp/Board?cmd=BoardList&pageno=<%=total_page %>"><input type="button" value=">>"/></a>
</BODY>
</HTML>
