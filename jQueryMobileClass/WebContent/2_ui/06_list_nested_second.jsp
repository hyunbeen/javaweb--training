<%@ page contentType="text/html;charset=utf-8"%>

<%
	String model = request.getParameter("model");  
%>
<!DOCTYPE html> 
<html> 
	

<div data-role="page">       
	<div data-role="header">	    
		<h1>Nested List</h1>
		<a href="#" data-rel="back" data-icon="home" data-iconpos="notext"></a>		
	</div>	
					
	<div data-role="content">
		  <ul data-role="listview">    
				<% if( model.equals("a")) { %>		
					<li>갠역시</li>
					<li>아이뽀</li>
				<% } else if( model.equals("b")) { %>
					<li>바바뤼</li>
					<li>팬디</li>					
				<% } else { %>
					<li>루비통</li>
					<li>샤뉼</li>				
				<% } %>					
		  </ul>		      
	</div>
</div>


