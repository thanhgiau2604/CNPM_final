$(function(){
	$("#formdoimatkhau").validate({
            rules: {
                passwordold: {
                    required: true,
                    minlength: 6
                },
                passwordnew: {
                    required: true,
                    minlength: 6
                },
                repassword: {
                    required: true,
                    equalTo: "#PasswordNew",
                },
            },
            messages: {
            	passwordold: {
                    required: "Bạn phải nhập mật khẩu hiện tại",
                    minlength: "Mật khẩu phải có ít nhất 6 ký tự",

                },
                passwordnew: {
                    required: "Bạn phải nhập mật khẩu mới", 
                    minlength: "Mật khẩu phải có ít nhất 6 ký tự"
                },
                 repassword: {
                    required: "Bạn phải nhập lại mật khẩu mới", 
                    equalTo: "Mật khẩu không khớp"
                }
            },
         })
});