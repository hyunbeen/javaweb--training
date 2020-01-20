
	$(function(){
		var hide = $('#hideButton');
		var show = $('#showButton');
		var toggle = $('#toggleButton');
		
		hide.click(function(){
			$('#mygrim').hide();
		});
		
		
		show.click(function(){
			$('#mygrim').show();
		});
		
		toggle.click(function(){
			var grim = $('#intro > img');
			if(grim.is(':visible')){
				grim.hide();
			}else{
				grim.show();
			}
			
		});
		
	
		
		$('.data tbody tr ').each(function(){
			
			$(this).hover(function(){
				$(this).addClass("table_striping");
			},function(){
				$(this).removeClass("table_striping");
			});
		});
		
		$('.data tbody tr :odd ').each(function(){
			
			$(this).hover(function(){
				$(this).addClass("td_mouseover");
			},function(){
				$(this).removeClass("td_mouseover");
			});
		});
		
		
		
		$('.rollover>img').each(function(){
			var img = $(this);
			var off = img.attr('src');
			var on = off.replace('off','on');
			
			$(this).hover(function(){
				img.attr('src',on);
			},function(){
				img.attr('src',off);
			});
			
		});
		
		
		
		
	});
