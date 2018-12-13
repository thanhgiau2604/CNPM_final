<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="vi">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>Webiste Thi Trắc Nghiệm Trực Tuyến</title>

	<!-- Bootstrap Core CSS -->
	<link href="file/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
	<!-- jquery -->
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<script type="text/javascript" src="file/js/jqDoiMatKhauMoi.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="file/css/G_QuenMK.css">
</head>
<body data-spy="scroll" data-target=".navbar-fixed-top" data-offset="90">
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container dt" id="idtrangchu">
				<div class="btn-btn-default nutlogin"><a href="Guest_DangNhap.jsp">Đăng nhập</a></div>
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
						<img class="navbar-brand" src="file/Images/logo3.png" alt="" width="70%" height="50px">
				</div>
				<div class="navbar-collapse navbar-ex1-collapse collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right menu">
						 <!-- <li class="hidden"><a href="#page-top"></a> </li> -->
						<li ><a class="btnTC" href="TrangChu.jsp#idtrangchu">TRANG CHỦ</a></li>
						<li ><a class="btnGT" href="TrangChu.jsp#gioithieu">GIỚI THIỆU</a></li>					
					</ul>
				</div><!-- /.navbar-collapse -->
				<!-- duong ke -->
				<div class="duongke"></div>
			</div> 
		</nav>

	<div class="main-content-agile doimk">
			<div class="sub-main-w3">
			 		<div class="wthree-pro text-center">
			 			<h2>ĐỔI MẬT KHẨU MỚI</h2>
			 		</div>
			 		<form action="ServletDoiMatKhauMoi" method="post" id="formdoimatkhaumoi" >
			 			<div class="pom-agile">
			 				<span class="field">Nhập mật khẩu mới:</span>
			 				<input name="password" class="user" type="password" id="password">
			 				<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
			 			</div>

						<div class="pom-agile">
							<span class="field">Xác nhận mật khẩu mới:</span>
							<input  placeholder="" name="repassword" class="oldpass" type="password">
							<span class="icon1"><i class="fa fa-unlock" aria-hidden="true"></i></span>
						</div>
			 			<div class="sub-w3l">
			 				<div class="right-w3l">
			 					<input type="submit" value="Tiếp tục" class="nutcontinue">
			 				</div>
			 			</div>
			 		</form>
			 	</div>
			 </div>
		</div> <!-- end quen pass -->
		    <!-- Footer -->
    <footer class="text-center">
        <div class="footer-above">
            <div class="logofooter">
                    <img class="imglogo" src="file/Images/logo3.png" alt="">
                </div>
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-4">
                        <h3>Địa chỉ</h3>
                        <p>Số 1, Võ Văn Ngân<br>Thủ Đức, Thành phố Hồ Chí Minh</p>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>LIÊN KẾT</h3>
                        <ul class="list-inline">
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-facebook"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-google-plus"></i></a>
                            </li>
                            <li>
                                <a href="#" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                            </li>
                        </ul>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>WEBSITE</h3>
                        <div class="col-xs-3 col-sm-3 col-md-2 col-lg-2"></div>
                        <div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
                            <ul class="shortlink">
                                <li><a href="TrangChu.jsp">Trang chủ</a></li>
                                <li><a href="TrangChu.jsp#baidang">Bài đăng</a></li>
                                <li><a href="TrangChu.jsp#gioithieu">Giới thiệu</a></li>
                                <li><a href="TrangChu.jsp#chucnang">Chức năng</a></li>
                            </ul>
                        </div>
                         <div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
                            <ul class="shortlink">
                                <li><a href="">Câu hỏi</a></li>
                                <li><a href="">Đề Thi</a></li>
                                <li><a href="">Điểm</a></li>
                                <li><a href="">Thông báo</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; Our Website 2018
                    </div>
                </div>
            </div>
        </div>
    </footer> <!-- end footer -->
</body>
</html>