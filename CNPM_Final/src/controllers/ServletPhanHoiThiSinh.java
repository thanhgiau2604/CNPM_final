package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.VaoThidao; 

@WebServlet("/ServletPhanHoiThiSinh")
public class ServletPhanHoiThiSinh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ServletPhanHoiThiSinh() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		HttpSession session = request.getSession();
		String MaDT = (String)session.getAttribute("MaDT");
		String TenDN = (String)session.getAttribute("tenDN");
		String NguoiNhan = request.getParameter("nguoinhan");
		String NoiDung = request.getParameter("noidungtl");
		System.out.println(TenDN+"|"+NguoiNhan+"|"+MaDT+"|"+NoiDung); 
		VaoThidao vt = new VaoThidao();
		vt.CapNhatPhanHoiTS(TenDN, NguoiNhan, MaDT, NoiDung);
		response .sendRedirect("TrangChuTS.jsp"); 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
