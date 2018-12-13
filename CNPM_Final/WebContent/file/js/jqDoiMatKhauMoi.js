
    $(function(){

       $("#formdoimatkhaumoi").validate({
        rules: {
            password: {
                required: true,
                minlength: 6
            },
            repassword: {
                required: true,
                equalTo: "#password"
            },
        },
        messages: {
            password: {
                required: "Bạn phải nhập mật khẩu mới!",
                minlength: "Mật khẩu tối thiểu 6 ký tự"
            },
            repassword: {
                required: "Bạn không được bỏ trống!",
                equalTo: "Không khớp mật khẩu!"
            },
        },
    });

});
