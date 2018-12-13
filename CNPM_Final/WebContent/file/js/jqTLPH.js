$(function(){
	$("#formtlph").validate({
            rules: {
                noidungtl: {
                    required: true,
                    minlength: 10
                }

            },
            messages: {
                noidungtl: {
                    required: "Bạn không được bỏ trống nội dung!",
                    minlength: "Nội dung ít nhất 10 ký tự"
                }
            },
         })
});
