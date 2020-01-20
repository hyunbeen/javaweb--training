<%@ page contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 우리반 연습</title>
<link href='css/visualize.css' rel='stylesheet' type="text/css"></style>
<link href='css/visualize-dark.css' rel='stylesheet' type="text/css"></style>
<script type="text/javascript"  src="http://code.jquery.com/jquery-1.9.0.js"></script>

<script src='js/visualize.jQuery.js' type="text/javascript"></script> 


<script type="text/javascript">
	
	
		
	$(function(){
		var xhr = new XMLHttpRequest();
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4){
				if(xhr.status==200){
					parse_kma(xhr.responseXML);
					}
				}}
				xhr.open("get","proxy_kma.jsp",true);
				xhr.send();
	

	function parse_kma(resXml){
		//var ctg = resXml.getElementsByTagName('category')[0].textContent;
		
		var result = document.getElementById('result');
		var result2 = document.getElementById('result2');
		var result3 = document.getElementById('result3');
		//result.innerHTML = '<h1>' + ctg + '<h1><hr/>';

		var data = resXml.getElementsByTagName('data');
		
		result.innerHTML += "<td>"+"</td>";
		for(var i=0; i < 20; i++){
			
			var hour = data[i].getElementsByTagName('tmEf')[0].textContent;
			result.innerHTML += "<th>"+hour+"</th>";
		}
		

		
		result2.innerHTML += "<th>"+"최저온도"+"</th>";
		for(var i=0; i < 20; i++){
			
			
			var min = data[i].getElementsByTagName('tmn')[0].textContent;
			result2.innerHTML += "<td>"+min+"</td>";
			
		}

		result3.innerHTML += "<th>"+"최고온도"+"</th>";
		for(var i=0; i < 20; i++){
			
			
			var max = data[i].getElementsByTagName('tmx')[0].textContent;
			result3.innerHTML += "<td>"+max+"</td>"
		}

		$('#tbl').visualize({type:'bar'});
		$('#tbl').visualize({type:'line',lineWeight : 2 });
		$('#tbl').visualize({type:'area',width : '400px'});
		$('#tbl').visualize({type:'pie',pieLabelPos : 'outside'});
		
	}	

	 
		
		

		
		
			
	
		
	});
	
	
</script>
<script type="text/javascript">

</script>
</head>
<body>

<button id='kma'>일기예보</button>

<table id='tbl'>
<section>날씨도표</section>
<thead>
<tr id='result'>



</tr>
</thead>
<tbody>
<tr id='result2'>



</tr>
<tr id='result3'>



</tr>
</tbody>

</table>

</body>
</html>