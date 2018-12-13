package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ThongBaodao;
import model.ThongBao;


@WebServlet("/ServletThBao")
public class ServletThBao extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletThBao() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		//response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String chucNang = (String)getServletContext().getAttribute("chucNang");
		System.out.println("chucNang="+chucNang);
		if (chucNang==null||chucNang.equals(""))
		{
			String maTB = request.getParameter("id");
			System.out.println("id="+maTB);
			new ThongBaodao().delete(maTB);
			response.sendRedirect("Ad_QLTB.jsp"); 
		}	
		else
			if (chucNang.equals("Them"))
			{
				String maTB = request.getParameter("maTB"); 
				String noidungTB = request.getParameter("noidungTB");
				String la = request.getParameter("optradio");
				
				int gTS=0,gGV=0;
				if (la.equals("1"))
					gGV=1;
				if (la.equals("2"))
					gTS=1;
				if (la.equals("3"))
				{
					gGV=1;
					gTS=1;
				}
				String ngaygui = request.getParameter("ngaygui");
				String nguoitao = request.getParameter("nguoitao");
				//System.out.println(maTB+"|"+noidungTB+"|"+laAdmin+"|"+guiGV+"|"+guiTS+"|"+tenDN_gui);
				ThongBao tb = new ThongBao(maTB,noidungTB,1,gGV,gTS,ngaygui,"0",nguoitao);
				new ThongBaodao().add(tb);
				getServletContext().removeAttribute("Them");
				response.sendRedirect("Ad_QLTB.jsp"); 
			}
			else

				if (chucNang.equals("Xem"))
				{
					response.sendRedirect("Ad_QLTB.jsp"); 
				}   	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
