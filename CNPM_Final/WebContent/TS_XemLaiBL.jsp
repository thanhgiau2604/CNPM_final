<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="dblayer.DBConnect"%>
<%@page import="dao.VaoThidao"%>
<%@ page import="java.sql.ResultSet" %>
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
	<script type="text/javascript" src="file/js/jqTC.js"></script>
	<!-- Custom Fonts -->
	<link href="file/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700" rel="stylesheet" type="text/css">
	<link href="https://fonts.googleapis.com/css?family=Poppins:300,300i,400,400i,500,500i,600,600i,700,700i,800,800i" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="file/css/TS_VaoThi.css">
</head>
<body data-spy="scroll" data-target=".navbar-fixed-top" data-offset="90">
		<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
			<div class="container dt" id="idtrangchu">
				<!-- start khung -->
				<div class="khung">
					<button class="nuttt">
						<img src="file/Images/Student.png" alt="avatar" class="ava">
						${sessionScope.tenDN}
					</button>	
					<div class="danhmuctt">
						<a href="TS_ChonDeThi.jsp">Vào Thi</a>
						<a href="TS_TDTT.jsp">Thay Đổi Thông Tin</a>
						<a href="TS_DoiMatKhau.jsp">Đổi Mật Khẩu</a>
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
						<li ><a class="btnTC" href="TrangChuTS.jsp">TRANG CHỦ</a></li>
						<li ><a class="btnTC" href="TS_ChonDeThi.jsp">VÀO THI</a></li>
						<li ><a class="btnTC" href="TS_LichSuThi.jsp">LỊCH SỬ</a></li>
						<li ><a class="btnTC" href="TS_ThongBao.jsp">THÔNG BÁO</a></li>
						<li ><a class="btnGT" href="TrangChuTS.jsp#gioithieu">GIỚI THIỆU</a></li>					
					</ul>
				</div><!-- /.navbar-collapse -->
				<!-- duong ke -->
				<div class="duongke"></div>
			</div> 
		</nav>
		</nav>
		
		<%
				VaoThidao vt = new VaoThidao();
				String TenDN = (String)session.getAttribute("tenDN");
				String MaDT = (String)session.getAttribute("MaDT");
				int LuotThi = (Integer)session.getAttribute("LuotThi");
				ResultSet rs = vt.LayThongTinBaiLam(TenDN, MaDT, LuotThi);
		%>
		
		<!-- content -->
		<div class="container">
			<div class="row vaothi">
				<h3 class="text-center" style="color: red; padding-bottom: 15px; margin-top: 0px">
					<b>XEM LẠI BÀI THI ĐÃ LÀM</b></h3>
				<div class="col-xs-1 col-sm-1 col-md-1 col-lg-1"></div>
				<div class="col-xs-10 col-sm-10 col-md-4 col-lg-4">
					<div class="boxtt">
						<div class="boxlist">
							<p class="td text-center">THÔNG TIN BÀI THI</p>
						</div>
					<%
					while (rs.next())
					{
						session.setAttribute("SoCauHoi",rs.getInt(4));
					%>
					<ul class="thongtin">
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
							<li class="dm">
								<img src="file/Images/score.svg" alt="" height="30" class="anhicon">
								Điểm đạt được:
								<b><%=rs.getString(6)%></b>
							</li>
						</ul>
						<%} %>
						<div class="btn btn-warning nutnop"><a href="TS_GuiPhanHoi.jsp">Gửi phản hồi</a></div> 
						<div class="btn btn-warning nutnop"><a href="TrangChuTS.jsp">Về Trang chủ</a></div> 
					</div>
				</div>
				
				<div class="col-xs-11 col-sm-11 col-md-6 col-lg-6 col-xs-push-1 col-sm-push-1">
					<div class="khungbl">
						<div class="boxtenbl">
							<h3 class="tenbl">
								<img src="file/Images/exam.svg" alt="" height="30" class="anhicon">
								THỜI GIAN HOÀN THÀNH:
								<b>12:35</b>
							</h3>
							<%
							    int stt = (Integer)session.getAttribute("stt"); 
								//System.out.println("STT="+stt);
								ResultSet rsLayCH = new VaoThidao().LayCauHoiTheoSTT(MaDT, stt);
								String TraLoi="";
									VaoThidao vthi = new VaoThidao();
									ResultSet rsCTL = vthi.LayCauTraLoi(TenDN, MaDT,stt, LuotThi);
									while (rsCTL.next())
									{
										TraLoi= rsCTL.getString(1);
									}
								System.out.println("TraLoi===="+TraLoi);
							%>
							<h3>
								Câu số:<%=stt%>
							</h3>
						</div>
					<%
							while (rsLayCH.next())
							{ 
								getServletContext().setAttribute("dapan", rsLayCH.getString(7));
								getServletContext().setAttribute("MaCH", rsLayCH.getString(1));
								String DapAn = rsLayCH.getString(7);
								//System.out.println(rsLayCH.getString(7));
						%>
						<form action="ServletXemLaiBaiLam" method="post">
						<div class="noidungch">
							<p class="cauhoi"><%=rsLayCH.getString(2)%></p>
							<div class="radio">
							  <% if (TraLoi.equals("A")) {%>
								<label>
									<input type="radio" name="luachon" value="A" checked>
									<%if (DapAn.equals("A")) 
									  {%>
										<b><%=rsLayCH.getString(3)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(3)%>
									  <%}%>
								</label>
							  <% } else {%>
							  	<label><input type="radio" name="luachon" value="A">
							  	<%if (DapAn.equals("A")) 
									  {%>
										<b><%=rsLayCH.getString(3)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(3)%>
									  <%}%>
							  	</label>			  	
							  <% } %>
							</div>
							<div class="radio">
							  <% if (TraLoi.equals("B")) {%>
								<label><input type="radio" name="luachon" value="B" checked>
								<%if (DapAn.equals("B")) 
									  {%>
										<b><%=rsLayCH.getString(4)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(4)%>
									  <%}%>
								</label>
							  <% } else {%>
							  	<label><input type="radio" name="luachon" value="B">
							  	<%if (DapAn.equals("B")) 
									  {%>
										<b><%=rsLayCH.getString(4)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(4)%>
									  <%}%>
							  	</label>
							  <% } %>
							</div>
							<div class="radio">
							  <% if (TraLoi.equals("C")) {%>
								<label><input type="radio" name="luachon" value="C" checked>
								<%if (DapAn.equals("C")) 
									  {%>
										<b><%=rsLayCH.getString(5)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(5)%>
									  <%}%>
								</label>
							  <% } else {%>
							  	<label><input type="radio" name="luachon" value="C">
							  	<%if (DapAn.equals("C")) 
									  {%>
										<b><%=rsLayCH.getString(5)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(5)%>
									  <%}%>
							  	</label>
							  <% } %>
							</div>
							<div class="radio">
							  <% if (TraLoi.equals("D")) {%>
								<label><input type="radio" name="luachon" value="D" checked>
								<%if (DapAn.equals("D")) 
									  {%>
										<b><%=rsLayCH.getString(6)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(6)%>
									  <%}%>
								</label>
							  <% } else {%>
							  	<label><input type="radio" name="luachon" value="D">
							  	<%if (DapAn.equals("D")) 
									  {%>
										<b><%=rsLayCH.getString(6)%></b>
									  <%} else 
									  {%>
										<%=rsLayCH.getString(6)%>
									  <%}%>
							  	</label>
							  <% } %>
							</div>
						</div>
						<div> 
						  <% 
							int SoCH = (Integer)(session).getAttribute("SoCauHoi");
						    if (stt<SoCH) {
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
								System.out.println("Zo dis");
						   %>
						<input type="submit" value="Trước đó" name="nuttruoc" class="btn btn-danger btnthaotac btntruoc" disabled>
						   <%  } %>
						</div>
						   <%
							 } 
						   %>
					</form> 
					
				</div>
			</div>
		</div>
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
                        		<li><a href="TrangChuTS.jsp">Trang chủ</a></li>
                        		<li><a href="TrangChuTS.jsp#baidang">Bài đăng</a></li>
                        		<li><a href="TrangChuTS.jsp#gioithieu">Giới thiệu</a></li>
                        		<li><a href="TrangChuTS.jsp#chucnang">Chức năng</a></li>
                        	</ul>
                        </div>
                         <div class="col-xs-4 col-sm-4 col-md-5 col-lg-5">
                         	<ul class="shortlink">
                         		<li><a href="">Câu hỏi</a></li>
                         		<li><a href="">Đề thi</a></li>
                         		<li><a href="">Điểm</a></li>
                         		<li><a href="TS_ThongBao.jsp">Thông báo</a></li>
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