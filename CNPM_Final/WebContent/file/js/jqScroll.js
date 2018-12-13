$(function(){
	 var count=1;
	$(window).scroll(function(){
		cur = $('html, body').scrollTop();
		if (cur=$('.chucnang').offset().top+100&&count==1) 
		{
			count=2;
			TweenMax.staggerFrom($('.thumbnail'),1,{top:100,opacity:0},0.4);
		}	
	})
});