$(function(){
	$("#formtdtt").validate({
            rules: {
                fullname: {
                    required: true,
                    minlength: 5
                },
                mkc2: {
                	required: true,
                	minlength: 6
                },
                email: {
                    required: true,
                    email: true
                },
                telenum: {
                    required: true,
                    minlength:10,
                    maxlength:12,
                    number: true
                },
                address: {
                    required: true,
                },
            },
            messages: {
                fullname: {
                    required: "Bạn phải nhập họ và tên!",
                    minlength: "Tên kì thi ít nhất là 5 ký tự!"
                },
                mkc2: {
                	required: "Bạn chưa nhập mật khẩu cấp 2!",
                	minlength: "Mật khẩu ít nhất là 6 ký tự!"
                },
                email: {
                    required: "Bạn phải nhập email!",
                    email: "Email không đúng định dạng!"
                },
                telenum: {
                    required: "Bạn phải nhập số điện thoại cá nhân!",
                    number: "Bạn phải nhập số!",
                    minlength: "Số điện phải phải có ít nhất 9 chữ số!",
                    maxlength: "Số điện thoại có tối đa 12 chữ số!"
                },
                address: {
                    required: "Bạn phải nhập địa chỉ",
                },
            },
         })
});
