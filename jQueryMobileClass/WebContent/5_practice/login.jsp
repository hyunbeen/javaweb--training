<%@ page contentType="text/html;charset=euc-kr"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.sql.*" %>


<%
String uid = request.getParameter("uid");
String upassword = request.getParameter("upassword");
boolean login = false;
String 	dbDriver	=	"oracle.jdbc.driver.OracleDriver";
String		dbUrl		=	"jdbc:oracle:thin:@192.168.0.124:1521:orcl";
String		dbUser		=	"scott";
String		dbPass		=	"tiger";
Class.forName( dbDriver );
Connection con = DriverManager.getConnection(dbUrl, dbUser, dbPass);
String sql = "select * from emp where ename=? and empno=?";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, uid);
ps.setInt(2, Integer.parseInt(upassword));
ResultSet rs = ps.executeQuery();

if(rs.next()){
	login = true;
}else{
	login = false;
}


%>

<div id="login" data-role="page" data-theme="a">
	<div data-role="header" data-theme="a">
		<h1>�α��� ���</h1>
	</div>

	<div data-role="content">
		<%if(login) {%>
				<center>
					<h3>�α��� ����</h3>
					<a	href="#home" 
						data-icon="home"
						data-role="button"
						data-inline="true"
						data-direction="reverse">��Ȩ</a>
					<script type="text/javascript">
						$("#home").attr("data-login", "ok");
					</script>
				</center>
		<%} else {%>
				<center>
				
							<h3>���̵�� �н����尡 Ʋ��</h3>

					<div class="ui-grid-a">
						<div class="ui-block-a">
							<a	href="loginform.html" 
								data-role="button"
								data-icon="gear"
								data-direction="reverse">�α�����</a>
						</div>
						<div class="ui-block-b">
							<a	href="#home" 
								data-icon="home"
								data-role="button"
								data-direction="reverse">��Ȩ</a>
						</div>
					</div>
				</center>
		<%}%>
	</div>
</div>