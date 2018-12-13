package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NDdao;

@WebServlet("/ServletQLUser")
public class ServletQLUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletQLUser() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ChucNang= request.getParameter("chucNang");
		if (ChucNang==null)
		{
			String content = request.getParameter("search");
			HttpSession session = request.getSession();
			session.setAttribute("conSearch", content);
			response.sendRedirect("AD_QLND_DS.jsp");
		}
		else
		if (ChucNang.equals("Del"))
		{
			String TenDN=request.getParameter("id");
			NDdao nd = new NDdao();
			nd.delete(TenDN);
			response.sendRedirect("AD_QLND_DS.jsp");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
