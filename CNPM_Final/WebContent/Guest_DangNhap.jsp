<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
<!-- jquery -->
<script type="text/javascript" src="file/js/jqTC.js"></script>
<script type="text/javascript" src="file/js/jqMenu.js"></script>
<script type="text/javascript" src="file/js/jqScroll.js"></script>
<script type="text/javascript" src="file/js/jqDangNhap.js"></script>
<!-- Custom Fonts -->
<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i"
	rel="stylesheet">
<link rel="stylesheet" type="text/css" href="file/css/DangNhap.css">
</head>
<body data-spy="scroll" data-target=".navbar-fixed-top" data-offset="90">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container dt" id="idtrangchu">
			<div class="btn-btn-default nutlogin">
				<a href="Guest_DangNhap.jsp">Đăng nhập</a>
			</div>
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<img class="navbar-brand" src="file/Images/logo3.png" alt=""
					width="70%" height="50px">
			</div>
			<div class="navbar-collapse navbar-ex1-collapse collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right menu">
					<!-- <li class="hidden"><a href="#page-top"></a> </li> -->
					<li><a class="btnTC" href="#idtrangchu">TRANG CHỦ</a></li>
					<li><a class="btnGT" href="#idgioithieu">GIỚI THIỆU</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
			<!-- duong ke -->
			<div class="duongke"></div>
		</div>
	</nav>

	<!-- form dang nhap -->
	<div class="main-content-agile dangnhap">
		<div class="sub-main-w3">
			<div class="wthree-pro">
				<h2>Đăng nhập</h2>
			</div>
			<form action="ServletDangNhap" method="post" id="formdangnhap">
				<div class="pom-agile">
					<input placeholder="Tên đăng nhập" name="username" class="user"
						type="text" required=""> <span class="icon1"><i
						class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<div class="pom-agile">
					<input placeholder="Mật khẩu" name="password" class="pass"
						type="password" required=""> <span class="icon2"><i
						class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<div class="sub-w3l">
					<h6>
						Chưa có tài khoản? <a href="Guest_DangKy.jsp" class="dky">Đăng
							ký ngay</a>
					</h6>
					<h6>
						<a href="Guest_QuenMatKhau.jsp">Quên mật khẩu?</a>
					</h6>
					<div class="right-w3l">
						<input type="submit" value="Đăng nhập"> </br>
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- end form dang nhap -->

	<!-- Footer -->
	<footer class="text-center">
		<div class="footer-above">
			<div class="logofooter">
				<img class="imglogo" src="file/Images/logo3.png" alt="">
			</div>
			<div class="container">
				<div class="row">
					<div class="footer-col col-md-4">
						<h3>ĐỊA CHỈ</h3>
						<p>
							Số 1, Võ Văn Ngân<br>Thủ Đức, Thành Phố Hồ Chí Minh
						</p>
					</div>
					<div class="footer-col col-md-4">
						<h3>LIÊN KẾT</h3>
						<ul class="list-inline">
							<li><a href="#" class="btn-social btn-outline"><i
									class="fa fa-fw fa-facebook"></i></a></li>
							<li><a href="#" class="btn-social btn-outline"><i
									class="fa fa-fw fa-google-plus"></i></a></li>
							<li><a href="#" class="btn-social btn-outline"><i
									class="fa fa-fw fa-twitter"></i></a></li>
						</ul>
					</div>
					<div class="footer-col col-md-4">
						<h3>WEBSITE</h3>
						<div class="col-xs-3 col-sm-3 col-md-2 col-lg-2"></div>
						<div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
							<ul class="shortlink">
								<li><a href="TrangChu.jsp">Trang chủ</a></li>
								<li><a href="#baidang">Bài đăng</a></li>
								<li><a href="#gioithieu">Giới thiệu</a></li>
								<li><a href="#chucnang">Chức năng</a></li>
							</ul>
						</div>
						<div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
							<ul class="shortlink">
								<li><a href="">Câu hỏi</a></li>
								<li><a href="">Đề thi</a></li>
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
					<div class="col-lg-12">Copyright &copy; Our Website 2018</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- end footer -->
</body>
</html>