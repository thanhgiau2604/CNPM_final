$(function(){
	$("#formthemtb").validate({
            rules: {
            	 maTB: {
                     required: true
                 },
                noidungTB: {
                    required: true,
                    minlength: 10
                },
                optradio: {
                    required: true
                }

            },
            messages: {
            	maTB: {
                    required: "Nhập mã thông báo"
                },
                noidungTB: {
                    required: "Bạn không được bỏ trống nội dung!",
                    minlength: "Nội dung thông báo ít nhất 10 ký tự"
                },
                optradio: {
                    required: "!"
                }
            },
         })
});
