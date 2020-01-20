
$(function(){
	
	var topDiv = $('.tabSet');
	var a = topDiv.find('.tabs a');
	var panels = topDiv.find('.panel');
	
	var lastA = a.filter('.on');
	var lastPanel = $(lastA.attr('href'));
	
	a.show();
	panels.hide();
	lastPanel.show();
	
	a.click(function(evt){
		//본연의 이벤트 속성을 제거(***** 기억)
		//evt.preventDefault();
		var currA = $(this);
		var currPanel = $(currA.attr('href'));
		
		lastA.removeclass('on');
		currA.addClass('on');
		
		lastPanel.hide();
		lastA = currA;
		
		lastPanel = currPanel;
		currPanel.show();
	});
	
});