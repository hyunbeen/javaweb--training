/**
 * 
 */

$(document).ready(function(){
	
	$('#signup form').validate({
		rules : {
		
		name : {required : true},
		email : {
					required : true,
					email : true
		},
			
		website : {
			url : true
		},
		password : {
			minlength : 6
		},
		passconf : {
			equalTo : '#password'
		}
		
	},
		success : function(label){
			label.addClass('valid');
			label.text("성공");
			
		}
	});
	
	
	$('.check-all').click(function(){
		
//			$('.agree').each(function(){
//				this.checked = $('.check-all').is(":checked");
//			})
		
		$('.agree').prop('checked',$(this).is(":checked"));
		//$('.agree').prop('checked',this.checked);
		
	});
	
	$('.agree').click(function(){
	
		if(!$(this).is(":checked")){
			$('.check-all').prop('checked',false);
		}
	
	});
	
});