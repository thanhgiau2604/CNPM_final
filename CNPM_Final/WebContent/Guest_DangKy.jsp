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
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
	<!-- js -->
	<script type="text/javascript" src="file/js/jqTC.js"></script>
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<script type="text/javascript" src="file/js/jqScroll.js"></script>
	<script type="text/javascript" src="file/js/jqDangKy.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="file/css/DangKy.css">
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
						<li ><a class="btnTC" href="#idtrangchu">TRANG CHỦ</a></li>
						<li ><a class="btnGT" href="#idgioithieu">GIỚI THIỆU</a></li>					
					</ul>
				</div><!-- /.navbar-collapse -->
				<!-- duong ke -->
				<div class="duongke"></div>
			</div> 
		</nav>

		  <!-- form dang ky -->
		<div class="main-content-agile dangky">
		<div class="sub-main-w3">	
			<div class="wthree-pro">
				<h2>Đăng ký tài khoản</h2>
			</div>
			<form action="ServletDangKyTaiKhoan" method="post" id="formdangky">
				<div class="pom-agile">
				<!-- tên đăng nhập -->
					<input placeholder="*Tên đăng nhập" name="username" class="user" type="text">
					<span class="icon1"><i class="fa fa-user" aria-hidden="true"></i></span>
				</div>
				<!-- mật khẩu -->
				<div class="pom-agile">
					<input  placeholder="*Mật khẩu" name="password" class="Infor" type="password" id="password">
					<span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<!-- Xác nhận mk -->
				<div class="pom-agile">
					<input  placeholder="*Xác nhận mật khẩu" name="repassword" class="Infor" type="password" >
					<span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<!-- mật khẩu cap 2 -->
				<div class="pom-agile">
					<input  placeholder="*Mật khẩu cấp 2" name="passwordc2" class="Infor" type="password" >
					<span class="icon2"><i class="fa fa-unlock" aria-hidden="true"></i></span>
				</div>
				<!-- Họ tên -->
				<div class="pom-agile">
					<input  placeholder="*Họ và tên" name="fullname" class="Infor" type="text">
					<span class="icon2"><i class="fa fa-address-card" aria-hidden="true"></i></span>
				</div>
				<!-- Email -->
				<div class="pom-agile">
					<input  placeholder="*Email" name="email" class="Email" type="text">
					<span class="icon2"><i class="fa fa-envelope" aria-hidden="true"></i></span>
				</div>
				<!-- Số điện thoại -->
				<div class="pom-agile">
					<input  placeholder="Số điện thoại" name="telenum" class="Infor" type="text">
					<span class="icon2"><i class="fa fa-phone" aria-hidden="true"></i></span>
				</div>
				<!-- Địa chỉ -->
				<div class="pom-agile">
					<input  placeholder="*Địa chỉ" name="address" class="Infor" type="text">
					<span class="icon1"><i class="fa fa-address-book"></i></span>
				</div>
				<div class="pom-agile" style="padding-left: 20%; font-size: 17px">
					<input class="Infor" type="radio" name="role" value="gv">Giáo viên
					<input class="Infor" type="radio" name="role" value="ad">Thí sinh
				</div>
				<div class="sub-w3l">
					<h6>Đã có tài khoản? <a href="Guest_DangNhap.jsp" class="dky">Đăng nhập</a></h6> 
					<div class="right-w3l">
						<input type="submit" value="Đăng ký">
					</div>
				</div>
			</form>
		</div>
	</div>
	<!-- end form dang ky-->
		
	<!-- welcome -->

	<section id="tl-intro" class="tl-intro bg-solid">
		<div class="container">
			<div class="row no-gutters">
				<div class="col-lg-4 wow zoomIn" data-wow-delay=".1s">
					<a href="#" class="tl-intro-wrapper bg-yellow">
						<span class="intro-icon">
							<i class="fa fa-question"></i>
						</span> <!-- Intro Icon End -->
						<div class="intro-content">
							<h6 class="intro-title">CÂU HỎI</h6>
							<p>Được cập nhật thường xuyên</p>
							<p>Thuộc nhiều lĩnh vực khác nhau</p>
						</div> <!-- Intro Content end -->
					</a> <!-- Intro Wrapper end -->
				</div> <!-- Col End -->
				<div class="col-lg-4 wow zoomIn" data-wow-delay=".3s">
					<a href="#" class="tl-intro-wrapper bg-green">
						<span class="intro-icon">
							<i class="fa fa-list-ol"></i>
						</span> <!-- Intro Icon End -->
						<div class="intro-content">
							<h6 class="intro-title">ĐỀ THI</h6>
							<p>Sắp xếp ngẫu nhiên các câu hỏi</p>
							<p>Phong phú, mới lạ</p>
						</div> <!-- Intro Content end -->
					</a> <!-- Intro Wrapper end -->
				</div> <!-- Col End -->
				<div class="col-lg-4 wow zoomIn" data-wow-delay=".5s">
					<a href="#" class="tl-intro-wrapper bg-orange">
						<span class="intro-icon">
							<i class="fa fa-eye"></i>
						</span> <!-- Intro Icon End -->
						<div class="intro-content">
							<h6 class="intro-title">ĐÁNH GIÁ</h6>
							<p>Công tâm khách quan</p>
							<p>Phản hồi lại - nếu cần thiết</p>
						</div> <!-- Intro Content end -->
					</a> <!-- Intro Wrapper end -->
				</div> <!-- Col End -->
			</div> <!-- Row End -->
		</div> <!-- Container end --></section>


		<section id="tl-about" class="tl-about">
			<div class="container">
				<div class="row">
					<div class="col-lg-8">
						<h2 class="column-title wow fadeIn" data-wow-delay=".1s">
							Chào bạn <br/>đến với website thi trắc nghiệm trực tuyến
						</h2>
						<div class="about-content">
							<p class="wow fadeIn">Nếu bạn có niềm đam mê kiến thức hoặc đang chuẩn bị ôn luyện kiến thức để kiểm tra hay thi cử thì website thi trắc nghiệm của chúng tôi sẽ là một lựa chọn đúng đắn. Bởi lẽ, đến với website bạn không những được trải nghiệm với những đề thi cực hot do giáo viên tạo mà hệ thống còn bổ sung những đề thi được cập nhật liên tục về những kiến thức mới nhất. Còn chờ gì nữa, hãy ghi danh với chúng tôi <a href="">tại đây</a>. Chúng tôi sẽ tích cực hỗ trợ bạn!</p>
							<div class="row hinhanh">
								<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
									<img src="file/Images/learning.png">
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
									<img src="file/Images/teach.jpg">
								</div>
								<div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
									<img src="file/Images/use.png">
								</div>
							</div>
							<div>
								<p>Để đạt kết quả tốt nhất trong việc học tập, chúng ta phải biết kết hợp giữa việc học tập và giảng dạy trên ghế nhà trường với với việc ôn luyện trực tuyến và đó cũng chính là việc kết hợp hiệu quả giữa lý thuyết và thực hành!</p>
							</div>
						</div> <!-- About Content end -->
					</div> <!-- Col end -->
					<div class="col-lg-4 wow fadeInRight" id="baidang">
						<div class="about-event">
							<h2 class="event-title">Bài đăng gần đây</h2>
							<div class="event-box-wrapper">
								<div class="event-time">
									<span class="event-date">20</span>
									<span class="event-month">July</span>
								</div> <!-- Event Time End -->
								<div class="event-info">
									<h5 class="event-name"><a href="">Phương pháp học tập hiệu quả</a></h5>
									<p class="event-desc">We ever undertakes laborious physical exercise, except to obtain some..</p>
								</div> <!-- Event Info end -->
							</div> <!-- Event Box End -->
							<div class="event-box-wrapper">
								<div class="event-time">
									<span class="event-date">10</span>
									<span class="event-month">Aug</span>
								</div> <!-- Event Time End -->
								<div class="event-info">
									<h5 class="event-name"><a href="">Kì thi THPT quốc gia 2019</a></h5>
									<p class="event-desc">We ever undertakes laborious physical exercise, except to obtain some..</p>
								</div> <!-- Event Info end -->
							</div> <!-- Event Box End -->
							<div class="event-box-wrapper"">
								<div class="event-time">
									<span class="event-date">04</span>
									<span class="event-month">Sep</span>
								</div> <!-- Event Time End -->
								<div class="event-info">
									<h5 class="event-name"><a href="">Bảo trì nâng cấp Server</a></h5>
									<p class="event-desc">We ever undertakes laborious physical exercise, except to obtain some..</p>
								</div> <!-- Event Info end -->
							</div> <!-- Event Box End -->
						</div> <!-- About Event End -->
					</div><!-- Col End -->
				</div> <!-- Row End -->
			</div> <!-- Container end --></section>
