$(function(){
	$("#formtlph").validate({
            rules: {
                noidung: {
                    required: true,
                    minlength: 10
                },
                textA: {
                    required: true
                },
                 textB: {
                    required: true
                },
                 textC: {
                    required: true
                },
                 textD: {
                    required: true
                },
                textkey: {
                    required: true
                }

            },
           messages: {
                noidung: {
                    required: "Bạn phải nhập nội dung câu hỏi!",
                    minlength: "Tối thiểu là 10 ký tự!"
                },
                textA: {
                    required: "Hãy nhập lựa chọn!"
                },
                textB: {
                    required: "Hãy nhập lựa chọn!"
                },
                textC: {
                    required: "Hãy nhập lựa chọn!"
                },
                textD: {
                    required: "Hãy nhập lựa chọn!"
                },
                textkey: {
                    required: "Hãy nhập đáp án!"
                }

            },
         })
});
