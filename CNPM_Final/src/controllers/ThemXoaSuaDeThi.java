package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DeThiDAO;
import model.DeThi; 

@WebServlet("/ThemXoaSuaDeThi")
public class ThemXoaSuaDeThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThemXoaSuaDeThi() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String chucNang = request.getParameter("chucNang");
		System.out.println("chucNangQLDT="+chucNang);
		
		if (chucNang==null||chucNang.equals("")||chucNang.equals("Xoa")||chucNang.equals("XoadtAdmin"))
		{
			String madt = request.getParameter("madethi");
			System.out.println("madethi"+madt);
			new DeThiDAO().delete(madt); 
			if (chucNang.equals("Xoa"))
				response.sendRedirect("GV_QLDeThi.jsp"); 
			if (chucNang.equals("XoadtAdmin"))
				response.sendRedirect("Ad_QLDeThi.jsp");
		}	
		else
		if (chucNang.equals("Sua")||chucNang.equals("SuadtAdmin"))
		{
			String MaDT = request.getParameter("madethi");
			String KyThi = request.getParameter("kithi");
			String MonThi = request.getParameter("monthi");				
			HttpSession session=request.getSession();
			session.setAttribute("MonThi", MonThi);
			session.setAttribute("MaDT", MaDT);		
			int SoCauHoi = Integer.parseInt(request.getParameter("socauhoi"));
			int SoDiem = Integer.parseInt(request.getParameter("diem"));
			int ThoiGianThi = Integer.parseInt(request.getParameter("thoigian"));
			String NguoiTao=request.getParameter("nguoitao");
			DeThi dt = new DeThi(MaDT,KyThi,MonThi,SoCauHoi,ThoiGianThi,SoDiem,NguoiTao);
			new DeThiDAO().edit(dt, MaDT);
			if (chucNang.equals("Sua"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("GV_SuaDeThi_CH.jsp");
				rd.forward(request , response);
				}
			if (chucNang.equals("SuadtAdmin"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("Ad_SuaDeThi_CH.jsp");
				rd.forward(request , response);
				}
		}
		else
			if (chucNang.equals("Them")||chucNang.equals("ThemdtAdmin"))
			{
				String MaDT = request.getParameter("madethi");
				String KyThi = request.getParameter("kithi");
				String MonThi = request.getParameter("monthi");				
				HttpSession session=request.getSession();
				session.setAttribute("MonThi", MonThi);
				session.setAttribute("MaDT", MaDT);		
				int SoCauHoi = Integer.parseInt(request.getParameter("socauhoi"));
				int SoDiem = Integer.parseInt(request.getParameter("diem"));
				int ThoiGianThi = Integer.parseInt(request.getParameter("thoigian"));
				String NguoiTao=request.getParameter("nguoitao");
				System.out.println(NguoiTao);
				DeThi dt = new DeThi(MaDT,KyThi,MonThi,SoCauHoi,ThoiGianThi,SoDiem,NguoiTao);
				new DeThiDAO().add(dt);
				if (chucNang.equals("Them"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("GV_ThemDeThi_CH.jsp");
				rd.forward(request , response);
				}
			    if (chucNang.equals("ThemdtAdmin"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("Ad_ThemDeThi_CH.jsp");
				rd.forward(request , response);
				}
			}	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}

