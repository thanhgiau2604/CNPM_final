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

import java.sql.ResultSet;
import dao.NDdao;

@WebServlet("/ServletDoiMatKhau")
public class ServletDoiMatKhau extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletDoiMatKhau() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter
		out = response.getWriter();
		String tenDN = request.getParameter("username");
		String matKhaucu = request.getParameter("passwordold");
		String matKhaumoi = request.getParameter("passwordnew");
		String nlmatkhau = request.getParameter("repassword");
		System.out.println(matKhaumoi+" "+nlmatkhau);
		int laGV = (Integer)getServletContext().getAttribute("laGiaoVien");
		int laAdmin = (Integer)getServletContext().getAttribute("laAdmin");
		ResultSet rs = null;
		int Ktra=0;
		try {
			rs = new NDdao().KiemTraMatKhau(tenDN, matKhaucu);
			while (rs.next())
				Ktra = rs.getInt(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (Ktra==0)
		{
			out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal(\"Thông báo\",\"Mật khẩu cũ không đúng\",\"error\")");
			out.println("});");
			out.println("</script>");
			RequestDispatcher rd;
			if (laGV==0 && laAdmin==0)
			{
				rd = request.getRequestDispatcher("TS_DoiMatKhau.jsp");
				rd.include(request, response);
			}
			else
				if (laGV==1)
				{
					rd = request.getRequestDispatcher("GV_DoiMatKhau.jsp");
					rd.include(request, response);
				}
				else
				{
					rd = request.getRequestDispatcher("Ad_DoiMatKhau.jsp");
					rd.include(request, response);
				}
		}
		else
		{
			if (!matKhaumoi.equals(nlmatkhau))
			{
				out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
				out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
				out.println("<script>");
				out.println("$(document).ready(function(){");
				out.println("swal(\"Thông báo\",\"Mật khẩu không khớp\",\"error\")");
				out.println("});");
				out.println("</script>");
				RequestDispatcher rd;
				if (laGV==0 && laAdmin==0)
				{
					rd = request.getRequestDispatcher("TS_DoiMatKhau.jsp");
					rd.include(request, response);
				}
				else
					if (laGV==1)
					{
						rd = request.getRequestDispatcher("GV_DoiMatKhau.jsp");
						rd.include(request, response);
					}
					else
					{
						rd = request.getRequestDispatcher("Ad_DoiMatKhau.jsp");
						rd.include(request, response);
					}
			}
			else
			{
				new NDdao(). CapNhatMatKhau(matKhaumoi, tenDN);
				System.out.println("Cập nhật thành công");
				out.println("<script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
				out.println("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
				out.println("<script>");
				out.println("$(document).ready(function(){");
				out.println("swal(\"Thông báo\",\"Đổi mật khẩu thành công\",\"success\")");
				out.println("});");
				out.println("</script>");
				RequestDispatcher rd;
				if (laGV==0 && laAdmin==0)
				{
					rd = request.getRequestDispatcher("TS_DoiMatKhau.jsp");
					rd.include(request, response);
				}
				else
					if (laGV==1)
					{
						rd = request.getRequestDispatcher("GV_DoiMatKhau.jsp");
						rd.include(request, response);
					}
					else
					{
						rd = request.getRequestDispatcher("Ad_DoiMatKhau.jsp");
						rd.include(request, response);
					}
			}
		}
	}

}
