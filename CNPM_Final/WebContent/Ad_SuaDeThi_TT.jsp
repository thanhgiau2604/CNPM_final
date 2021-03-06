<%@page import="dblayer.DBConnect"%>
<%@page import="dao.DeThiDAO"%>
<%@ page import="java.sql.ResultSet" %>
<%@page import="javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%if (session.getAttribute("tenDN")==null)
	response.sendRedirect("Guest_DangNhap.jsp"); %>
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
	<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/2.0.2/TweenMax.min.js"></script>
	<script src="https://cdn.jsdelivr.net/npm/jquery-validation@1.17.0/dist/jquery.validate.min.js"></script>
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- jquery -->
	<script type="text/javascript" src="file/js/jqQLND.js"></script>
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link rel="stylesheet" type="text/css" href="file/css/Ad_SuaDT_TT.css">
</head>
<body>
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container dt" id="idtrangchu">
				<!-- start khung -->
				<div class="khung">
					<button class="nuttt">
						<img src="file/Images/Admin.png" alt="avatar" class="ava">
						${sessionScope.tenDN}
					</button>	
					<div class="danhmuctt">
						<a href="Ad_TDTT.jsp">Thay Đổi Thông Tin</a>
						<a href="Ad_DoiMatKhau.jsp">Đổi Mật Khẩu</a>
						<a href="TrangChu.jsp">Đăng Xuất</a>
					</div>
				</div> <!-- end khung -->

				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
					<img class="navbar-brand" src="file/Images/logo3.png" alt="" width="70%" height="50px">
				</div>
				<div class="collapse navbar-collapse navbar-ex1-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right menu">
						<li ><a class="btnTC" href="TrangChuAdmin.jsp#idtrangchu">TRANG CHỦ</a></li>
						<li ><a class="btnTC" href="Ad_QLCauHoi.jsp">QLCH</a></li>
						<li ><a class="btnTC" href="Ad_QLDeThi.jsp">QLDT</a></li>
						<li ><a class="btnTC" href="Ad_QLDiem.jsp">QLĐIỂM</a></li>
						<li ><a class="btnTC" href="Ad_QLTB.jsp">QLTB</a></li>
						<li ><a class="btnTC" href="AD_QLND_DS.jsp">QLUSER</a></li>
						<li ><a class="btnTC" href="AD_NhanPhanHoi.jsp">PHẢN HỒI</a></li>
						<li ><a class="btnTC" href="Ad_QLBaiDang.jsp">BÀI ĐĂNG</a></li>
						<li ><a class="btnGT" href="TrangChuAdmin.jsp#gioithieu">GIỚI THIỆU</a></li>					
					</ul>
				</div><!-- /.navbar-collapse -->
				<!-- duong ke -->
				<div class="duongke"></div>
			</div> 
		</nav>
<!-- content -->
		<div class="container">
			<div class="row vaothi">
				<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"></div>
				<div class="col-xs-10 col-sm-10 col-md-10 col-lg-10">
					<div class="boxtt">
						<div class="boxlist">
							<p class="td text-center">THÔNG TIN ĐỀ THI</p>
						</div>
						<%
					String madt = request.getParameter("madethi");
					System.out.println(madt);
					DeThiDAO dt = new DeThiDAO();
					ResultSet rs = dt.LayDeThiTheoMaDT(madt);
					while (rs.next())
					{
				%>
						<form action="ThemXoaSuaDeThi" method="post" id="formnhaplieu">
							<div class="tt">
								 <img src="file/Images/id.svg" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Mã đề thi" name="madethi" value="<%=rs.getString(1)%>">
									<label>Mã đề thi</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
							<div class="tt">
								<img src="file/Images/kythi.svg" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Kì thi" name="kithi" value="<%=rs.getString(2)%>">
									<label>Kỳ thi</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
							<div class="tt">
								<img src="file/Images/monthi.svg" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Môn thi" name="monthi" value="<%=rs.getString(3)%>">
									<label>Môn thi</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
							<div class="tt">
								<img src="file/Images/soluong.svg" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Số câu hỏi" name="socauhoi" value="<%=rs.getString(4)%>">
									<label>Số câu hỏi</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
								
							<div class="tt">
								<img src="file/Images/time.svg" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Thời Gian" name="thoigian" value="<%=rs.getString(5)%>">
									<label>Thời Gian</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
							
							<div class="tt">
								<img src="file/Images/cQuestion.png" alt="" height="30" class="anhicon">
								<div class="col-3 input-effect dulieu">
									<input class="effect-21" type="text" placeholder="Điểm" name="diem" value="<%=rs.getString(6)%>">
									<label>Điểm</label>
									<span class="focus-border">
										<i></i>
									</span>
								</div>
							</div>
							<input type="submit" value="Lưu và tiếp tục" class="nutsua" style="background: orange"
							formaction="ThemXoaSuaDeThi?chucNang=SuadtAdmin&nguoitao=${sessionScope.tenDN}">		
							<%} %>
						</form>
						
					</div>
				</div>
			</div>
		</div>
		
       <!-- end-->
		
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
                        		<li><a href="TrangChuAdmin.jsp">Trang chủ</a></li>
                        		<li><a href="TrangChuAdmin.jsp#baidang">Bài đăng</a></li>
                        		<li><a href="TrangChuAdmin.jsp#gioithieu">Giới thiệu</a></li>
                        		<li><a href="TrangChuAdmin.jsp#chucnang">Chức năng</a></li>
                        	</ul>
                        </div>
                         <div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
                         	<ul class="shortlink">
                         		<li><a href="Ad_QLCauHoi.jsp">Câu hỏi</a></li>
                         		<li><a href="Ad_QLDeThi.jsp">Đề thi</a></li>
                         		<li><a href="Ad_QLDiem.jsp">Điểm</a></li>
                         		<li><a href="Ad_QLTB.jsp">Thông báo</a></li>
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

    <!-- modal xoa -->
    <div class="modal fade" id="ModalXoa" tabindex="-1" role="dialog" aria-labelledby="ModalXoaLabel" aria-hidden="true">
    	<div class="modal-dialog" role="document">
    		<div class="modal-content">
    			<div class="modal-header">
    				<h5 class="modal-title" id="ModalXoaLabel">Thông báo</h5>
    				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
    					<span aria-hidden="true">&times;</span>
    				</button>
    			</div>
    			<div class="modal-body">
    				<p>Bạn có chắc chắn muốn xóa bài đăng này không?</p>
    			</div>
    			<div class="modal-footer">
    				<button type="button" class="btn btn-secondary" data-dismiss="modal">Có</button>
    				<button type="button" class="btn btn-primary" data-dismiss="modal">Không</button>
    			</div>
    		</div>
    	</div>
    </div>
</body>
</html>