<!-- About Area End -->


	<!-- end welcome + baidang -->
	<!-- 	gioithieu -->
<div class="khunggioithieu" id="gioithieu">
	<div class="container gioithieu" id="idgioithieu">
		<h2 class="text-center">GIỚI THIỆU</h2>
		<div class="row intro text-center">
			<div class="col-xs-12 col-sm-12 col-md-10 col-lg-10 col-md-push-1 text-justify">
				<p class="modau">Ngành công nghiệp hóa đất nước nói chung và ngành giáo dục nói riêng ngày càng phát triển. Vì thế, nhu cầu phát triển tri thức của con người ngày càng cao, trong đó có cả học sinh, giáo viên và những tổ chức giáo dục. Website thi trắc nghiệm trực tuyến được lên ý tưởng thiết kế cũng dựa trên nhu cầu cần thiết ấy.</p>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-0 col-sm-0 col-md-1 col-lg-1"></div>
			<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/yt.jpg" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1">
						<h3 class="fw-6">Về ý tưởng</h3>
						<p>Dựa trên nhu cầu học tập và giảng dạy của sinh viên và giáo viên trong và ngoài nhà trường.</p>
					</div>
				</div>	
			</div>
			<div class="col-xs-0 col-sm-0 col-md-1 col-lg-1"></div>
			<div class="col-xs-6 col-sm-6 col-md-4 col-lg-4">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/aim.png" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1">
						<h3 class="fw-6">Về mục đích</h3>
						<p>Giúp sinh viên ôn tập và bổ sung kiến thức, giúp giáo viên tiết kiệm thời gian, công sức.</p>
					</div>
				</div>	
			</div>
		</div>
		<p style="padding-bottom: 13px">Đến với website, chúng tôi có thể khiến bạn yên tâm về:</p>
		<div class="row">
			<!-- tính chính xác -->
			<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/exactly.jpg" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1 tinhchat1">
						<h3 class="fw-6">Tính chính xác</h3>
						<p>Website hoạt động chính xác trong việc đưa tra kết quả của các thao tác đưa đến người dùng.</p>
					</div>
				</div>	
			</div>
			<!-- tính hiệu quả -->
			<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/Effective.gif" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1 tinhchat2">
						<h3 class="fw-6">Tính hiệu quả</h3>
						<p>Thao tác thực hiện nhanh chóng, hiệu quả, hỗ trợ học sinh, sinh viên, giáo viên trong việc dạy và học.</p>
					</div>
				</div>	
			</div>
			<!-- tính tiện dụng -->
			<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/easy.jpg" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1 tinhchat3">
						<h3 class="fw-6">Tính tiện dụng</h3>
						<p>Giao diện website được thiết kế đơn giản, dễ dàng quan sát, các tính năng đơn giản dễ sử dụng.</p>
					</div>
				</div>	
			</div>
			<!-- tính tương thích -->
			<div class="col-xs-6 col-sm-6 col-md-3 col-lg-3">
				<div class="item">
					<div class="item-thumb">
						<a href="#">
							<img src="file/Images/tuongthich.gif" alt="intro thumb" width="100%">
						</a>
					</div>
					<div class="item-txt text-center f1 tinhchat4">
						<h3 class="fw-6">Tính tương thích</h3>
						<p>Website hoạt động được trên nhiều thiết bị. Người dùng có thể dùng trên PC, laptop, table, điện thoại.</p>
					</div>
				</div>	
			</div>
		</div>
		<div class="introcn">
		</br>
		<div class="khungcn">  
			<span class="cntext">
				Về chức năng của webiste:
			</span>
		</div>
		<div class="detail"> 
			<div class="row">
				<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"> </div>
				<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" style="padding-top: 10px">
					<p>Website được phân chia thành 4 quyền truy cập: khách, giáo viên, thí sinh, admin.
						Mỗi quyền truy cập có những chức năng khác nhau. Chi tiết một số chức năng chính được
						thể hiện <a href="#">tại đây</a>.</p> 
				</div>
			</div>

				<div class="note">
					<div class="row">
						<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"> </div>
						<div class="col-xs-9 col-sm-9 col-md-9 col-lg-9" style="padding-bottom: 40px">
							<span><i><span class="fa fa-exclamation-circle fa-2x"></span></i></span>
							<span class="luuy">Bạn được sử dụng chức năng chính của website chỉ khi được là thành viên của website, bạn có thể đăng ký thành viên <a href="">tại đây</a>, nếu đã có tài khoản bạn có thể <a href="">đăng nhập</a>.</span>
						</div>
					</div>
				</div>	
			</div>
		</div>	  
	</div>
