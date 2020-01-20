/**
 * 
 */

$(function(){
	
	$('a[rel$="Popin"]').prettyPopin({
		
		width : 550,
		callback : function(){
			alert('창을 닫습니다');
		}
	});
	
	
	
	
});