$(function(){
	$("#formtlph").validate({
            rules: {
                noiDung: {
                    required: true,
                    minlength: 10
                },
                luaChonA: {
                    required: true
                },
                luaChonB: {
                    required: true
                },
                luaChonC: {
                    required: true
                },
                luaChonD: {
                    required: true
                },
                dapAn: {
                    required: true
                }

            },
           messages: {
                noiDung: {
                    required: "Bạn phải nhập nội dung câu hỏi!",
                    minlength: "Tối thiểu là 10 ký tự!"
                },
                luaChonA: {
                    required: "Hãy nhập lựa chọn!"
                },
                luaChonB: {
                    required: "Hãy nhập lựa chọn!"
                },
                luaChonC: {
                    required: "Hãy nhập lựa chọn!"
                },
                luaChonD: {
                    required: "Hãy nhập lựa chọn!"
                },
                dapAn: {
                    required: "Hãy nhập đáp án!"
                }

            },
         })
});
