<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<script  type="text/javascript"  src="libs/jquery-1.9.1.min.js"> </script>
	<script type="text/javascript">
	$(function(){
		var param = { cate : '불금', name : '오늘'};
		$.get("01_server.jsp",param,parseData);
		alert("전송시작");
		});

	function parseData(strText){
		var arr = strText.split("|");
		for(var i=0;i<arr.length;i++){
			var param = arr[i].split('=');
					
			if(param[0].trim()=='cate'){
				document.getElementById('cate').value = param[1];
			}else if(param[0].trim()=='name'){
				document.getElementById('name').value = param[1];
			}
			
		}
	}
	</script>
</head>


<body>
서버로부터 넘겨받은 데이터<br/>
첫번째 데이터 : <input type="text" name="" id="cate"/><br/>
두번째 데이터 : <input type="text" name="" id="name"/><br/>
</body>
</html>


