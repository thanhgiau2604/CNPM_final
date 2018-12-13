$(function(){
	$('.btnGT').click(function(){
		$('html, body').animate({scrollTop:$('.gioithieu').offset().top-80});
		return false;
	})
	$('.btnTC').click(function(){
		$('html, body').animate({scrollTop:0});
		
	})
})