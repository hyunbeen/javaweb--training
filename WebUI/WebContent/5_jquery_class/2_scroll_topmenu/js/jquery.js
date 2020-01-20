/**
 * 
 */

$(function(){
	$(window).scroll(function(){
		$('#navigation').css('top',$(document).scrollTop());
	});
	
	$('#navigation li').hover(function(){
		$(this).animate({paddingLeft: '+=15px'},100);
	},function(){
		$(this).animate({paddingLeft: '-=15px'},100);
	})
});