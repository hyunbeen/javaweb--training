<%@ page contentType = "text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
<head><title>폼 생성</title></head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
// $(function(){
// 	$('input[type="button"]').click(function(){
// 		var name = $('input[name="name"]').val();
// 		var address = $('input[name="address"]').val();
// 		var checkbox = $('input[name="pet"]');
// 		var pet = new Array();
// 		checkbox.each( function() {
// 		    if($(this).is(":checked")){
			    
// 				pet.push($(this).val()); 
			
// 			 }
// 		});
		
// 		if(name == ''){
// 			alert("이름은 필수입력 입니다");
// 			return;
// 		}else if(address == ''){
// 			alert("주소는 필수입력 입니다");
// 			return;
// 		}else if(pet.length == 0){
// 			alert("팻은 필수입력 입니다");
// 			return;
// 		}
		
// 			$('form').submit();
		
		
// 	});
// });

</script>
<script type="text/javascript">
	window.onload=function(){
		var but = document.getElementById('sub');
		but.onclick = submit;
		function submit(){
			var name = document.forms[0].name.value;
			var address = document.forms[0].address.value;
			var checkbox = document.forms[0].pet;
			var num = 0;
			for(var i=0;i<checkbox.length;i++){
				if(checkbox[i].checked == true){
					num++;
				}
			}

	 		if(name == ''){	
			alert("이름은 필수입력 입니다");
			return;
			}
			else if(address == ''){
			alert("주소는 필수입력 입니다");
			return;
			}else if(num == 0){
			alert("팻은 필수입력 입니다");
			return;
			}

	 		document.forms[0].submit();
	 		
		}
	}
	
	
</script>
<body>

폼에 데이터를 입력한 후 '전송' 버튼을 클릭하세요.
<form action="02_requestParameter.jsp" method="post">
이름: <input type="text" name="name" size="10"> <br>
주소: <input type="text" name="address" size="30"> <br>
좋아하는 동물:
	<input type="checkbox" name="pet" value="dog">강아지
	<input type="checkbox" name="pet" value="cat">고양이
	<input type="checkbox" name="pet" value="pig">돼지
<br>
<input id="sub" type="button" value="전송">
</form>
</body>
</html>
