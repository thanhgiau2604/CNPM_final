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

@WebServlet("/ServletXacNhanCode")
public class ServletXacNhanCode extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public ServletXacNhanCode() {
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		int count = (Integer)session.getAttribute("count");
		if (count<3)
		{
			count++;
			session.setAttribute("count", count);
			String code = request.getParameter("code");
			String MaCode=(String.valueOf(session.getAttribute("code")));
			if (MaCode.equals(code))
			{
				response.sendRedirect("Guest_DoiMatKhauMoi.jsp");
			}
			else
			{
				out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
				out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
				out.println("<script>");
				out.println("$(document).ready(function(){");
				out.println("swal(\"Thông báo\",\"Mã code không đúng!\",\"error\")");
				out.println("});");
				out.println("</script>");
				RequestDispatcher rd = request.getRequestDispatcher("Guest_MaCode.jsp");
				rd.include(request, response);
			}
		}
		else
		{
			out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal(\"Thông báo\",\"Bạn đã thực hiện quá 3 lần!\",\"error\")");
			out.println("});");
			out.println("</script>");
			RequestDispatcher rd = request.getRequestDispatcher("Guest_DangNhap.jsp");
			rd.include(request, response);
		}
	}
}
