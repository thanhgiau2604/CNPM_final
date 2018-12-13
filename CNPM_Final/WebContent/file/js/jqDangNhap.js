$(function(){
	$("#formdangnhap").validate({
		rules: {
			username: {
				required: true,
				minlength: 5,
			},
			password: {
				required: true,
				minlength: 6
			}
		},
		messages: {
			username: {
				required: "Đây là trường bắt buộc",
				minlength: "Tên đăng nhập có ít nhất 5 ký tự",

			},
			password: {
				required: "Mật khẩu là bắt buộc", 
				minlength: "Mật khẩu phải có ít nhất 6 ký tự"
			}
		},
	})
})