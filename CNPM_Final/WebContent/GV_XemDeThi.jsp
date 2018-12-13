<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dblayer.DBConnect"%>
<%@page import="dao.VaoThidao"%>
<%@ page import="java.sql.ResultSet" %>
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
	<!-- jquery -->
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<!-- jquery -->
	<script type="text/javascript" src="file/js/jqMenu.js"></script>
	<link rel="stylesheet" type="text/css" href="file/css/GV_XemDT.css">
</head>
<body data-spy="scroll" data-target=".navbar-fixed-top" data-offset="90">
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
		<%
				int SoCauHoi=0;
				VaoThidao vt = new VaoThidao();
				String MaDT=null;
				MaDT = request.getParameter("id"); 
				if (MaDT==null) MaDT = (String)session.getAttribute("MaDT");
				session.setAttribute("MaDT",MaDT); 
				ResultSet rs = vt.LayDeThi(MaDT);
		%>
		<!-- content -->
		<div class="container">
			<div class="row vaothi">
				<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"></div>
				<div class="col-xs-10 col-sm-10 col-md-4 col-lg-4">
					<div class="boxtt">
						<div class="boxlist">
							<p class="td text-center">THÔNG TIN BÀI THI</p>
						</div>
						<ul class="thongtin">
						<%
					while (rs.next())
					{
						SoCauHoi = rs.getInt(4); 
					%>
							<li class="dm">
								<img src="file/Images/id.svg" alt="" height="30" class="anhicon">
								Mã đề thi:
								<b><%=rs.getString(1)%></b>
							</li>
							<li class="dm">
								<img src="file/Images/kythi.svg" alt="" height="30" class="anhicon">
								Kì thi:
								<b><%=rs.getString(2)%></b>
							</li>
							<li class="dm">
								<img src="file/Images/monthi.svg" alt="" height="30" class="anhicon">
								Môn thi:
								<b><%=rs.getString(3)%></b>
							</li>
							<li class="dm">
								<img src="file/Images/soluong.svg" alt="" height="30" class="anhicon">
								Số câu hỏi:
								<b><%=rs.getString(4)%></b>
							</li>
							<li class="dm">
								<img src="file/Images/time.svg" alt="" height="30" class="anhicon">
								Thời gian:
								<b><%=rs.getString(5)%></b>
							</li>
						<%} %>
						</ul>
						<div class="btn btn-warning" style="margin-left:23%; margin-bottom:10px;"><a href="GV_SuaDeThi_TT.jsp?madethi=<%=MaDT%>" style="color:white; text-decoration:none">Sửa</a></div> 
						<div class="btn btn-warning" style="margin-bottom:10px"><a href="GV_QLDeThi.jsp" style="color:white; text-decoration:none">QL đề thi</a></div> 
					</div>
				</div>
				<div class="col-xs-11 col-sm-11 col-md-6 col-lg-6 col-xs-push-1 col-sm-push-1">
					<div class="khungbl">
						<div class="boxtenbl">
							<h2 class="tenbl">
								<img src="file/Images/exam.svg" alt="" height="30" class="anhicon">
								CHI TIẾT CÂU HỎI
							</h2>
							<%
							    int stt = (Integer)session.getAttribute("stt"); 
								//System.out.println("STT="+stt);
								ResultSet rsLayCH = new VaoThidao().LayCauHoiTheoSTT(MaDT, stt);
								String TraLoi="";
							    boolean empty = false;
							    
								if (!rsLayCH.isBeforeFirst())
								{
									empty = true;
								}
								System.out.println("empty="+empty);
								if (empty==true)
								{								
									VaoThidao vthi = new VaoThidao();
									ResultSet rsChon = vthi.ChonCauHoi(MaDT);
									String maCH=null; 
									while (rsChon.next()){
										maCH = rsChon.getString(1);
									}
									rsLayCH = vthi.LayCauHoi(maCH,stt); 								
								}
							%>
							<h3>
								Câu số:<%=stt%>
							</h3>
						</div>
						<%
							while (rsLayCH.next())
							{ 
								String DapAn = rsLayCH.getString(7);
								getServletContext().setAttribute("MaCH", rsLayCH.getString(1));
						%>
						<form action="ServletXemDeThi" method="post">
						<div class="noidungch">
							<p class="cauhoi"><%=rsLayCH.getString(2)%></p>
							<div class="radio">
							<%if (DapAn.equals("A")) {%>
								<b>A: <%=rsLayCH.getString(3)%></b><%} else {%>
								 A: <%=rsLayCH.getString(3)%> <%} %>
							</div>
							<div class="radio">
								<%if (DapAn.equals("B")) {%>
								<b>B: <%=rsLayCH.getString(4)%></b><%} else {%>
								 B: <%=rsLayCH.getString(4)%> <%} %>
							</div>
							<div class="radio">
								<%if (DapAn.equals("C")) {%>
								<b>C: <%=rsLayCH.getString(5)%></b><%} else {%>
								 C: <%=rsLayCH.getString(5)%> <%} %>
							</div>
							<div class="radio">
								<%if (DapAn.equals("D")) {%>
								<b>D: <%=rsLayCH.getString(6)%></b><%} else {%>
								 D: <%=rsLayCH.getString(6)%> <%} %>
							</div>
						</div>
						<div>
						 <% 
						    if (stt<SoCauHoi) {
						  %>
							<input type="submit" value="Tiếp theo" name="nutsau" class="btn btn-danger btnthaotac btntt">
					      <%
					    	} else
					    	{
					       %>
					    	<input type="submit" value="Tiếp theo" name="nutsau" class="btn btn-danger btnthaotac btntt" disabled>
						   <%} %>
						</div>
						<div>
						   <%
							if (stt!=1) {
						   %>
						<input type="submit" value="Trước đó" name="nuttruoc" class="btn btn-danger btnthaotac btntruoc">
						   <%
							} else
							{
						   %>
						<input type="submit" value="Trước đó" name="nuttruoc" class="btn btn-danger btnthaotac btntruoc" disabled>
						   <%  } %>
						<%} %>		
					</div>
					</form>
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