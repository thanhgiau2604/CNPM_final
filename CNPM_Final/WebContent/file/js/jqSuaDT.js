$(function(){
	/* $(window).load(function(){		
		$(".input-effect input").focusout(function(){
			if($(this).val() != ""){
				$(this).addClass("has-content");
			}else{
				$(this).removeClass("has-content");
			}
		})
	});*/

	$("#formnhaplieu").validate({
            rules: {
                kithi: {
                    required: true,
                    minlength: 2
                },
                monthi: {
                    required: true,
                    minlength: 2
                },
                socauhoi: {
                    required: true,
                    number: true
                },
                diem: {
                    required: true,
                    number: true
                },
            },
            messages: {
                kithi: {
                    required: "Bạn phải nhập kỳ thi!",
                    minlength: "Tên kì thi ít nhất là 2 ký tự"
                },
                monthi: {
                    required: "Bạn chưa nhập môn thi!",
                    minlength: "Môn thi ít nhất là 2 ký tự"
                },
                socauhoi: {
                    required: "Bạn phải nhập số câu hỏi của đề thi",
                    number: "Bạn phải nhập số"
                },
                diem: {
                    required: "Bạn phải nhập điểm của đề thi",
                    number: "Bạn phải nhập số"
                },
            },
         })
});
