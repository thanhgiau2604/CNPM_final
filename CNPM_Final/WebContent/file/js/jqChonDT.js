$(function(){
	TweenMax.staggerFrom($('.thumbnail'),0.5,{top:100,opacity:0},0.5) 
	 $('.caption').mouseenter(function () {
        $('.caption').velocity({boxShadowBlur:25},{
            duration: 400
        });
      $('.caption img').velocity({scale:1.5},{
            duration: 400
        });
        $('.caption figcaption').velocity({
            translateX: [0, '100%'],
            opacity: [1, 0]
        }, {
            duration: 400
        });
      $('.figcaption-wrap').velocity('transition.perspectiveUpIn', {delay:400});
    })
	 .mouseleave(function () {
        $('.caption,.caption figcaption,.figcaption-wrap, .caption img').velocity('reverse');
    });



	 	$('.caption1').mouseenter(function () {
        $('.caption1').velocity({boxShadowBlur:25},{
            duration: 400
        });
      $('.caption1 img').velocity({scale:1.5},{
            duration: 400
        });
        $('.caption1 figcaption').velocity({
            translateX: [0, '100%'],
            opacity: [1, 0]
        }, {
            duration: 400
        });
      $('.figcaption-wrap').velocity('transition.perspectiveUpIn', {delay:400});
    })
	 .mouseleave(function () {
        $('.caption1,.caption1 figcaption,.figcaption-wrap, .caption1 img').velocity('reverse');
    });
});