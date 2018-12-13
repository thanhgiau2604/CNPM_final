package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.CauHoidao;
import model.CauHoi; 

@WebServlet("/ThemSuaXoa")
public class ThemSuaXoa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThemSuaXoa() {
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
			String id = request.getParameter("id");
			System.out.println("id="+id);
			new CauHoidao().delete(id);
			response.sendRedirect("GV_QLCauHoi.jsp"); 
		}	
		else
		if (chucNang.equals("Sua"))
		{
			String maCH = (String)getServletContext().getAttribute("id");
			System.out.println("vo roi id="+maCH);
			String noiDung = request.getParameter("noiDung");
			String luaChonA = request.getParameter("luaChonA");
			String luaChonB = request.getParameter("luaChonB");
			String luaChonC = request.getParameter("luaChonC");
			String luaChonD = request.getParameter("luaChonD");
			String dapAn = request.getParameter("dapAn");
			String nguoiTao = request.getParameter("nguoiTao");
			CauHoi ch = new CauHoi(maCH,noiDung,luaChonA,luaChonB,luaChonC,luaChonD,dapAn,nguoiTao);
			new CauHoidao().edit(ch, maCH);
			getServletContext().removeAttribute("chucNang");
			response.sendRedirect("GV_QLCauHoi.jsp");  
		}
		else
			if (chucNang.equals("Them"))
			{
				String maCH = request.getParameter("maCH");
				String noiDung = request.getParameter("noiDung");
				String luaChonA = request.getParameter("luaChonA");
				String luaChonB = request.getParameter("luaChonB");
				String luaChonC = request.getParameter("luaChonC");
				String luaChonD = request.getParameter("luaChonD");
				String dapAn = request.getParameter("dapAn");
				String nguoiTao = request.getParameter("nguoiTao");
				CauHoi ch = new CauHoi(maCH,noiDung,luaChonA,luaChonB,luaChonC,luaChonD,dapAn,nguoiTao);
				new CauHoidao().add(ch);
				getServletContext().removeAttribute("chucNang");
				response.sendRedirect("GV_QLCauHoi.jsp"); 
			}
			else

				if (chucNang.equals("Xem"))
				{
					getServletContext().removeAttribute("chucNang");
					response.sendRedirect("GV_QLCauHoi.jsp"); 
				}   	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
