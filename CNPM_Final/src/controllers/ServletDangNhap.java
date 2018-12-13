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

@WebServlet("/ServletDangNhap")
public class ServletDangNhap extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletDangNhap() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		NDdao ndao = new NDdao();
		HttpSession session = request.getSession();
		session.setAttribute("tenDN", request.getParameter("username"));
		boolean kiemtra  = ndao.checkLogin(request.getParameter("username"), request.getParameter("password"));
		if (kiemtra==false)
		{
			RequestDispatcher rd = request.getRequestDispatcher("Guest_DangNhap.jsp");
			rd.include(request, response);
			out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal(\"Thông báo\",\"Bạn nhập sai tên đăng nhập hoặc mật khẩu!!\",\"error\")");
			out.println("});");
			out.println("</script>");
		}
		else
		{ 
			int role = ndao.RoleNguoiDung(request.getParameter("username"));
			if (role==1)
			{
				RequestDispatcher rd = request.getRequestDispatcher("TrangChuTS.jsp");
				rd.include(request, response);
			}
			else
				if (role==2)
				{
					RequestDispatcher rd = request.getRequestDispatcher("TrangChuGV.jsp");
					rd.forward(request, response);
				}
				else
					if (role==3)
					{
						RequestDispatcher rd = request.getRequestDispatcher("TrangChuAdmin.jsp");
						rd.forward(request, response);
					}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
