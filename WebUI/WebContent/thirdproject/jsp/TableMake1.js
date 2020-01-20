function TableMake1() {
		
		var imsi = 1;
		var k = 0;
		
		var price=[6000,8200,6600,6800,2100,1900,1600,1600,2100,8200,4400,1900,5500,6600,8800,6800,2600,2100,1900,1700,6900,7100,4700,6900,10100,6900,9000,2200,1700,2100,1500,2000,3000,4000,500,600];
	    var names = [ '불고기버거','불고기와퍼세트','불고기치즈와퍼','불고기치즈와퍼주니어 세트','쉬림프치킨프라이','스프라이트L','아메리카노','아이스아메리카노','어니언링','와퍼세트','와퍼주니어','제로콜라L','치즈버거세트','치즈와퍼','치즈와퍼세트','치즈와퍼주니어세트','치즈프라이','치킨프라이','콜라L','콜라R','콰트로치즈와퍼','콰트로치즈와퍼주니어세트','크런치치킨','크런치치킨세트','통새우스테이크버거세트','통새우와퍼','통새우와퍼세트','프렌치프라이(L)','프렌치프라이(R)','핫초코' ];
	    
		document.write("<table name='menuTable' width='700px' height='600px'>");
		for (var i = 0; i < 4; i++) {
			document.write("<tr name='menutr'>");
			for (var j = 0; j < 4; j++) {
				document.write("<td name=''menutd' id='menu"+imsi+"'>");
				document.write("<img name='menu' src='image/"+imsi+".jpg'  "+"title="+names[k]+" alt="+price[k]+" height='100px' onclick='insertMenuPay(this)'>");
				document.write("</td>");
				imsi++;
				k++;
			}
			document.write("</tr>");
		}
		document.write("</table>");
		
	}