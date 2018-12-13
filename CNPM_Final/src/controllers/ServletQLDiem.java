package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ServletQLDiem")
public class ServletQLDiem extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletQLDiem() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
	       HttpSession session = request.getSession(); 
		String tc = request.getParameter("searchbox");		
		if (tc==null|| tc.equals(""))
			tc = request.getParameter("danhmuc");
		System.out.println("tieuchi==="+tc);
	    String MaDT = request.getParameter("id"); 
       session.setAttribute("tieuchi", tc);
       response.sendRedirect("GV_DSDiemTS.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
