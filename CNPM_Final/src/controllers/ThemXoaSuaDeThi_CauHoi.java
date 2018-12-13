package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DeThiCauHoiDAO;
import model.DeThiCauHoi;

@WebServlet("/ThemXoaSuaDeThi_CauHoi")
public class ThemXoaSuaDeThi_CauHoi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ThemXoaSuaDeThi_CauHoi() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String chucNang = request.getParameter("chucNang");
		System.out.println("chucNangQLDTCH="+chucNang);
		if (chucNang==null||chucNang.equals("Xoa")||chucNang.equals("")||chucNang.equals("XoachdtAdmin"))
		{
			String MaCH = request.getParameter("mach");	
			String MaDT = request.getParameter("madt");
			new DeThiCauHoiDAO().XoaCauHoiDeThi(MaCH, MaDT);
			if (chucNang.equals("Xoa"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("GV_ThemDeThi_CH.jsp");
				rd.forward(request , response); 
				}
			if (chucNang.equals("XoachdtAdmin"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("Ad_ThemDeThi_CH.jsp");
				rd.forward(request , response); 
				}
		}	
		else
			if (chucNang.equals("Sua")||chucNang.equals("SuachdtAdmin"))
		{
			String MaCH = request.getParameter("mach");	
			String MaDT = request.getParameter("madt");
			System.out.println("vo roi id="+MaDT);	
			int STT = 0;
			boolean DaTraLoi=false;
			DeThiCauHoi dt = new DeThiCauHoi(MaCH,MaDT,STT,DaTraLoi);
			new DeThiCauHoiDAO().edit(dt, MaDT);  
			if (chucNang.equals("Sua"))
			{
			RequestDispatcher rd = request.getRequestDispatcher("GV_QLDeThi_CH.jsp");
			rd.forward(request , response);
			}
		if (chucNang.equals("SuachdtAdmin"))
			{
			RequestDispatcher rd = request.getRequestDispatcher("Ad_QLDeThi_CH.jsp");
			rd.forward(request , response);
			}
		}
		else
			if (chucNang.equals("Them")||chucNang.equals("ThemchdtAdmin"))
			{
				String MaCH = request.getParameter("mach");	
				String MaDT = request.getParameter("madt");
				int STT = 0;
				boolean DaLay=false;
				DeThiCauHoi dt = new DeThiCauHoi(MaCH,MaDT,STT,DaLay);
				new DeThiCauHoiDAO().add(dt);
				if (chucNang.equals("Them"))
				{
				RequestDispatcher rd = request.getRequestDispatcher("GV_ThemDeThi_CH.jsp");
				rd.forward(request , response);
				}
			    if (chucNang.equals("ThemchdtAdmin"))
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
