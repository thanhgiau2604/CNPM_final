package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PhanHoiDAO;

/**
 * Servlet implementation class TraLoiPhanHoi
 */
@WebServlet("/TraLoiPhanHoi")
public class TraLoiPhanHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraLoiPhanHoi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String thaotac=(String)request.getParameter("gui");
		System.out.println(thaotac);
		if (thaotac.equals("Gửi"))
		{
			HttpSession session=request.getSession();
			String mats=request.getParameter("mathisinh");
			String tendn=(String)session.getAttribute("tenDN");
			String madt=request.getParameter("madethi");
			String noidung=request.getParameter("noidungtl");
			try {
				new PhanHoiDAO().LuuPhanHoi(mats,tendn, madt, noidung);
			} catch (Exception e) {
				e.printStackTrace();
			}	
			RequestDispatcher rd = request.getRequestDispatcher("GV_NhanPhanHoi.jsp");
			rd.forward(request , response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
