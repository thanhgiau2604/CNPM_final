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

@WebServlet("/ServletXemDeThi")
public class ServletXemDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletXemDeThi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String thaotac=(String)request.getParameter("nuttruoc");
		if (thaotac==null)
			thaotac=(String)request.getParameter("nutsau");
		
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();	

		int stt =  (Integer)(session.getAttribute("stt"));
		if (thaotac.equals("Tiếp theo"))
		{
			session.setAttribute("stt", stt+1);
			RequestDispatcher rd = request.getRequestDispatcher("GV_XemDeThi.jsp");
			rd.forward(request, response);
		}
		else
			if (thaotac.equals("Trước đó"))
			{
				session.setAttribute("stt", stt-1);
				RequestDispatcher rd = request.getRequestDispatcher("GV_XemDeThi.jsp");
				rd.forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
