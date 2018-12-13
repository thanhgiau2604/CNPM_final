package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.NguoiDung;
import dao.NDdao;

@WebServlet("/ServletDangKyTaiKhoan")
public class ServletDangKyTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDangKyTaiKhoan() {
        super();

    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String tenDN = request.getParameter("username");
		String matKhau = request.getParameter("password");
		String matKhauC2 = request.getParameter("passwordc2");
		String hoTen = request.getParameter("fullname");
		String email = request.getParameter("email");
		String sDT = request.getParameter("telenum");
		String diaChi = request.getParameter("address");
		String laAi = request.getParameter("role");
		System.out.println(tenDN+"|"+matKhau+"|"+matKhauC2+"|"+hoTen+"|"+email+"|"+sDT+"|"+diaChi+"|"+laAi); 
		int isGV = 0,isAd=0;
		if (laAi.equals("gv"))
			isGV=1; else isAd=1;
		NguoiDung nd = new NguoiDung(tenDN,matKhau,matKhauC2,hoTen,email,sDT,diaChi,isGV,isAd);
		boolean sucess= new NDdao().add(nd);
		if (sucess==false)
		{
			out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal(\"Thông báo\",\"Đăng ký không thành công!!\",\"error\")");
			out.println("});");
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("Guest_DangKy.jsp");
			rd.include(request, response);
		}
		else
		{
			out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal(\"Thông báo\",\"Đăng ký tài khoản thành công!!\",\"success\")");
			out.println("});");
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("Guest_DangNhap.jsp");
			rd.include(request, response);
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
