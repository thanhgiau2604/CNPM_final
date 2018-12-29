package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NDdao;
import java.sql.ResultSet;
import java.util.concurrent.ThreadLocalRandom;

import dao.SendMail; 
@WebServlet("/ServletQuenMatKhau")
public class ServletQuenMatKhau extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletQuenMatKhau() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {request.setCharacterEncoding("UTF-8");
	request.setCharacterEncoding("UTF-8");
	response.setCharacterEncoding("UTF-8");
	response.setContentType("text/html;charset=UTF-8");
	PrintWriter out = response.getWriter();
	HttpSession session = request.getSession();
	int Ktra=0;
	
	String email = request.getParameter("mail");
	int code = ThreadLocalRandom.current().nextInt(117215,994762);
	SendMail sm = new SendMail();
	sm.sendMail(email,"Code xac nhan tai khoan Website Trac Nghiem Truc Tuyen","Code: "+code);
	session.setAttribute("code",code);
	session.setAttribute("mail",email);
	response.sendRedirect("Guest_MaCode.jsp");
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doGet(request, response);
}

}
