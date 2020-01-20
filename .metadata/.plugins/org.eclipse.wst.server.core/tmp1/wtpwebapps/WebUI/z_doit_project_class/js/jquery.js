$(function(){
	var ck = $.cookie('promotion');
	if(ck == null ||  ck != 'true'){
		window.open("9_promotion.html","","width=580, height=530");
	}
	
	$('img[alt="로그인"]').click(function(){
		$('#login_f').animate({top :"20px"});
	});
	
	
	
	$('img[alt="닫기버튼"]').click(function(){
		$('#login_f').animate({top:"-500px"});
	});
	
	$('img[alt="전체메뉴"]').click(function(){
		$('#total_menu').css({"display":"inline"});
	});
	
	$('img[alt="전체메뉴 닫기"]').click(function(){
		$('#total_menu').css("display","none");
	});
	
	
	var d = new Date();
	$('.year').text(d.getFullYear());
	$('.month').text(d.getMonth());
	$('.date').text(d.getDate());
	
	$('#keyword').focus(function(){
		$('#keyword').css({background : "none" , outline : "none"});
	});
	
	$('#keyword').blur(function(){
		$('#keyword').css({background : "url('/WebUI/z_doit_project_class/images/sch_guide.gif') no-repeat"});
	});
	
	
	var topDiv = $('#tabmenu');

	
	var dd = topDiv.find('dd');
	var dt = topDiv.find('dt');
	var a = dt.find('a');
	var img = a.find('img');
	var lastA = a.filter('.on');
	var lastdd = $(lastA.attr('href'));
	
	a.show();
	dd.hide();
	lastdd.show();
	
	
	
	
	a.click(function(evt){
		//본연의 이벤트 속성을 제거(***** 기억)
		evt.preventDefault();
		
		img.each(function(){
			$(this).attr('src',$(this).attr('src').replace('over','out'));
		});
		
		
	$(this).find('img').attr("src",$(this).find('img').attr("src").replace('out','over'));

		
		
		
		
		
		var currA = $(this);
		var currdd = $(currA.attr('href'));
		
		
		
		lastA.removeClass('on');
		currA.addClass('on');
		
		lastdd.hide();
		lastA = currA;
		
		lastdd = currdd;
		currdd.show();
	
		 
		var slider = $('#best_book').bxSlider({
			
			maxSlides : 4,
			minSlides : 4,
			slideWidth : 400,
			slideMargin: 10,
			moveSlides : 1,
			auto :true,
			speed : 400
		});
		
		$('.prev_btn').click(function(){
			slider.goToPrevSlide();
			return false;
		});
		
		$('.next_btn').click(function(){
			slider.goToNextSlide();
			return false;
		});
		
		
	});
	
	
});