<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$('#select').click(function(){
		var address = $('#address').val();
		window.open('second.jsp?select='+address,'','width=400, height=400');
		});
});
</script>
</head>
<body>
<form>
주소<input id="address" name="address" type="text"/><input id="select" type="button" value="우편찾기"></br>
<input id="first" type="text" size=50></br>
<input id="second" type="text" size=50></br>
<input id="submit" type="button" value="제출"></br>
</form>
</body>
</html>