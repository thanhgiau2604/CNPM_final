package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ThongBaodao;
import model.ThongBao;

@WebServlet("/ServletGV_ThongBao")
public class ServletGV_ThongBao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletGV_ThongBao() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html;charset=UTF-8");
			String chucNang = (String)getServletContext().getAttribute("chucNang");
			System.out.println("chucNang="+chucNang);
			if (chucNang==null||chucNang.equals(""))
			{
				String maTB = request.getParameter("id");
				System.out.println("id="+maTB);
				new ThongBaodao().delete(maTB);
				response.sendRedirect("GV_QLTB.jsp"); 
			}	
			else
				if (chucNang.equals("Them"))
				{
					String maTB = request.getParameter("maTB"); 
					String noidungTB = request.getParameter("noidungTB");
					String la = request.getParameter("optradio");
					
					int gTS=0,gGV=0;
					if (la.equals("1"))
						gTS=1;
					String tenDN_gui = request.getParameter("tenDN_gui");
					//System.out.println(maTB+"|"+noidungTB+"|"+laAdmin+"|"+guiGV+"|"+guiTS+"|"+tenDN_gui);
					String ngaygui = request.getParameter("ngaygui");
					String nguoitao = request.getParameter("nguoitao");
					ThongBao tb = new ThongBao(maTB,noidungTB,0,gGV,gTS,ngaygui,"0",nguoitao);
					new ThongBaodao().add(tb);
					getServletContext().removeAttribute("Them");
					response.sendRedirect("GV_QLTB.jsp"); 
				}
				else

					if (chucNang.equals("Xem"))
					{
						response.sendRedirect("GV_QLTB.jsp"); 
					}   
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
