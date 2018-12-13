package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.NDdao;

@WebServlet("/ServletDoiMatKhauMoi")
public class ServletDoiMatKhauMoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDoiMatKhauMoi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String MatKhau = request.getParameter("password");
		String TenDN = (String)getServletContext().getAttribute("tenDN");
		new NDdao().CapNhatMatKhau(MatKhau, TenDN);
		out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
		out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
		out.println("<script>");
		out.println("$(document).ready(function(){");
		out.println("swal(\"Thông báo\",\"Đổi mật khẩu thành công\",\"success\")");
		out.println("});");
		out.println("</script>");
		RequestDispatcher rd = request.getRequestDispatcher("Guest_DangNhap.jsp");
		rd.include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
