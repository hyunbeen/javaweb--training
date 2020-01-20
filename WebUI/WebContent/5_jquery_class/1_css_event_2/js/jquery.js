
	$(function(){
	
		
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