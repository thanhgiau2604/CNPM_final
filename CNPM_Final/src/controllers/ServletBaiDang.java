package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BaiDangdao;
import model.BaiDang;

@WebServlet("/ServletBaiDang")
public class ServletBaiDang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletBaiDang() {
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
			String maBD = request.getParameter("id");
			System.out.println("id="+maBD);
			new BaiDangdao().delete(maBD);
			response.sendRedirect("Ad_QLBaiDang.jsp"); 
		}	
		else
		if (chucNang.equals("Sua"))
		{
			String maBD = request.getParameter("maBD");
			System.out.println("vo roi id="+maBD);
			String tieudeBD = request.getParameter("tieudeBD");
			String noidungBD = request.getParameter("noidungBD");
			String tacgia = request.getParameter("tacgia");
			BaiDang bd = new BaiDang(maBD,tieudeBD,noidungBD,tacgia);
			new BaiDangdao().edit(bd, maBD);
			response.sendRedirect("Ad_QLBaiDang.jsp");  
		}
		else
			if (chucNang.equals("Them"))
			{
				String maBD = request.getParameter("maBD");
				String tieudeBD = request.getParameter("tieudeBD");
				String noidungBD = request.getParameter("noidungBD");
				String tacgia = request.getParameter("tacgia");
				System.out.println(maBD+"|"+tieudeBD+"|"+noidungBD+"|"+tacgia);
				BaiDang bd = new BaiDang(maBD,tieudeBD,noidungBD,tacgia);
				new BaiDangdao().add(bd);
				getServletContext().removeAttribute("Them");
				response.sendRedirect("Ad_QLBaiDang.jsp"); 
			}
			else

				if (chucNang.equals("Xem"))
				{
					response.sendRedirect("Ad_QLBaiDang.jsp"); 
				}   	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
