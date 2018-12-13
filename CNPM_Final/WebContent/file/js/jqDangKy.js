$(function(){
    jQuery.validator.addMethod("notEqual", function(value, element, param) {
        return this.optional(element) || value != $(param).val();
    }, "This has to be different...");

    $.validator.methods.email = function( value, element ) {
        return this.optional( element ) || /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/.test( value );
    }
    $("#formdangky").validate({
            rules: {
                username: {
                    required: true,
                    minlength: 6
                },
                password: {
                    required: true,
                    minlength: 6
                },
                repassword: {
                    required: true,
                    equalTo: "#password"
                },
                passwordc2: {
                    required: true,
                    notEqual: "#password"
                },
                email: {
                    required: true,
                    email: true
                },
                fullname: {
                    required: true,
                    minlength: 6
                },
                telenum: {
                    required: true,
                    minlength:10,
                    maxlength:12,
                    number: true
                },
            },
            messages: {
                username: {
                    required: "Tên đăng nhập là bắt buộc!",
                    minlength: "Ít nhất 6 ký tự!"
                },
                password: {
                    required: "Mật khẩu là bắt buộc!",
                    minlength: "Ít nhất 6 ký tự!"
                },
                repassword: {
                    required: "Bạn chưa xác nhận mật khẩu!",
                    equalTo: "Chưa khớp mật khẩu"
                },
                 passwordc2: {
                    required: "Bạn phải nhập mật khẩu cấp 2!",
                    notEqual: "Bạn phải nhập khác với mật khẩu chính!"
                },
                 email: {
                    required: "Bạn phải nhập email!",
                    email: "Chưa đúng định dạng Email"
                },
                fullname: {
                    required: "Bạn quên nhập họ và tên!",
                    minlength: "Ít nhất 6 ký tự!"
                },
                telenum: {
                    required: "Hãy nhập số điện thoại của bạn!",
                    minlength:"Tối thiểu 10 chữ số",
                    maxlength:"Tối đa 12 chữ số",
                    number: "Bạn không được nhập khác số!"
                },
            },
         })
});
