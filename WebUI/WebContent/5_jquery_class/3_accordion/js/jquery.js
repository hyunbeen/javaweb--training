/**
 * 
 */

$(document).ready(function(){
	
	
	$('.accordion').each(function(){
		
	
		var dl = $(this);
		var allDt = dl.find('dt');
		var allDd = dl.find('dd');
		
		allDd.hide();
		allDt.css('cursor','pointer');
		
		allDt.click(function(){
			//모든 dd를 닫으시고 클릭한 dt의 다음요소 dd만 열기
			
			allDd.hide();
			$(this).next().show();
			allDt.css('cursor','pointer');
			$(this).css('cursor','default');
		});
	
	});
	
	
	
});