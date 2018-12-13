 $(function(){
   var docao = $(window).height();
   var dorong = $(window).width(); 
   $(".anhnen").css({'height':docao});
   $(".anhnen img").css({'width':(0.64*dorong-((dorong-407)*(17/47200))*dorong), 
    'left':(.4*dorong+((dorong-407)*(5/23600))*dorong)});
   $(window).resize(function(){
     var docao = $(window).height();
     var dorong = $(window).width(); 
     $(".anhnen").css({'height':docao});
     $(".anhnen img").css({'width':(0.64*dorong-((dorong-407)*(17/47200))*dorong), 
       'left':(.4*dorong+((dorong-407)*(5/23600))*dorong)});
     $(".chuto").css({'font-size':(20+(dorong-407)*(17/472))});
     $(".chunho").css({'font-size':(15+(dorong-407)*(15/944))});
     $(".nutgt").css({'top':(0.62*docao+((dorong-407)*(1/5900))*docao), 
       'left':(.26*dorong-((dorong-407)*(1/23600))*dorong)});
     $("img.navbar-brand").css({'width':(167+(dorong-407)*(23/942))});
    })


   $(window).scroll(function(){
    cur = $('html, body').scrollTop();
    if (cur > 200 ){
      $('.navbar-fixed-top').addClass('tienhoa')
    } else $('.navbar-fixed-top').removeClass('tienhoa');
   })
})