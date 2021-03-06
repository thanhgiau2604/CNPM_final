package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletXemLaiBaiLam")
public class ServletXemLaiBaiLam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletXemLaiBaiLam() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String thaotac=(String)request.getParameter("nuttruoc");
		if (thaotac==null)
			thaotac=(String)request.getParameter("nutsau");
	
		HttpSession session = request.getSession();
		System.out.println(thaotac);  
		int stt =  (Integer)(session.getAttribute("stt"));
		if (thaotac.equals("Tiếp theo"))
		{
			session.setAttribute("stt", stt+1);
			/*RequestDispatcher rd = request.getRequestDispatcher("TS_XemLaiBL.jsp#exam");
			rd.forward(request, response);*/
			response.sendRedirect("TS_XemLaiBL.jsp");
		}
		else
			if (thaotac.equals("Trước đó"))
			{
				session.setAttribute("stt", stt-1);
				/*RequestDispatcher rd = request.getRequestDispatcher("TS_XemLaiBL.jsp#exam");
				rd.forward(request, response);*/
				response.sendRedirect("TS_XemLaiBL.jsp");
			}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
