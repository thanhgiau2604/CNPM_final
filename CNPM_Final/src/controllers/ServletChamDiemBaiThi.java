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

@WebServlet("/ServletChamDiemBaiThi")
public class ServletChamDiemBaiThi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletChamDiemBaiThi() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		int LuotThi = (Integer)session.getAttribute("LuotThi");	
		String TenDN = (String)session.getAttribute("tenDN");
		String MaDT = (String)session.getAttribute("MaDT");
		System.out.println("TenDN="+TenDN+" MaDT="+MaDT+" LuotThi="+LuotThi);
		float DiemThi=0;
		try {
			ResultSet rs = new VaoThidao().TinhDiemThi(MaDT, LuotThi);
			while (rs.next())
			{
				System.out.println("Diem="+rs.getFloat(1));
				DiemThi=rs.getFloat(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(DiemThi);
		//Cập nhật bảng điểm
		new VaoThidao().ThemVaoBangDiem(TenDN, MaDT, LuotThi, DiemThi);
		response.sendRedirect("TS_KQThi.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