</div>
			
    
	<!-- end gioi thieu -->
		<!-- Chức năng -->
		<div class="chucnang" >
			<div class="container" id="chucnang">
				<div class="col-lg-12 text-center">
					<h2>CHỨC NĂNG CHÍNH</h2>
				</div>	
				<div class="row">
					<div class="col-md-2 col-md-push-5">
						<hr class="small text-center">
					</div>
				</div>					
					<div class="row text-center">
						<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3 boxthumbnail">
							<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
								<div class="thumbnail">
									<img src="file/Images/cQuestion.png" width="70%" alt="" >
									<div class="overlay">
										<h3 style="color: white">Quản lý câu hỏi</h3>
										<a href="#" class="btn btn-primary nutclick">Chọn</a>
									</div>
									<div class="caption">
										<h3>Quản lý câu hỏi</h3>
										<p>
											Bạn có thể thêm, sửa, xóa các câu hỏi cho ngân hàng câu hỏi của mình. 
										</p>

										<p>
											<a href="#" class="btn btn-primary nutct">Chi tiết</a>
										</p>
									</div>
								</div>	
							</div>	
						</div>

						<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3 boxthumbnail">
							<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
								<div class="thumbnail">
									<img src="file/Images/cTest.png"  width="70%" alt="" >
									<div class="overlay">
										<h3 style="color: white">Quản lý đề thi</h3>
										<a href="#" class="btn btn-primary nutclick">Chọn</a>
									</div>
									<div class="caption">
										<h3>Quản lý đề thi</h3>
										<p>
											Bạn có thể thêm, sửa, xóa các đề thi cho danh cách đề thi đã tạo.
										</p>
									</br> 
									<p>
										<a href="#" class="btn btn-primary nutct btnerr1">Chi tiết</a>
									</p>
								</div>
							</div>	
						</div>	
					</div>

					<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
						<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
							<div class="thumbnail">
								<img src="file/Images/qlDiem.jpg"  width="70%" alt="" >
								<div class="overlay">
									<h3 style="color: white">Quản lý điểm</h3>
									<a href="#" class="btn btn-primary nutclick">Chọn</a>
								</div>
								<div class="caption">
									<h3>Quản lý điểm</h3>
									<p>
										Bạn có thể xem điểm, tìm kiếm thí sinh và lọc danh sách điểm theo nhiều tiêu chí khác nhau.  
									</p>

									<p>
										<a href="#" class="btn btn-primary nutct">Chi tiết</a>
									</p>
								</div>
							</div>	
						</div>	
					</div>


					<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
						<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
							<div class="thumbnail">
								<img src="file/Images/start-test.jpg"  width="70%" alt="" >
								<div class="overlay">
									<h3 style="color: white">Vào thi</h3>
									<a href="#" class="btn btn-primary nutclick">Chọn</a>
								</div>
								<div class="caption">
									<h3>Vào thi</h3>
									<p>
										Bạn có thể thi tất cả các đề thi có trong hệ thống. 
									</p>
								</br> 
								<p>
									<a href="#" class="btn btn-primary nutct">Chi tiết</a>
								</p>
							</div>
						</div>	
					</div>	
				</div>
			</div>
                        
			<div class="row text-center">
				<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
					<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
						<div class="thumbnail">
							<img src="file/Images/XemLai.png"  width="70%" alt="" >
							<div class="overlay">
								<h3 style="color: white">Xem lại bài làm</h3>
								<a href="#" class="btn btn-primary nutclick">Chọn</a>
							</div>
							<div class="caption">
								<h3>Xem lại bài làm</h3>
								<p>
									Sau khi hoàn thành bài thi, bạn có thể xem lại để kiểm tra bài làm của mình.  
								</p>
								<p>
									<a href="#" class="btn btn-primary nutct">Chi tiết</a>
								</p>
							</div>
						</div>	
					</div>	
				</div>


				<div class="col-xs-12 col-sm-6 col-md-3 col-lg-3">
					<div class="preview_outer wow fadeIn" data-wow-delay="300ms">
						<div class="thumbnail">
							<img src="file/Images/send.jpg"  width="70%" alt="" >
							<div class="overlay">
								<h3 style="color: white">Gửi phản hồi</h3>
								<a href="#" class="btn btn-primary nutclick">Chọn</a>
							</div>
							<div class="caption">
								<h3>Gửi phản hồi</h3>
								<p>
									Nếu có thắc mắc với kết quả bài thi, bạn có thể gửi phản hồi trực tiếp với giáo viên đã tạo bài thi. 
								</p>
								<p>
									<a href="#" class="btn btn-primary nutct btnerr2">Chi tiết</a>
								</p>
							</div>
						</div>		
					</div>
				</div>
			</div>
					</div>
			</div>
		</div>
		<!-- end chức năng -->
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
                        <p>Số 1, Võ Văn Ngân<br>Thủ Đức, Thành Phố Hồ Chí Minh</p>
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
                    <div class="col-lg-12">
                        Copyright &copy; Our Website 2018
                    </div>
                </div>
            </div>
        </div>
    </footer> <!-- end footer -->
</body>
</html>