<%@ page contentType="text/html; charset=euc-kr" %>

<% String projectName = "/First"; %>
<html>
<head><title>���� ���</title></head>
<body>
<form action='/jsp/pds' method='post' enctype="multipart/form-data">
����: <input type="file" name="file" /> <br/>
����: <input type="text" name="description" /> <br/>
<input type="submit" value="���ε�" />
</form>
</body>
</html>

<!-- 1. web.xml�� FileUploadServlet Ŭ������ pds ��η� ���� �����ؾ� �Ѵ�. -->
<!-- 2. FileUploadServlet ���� ���� ���ε� ��θ� ����  -->