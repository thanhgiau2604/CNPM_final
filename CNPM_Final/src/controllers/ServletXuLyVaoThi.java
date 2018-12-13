package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import dao.VaoThidao;
@WebServlet("/ServletXuLyVaoThi")
public class ServletXuLyVaoThi extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletXuLyVaoThi() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String LuaChon = request.getParameter("luachon");
		String thaotac=(String)request.getParameter("nuttruoc");
		if (thaotac==null)
			thaotac=(String)request.getParameter("nutsau");
		if (thaotac==null)
			thaotac=(String)request.getParameter("nutnop");	
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();	

		int stt =  (Integer)(session.getAttribute("stt"));
		
		//Kiểm tra
		int LuotThi = (Integer)session.getAttribute("LuotThi");	
		String TenDN = (String)session.getAttribute("tenDN");
		String MaDT = (String)session.getAttribute("MaDT");
		String MaCH = (String)getServletContext().getAttribute("MaCH");
		System.out.println("TenDN="+TenDN+"|MaCH="+MaCH+"|MaDT="+MaDT+"|LuotThi="+LuotThi+"|TraLoi="+LuaChon);
		boolean tontai=false;
		try {
			ResultSet rset = new VaoThidao().KiemTraTonTaiTraLoi(TenDN, MaCH, MaDT, LuotThi);
			while (rset.next())
			{
				if (rset.getInt(1)!=0)
					tontai=true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("tontai=="+tontai);
		if (tontai==false)
		{
			new VaoThidao().ThemVaoCauTraLoi(TenDN, MaCH, MaDT, LuotThi, LuaChon);
		}
		else
			
		{
			new VaoThidao().CapNhatCauTraLoi(TenDN, MaCH, MaDT, LuotThi, LuaChon);
		}

		if (thaotac.equals("Tiếp theo"))
		{
			session.setAttribute("stt", stt+1);
			RequestDispatcher rd = request.getRequestDispatcher("TS_VaoThi.jsp");
			rd.forward(request, response);
		}
		else
			if (thaotac.equals("Trước đó"))
			{
				session.setAttribute("stt", stt-1);
				RequestDispatcher rd = request.getRequestDispatcher("TS_VaoThi.jsp");
				rd.forward(request, response);
			}
			else
			{

				RequestDispatcher rd = request.getRequestDispatcher("ServletChamDiemBaiThi");
				rd.forward(request, response);
			}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
