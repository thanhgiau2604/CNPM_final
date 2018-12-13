<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dblayer.DBConnect"%>
<%@page import="dao.CauHoidao"%>
<%@ page import="java.sql.ResultSet" %>
<%@page import="javax.servlet.*" %>
<%if (session.getAttribute("tenDN")==null)
	response.sendRedirect("Guest_DangNhap.jsp"); %>
<%
	getServletContext().setAttribute("id",request.getParameter("id"));
	getServletContext().setAttribute("chucNang", "Xem");
%>
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
	<!-- jquery -->
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<script type="text/javascript" src="file/js/jqTLPH.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="file/css/GV_TLPH.css">
</head>
<body>
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container dt" id="idtrangchu">
				<!-- start khung -->
				<div class="khung">
					<button class="nuttt">
						<img src="file/Images/Teacher.png" alt="avatar" class="ava">
						${sessionScope.tenDN}
					</button>	
					<div class="danhmuctt">
						<a href="GV_ThayDoiTT.jsp">Thay Đổi Thông Tin</a>
						<a href="GV_DoiMatKhau.jsp">Đổi Mật Khẩu</a>
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
						<li ><a class="btnTC" href="TrangChuGV.jsp">TRANG CHỦ</a></li>
						<li ><a class="btnTC" href="GV_QLCauHoi.jsp">QL CÂU HỎI</a></li>
						<li ><a class="btnTC" href="GV_QLDeThi.jsp">QL ĐỀ THI</a></li>
						<li ><a class="btnTC" href="GV_QLDiemTS.jsp">QL ĐIỂM</a></li>
						<li ><a class="btnTC" href="GV_QLTB.jsp">QL THÔNG BÁO</a></li>
						<li ><a class="btnTC" href="GV_NhanPhanHoi.jsp">PHẢN HỒI</a></li>
						<li ><a class="btnGT" href="TrangChuGV.jsp#gioithieu">GIỚI THIỆU</a></li>					
					</ul>
				</div><!-- /.navbar-collapse -->
				<!-- duong ke -->
				<div class="duongke"></div>
			</div> 
		</nav>

			<div class="container-fluid">
			<div class="row formphanhoi">
				<div class="text-center mucluachon">
					<h2>QUẢN LÝ CÂU HỎI</h2>
					<h3>XEM CÂU HỎI</h3>
				</div>
				<%
					String id = request.getParameter("id");
					CauHoidao chdao = new CauHoidao();
					ResultSet rs = chdao.LayCauHoiTheoMaCH(id);
					while (rs.next()){
				%>
				<div class="col-md-1 col-sm-0 col-xs-0"></div>
				<div class="col-md-10 col-sm-12 col-xs-12">
					<form method="post" id="formtlph" action="ThemSuaXoa">
						<div class="form-group ">
							<label class="control-label " for="text">
								Mã câu hỏi
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text" name="maCH" type="text" readonly="true" 
							value="<%out.print(rs.getString(1));%>" 
							/>
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="textarea">
								Nội dung câu hỏi
								<span class="asteriskField">
									*
								</span>
							</label>
							<textarea class="form-control" cols="40" id="textarea" name="noiDung" placeholder="Nội dung" rows="10"
							readonly="true"><%out.print(rs.getString(2));%></textarea>
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Nội dung đáp án A
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="luaChonA" placeholder="" type="text" readonly="true" 
							value="<%out.print(rs.getString(3));%>" />
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Nội dung đáp án B
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="luaChonB" placeholder="" type="text" readonly="true" 
							value="<%out.print(rs.getString(4));%>"/>
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Nội dung đáp án C
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="luaChonC" placeholder="" type="text" 
							value="<%out.print(rs.getString(5));%>" 
							readonly="true" 
							/>
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Nội dung đáp án D
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="luaChonD" placeholder="" type="text" readonly="true" 
							value="<%out.print(rs.getString(6));%>" />
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Đáp án
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="dapAn" placeholder="" type="text" readonly="true" 
							value="<%out.print(rs.getString(7));%>" />
						</div>
						<div class="form-group ">
							<label class="control-label requiredField" for="text1">
								Người tạo
								<span class="asteriskField">
									*
								</span>
							</label>
							<input class="form-control" id="text1" name="nguoiTao" placeholder="" type="text" readonly="true" 
							value="<%out.print(rs.getString(8));%>" />
						</div>
						<%
							}
						%>
						<div class="form-group nutsubmit">
							<div>
								<button class="btn btn-primary btnsubmit" name="submit" type="submit">
									Quay lại danh sách câu hỏi
								</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div> 
		<!-- end -->

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
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        	<ul class="shortlink">
                        		<li><a href="TrangChuGV.jsp">Trang chủ</a></li>
                        		<li><a href="TrangChuGV.jsp#baidang">Bài đăng</a></li>
                        		<li><a href="TrangChuGV.jsp#gioithieu">Giới thiệu</a></li>
                        		<li><a href="TrangChuGV.jsp#chucnang">Chức năng</a></li>
                        	</ul>
                        </div>
                         <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                         	<ul class="shortlink">
                         		<li><a href="GV_QLCauHoi.jsp">Câu hỏi</a></li>
                         		<li><a href="GV_QLDeThi.jsp">Đề thi</a></li>
                         		<li><a href="GV_QLDiemTS.jsp">Điểm</a></li>
                         		<li><a href="GV_QLTB.jsp">Thông báo</a></li>
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