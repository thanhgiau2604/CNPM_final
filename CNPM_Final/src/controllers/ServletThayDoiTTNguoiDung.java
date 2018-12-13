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
import model.NguoiDung;

@WebServlet("/ServletThayDoiTTNguoiDung")
public class ServletThayDoiTTNguoiDung extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletThayDoiTTNguoiDung() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		String tenDN = request.getParameter("username");
		String matKhauC2 = request.getParameter("mkc2");
		String hoTen = request.getParameter("fullname");
		String email = request.getParameter("email");
		String sDT = request.getParameter("telenum");
		String diaChi = request.getParameter("address");
		//System.out.println(tenDN+"|"+matKhauC2+"|"+hoTen+"|"+email+"|"+sDT+"|"+diaChi);
		NguoiDung nd = new NguoiDung(tenDN,"",matKhauC2,hoTen,email,sDT,diaChi,0,0);
		new NDdao().edit(nd, tenDN);
		RequestDispatcher rd = request.getRequestDispatcher("AD_QLND_DS.jsp");
		rd.include(request, response);
		out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
		out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
		out.println("<script>");
		out.println("$(document).ready(function(){");
		out.println("swal(\"Thông báo\",\"Cập nhật thông tin thành công!\",\"success\")");
		out.println("});");
		out.println("</script>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
