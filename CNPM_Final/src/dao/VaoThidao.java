package dao;
import java.sql.ResultSet;

import dblayer.DBConnect;
public class VaoThidao {
	public ResultSet LayDanhSachDeThiGiaoVien() throws Exception
	{
		String sql = "EXECUTE pr_LayDanhSachDT_GV";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayDanhSachDeThiAdmin() throws Exception
	{
		String sql = "EXECUTE pr_LayDanhSachDT_AD";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayDeThi(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_LayDeThi '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet ChonCauHoi(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_ChonCauHoi '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayCauHoi(String MaCH, int STT) throws Exception
	{
		String sql = "EXECUTE pr_LayCauHoi '"+MaCH+"',"+STT;
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet KiemTraTonTaiTraLoi(String TenDN, String MaCH, String MaDT, int LuotThi) throws Exception
	{
		String sql = "SELECT DBO.fn_KiemTraTonTaiTraLoi('"+TenDN+"','"+MaCH+"','"+MaDT+"',"+LuotThi+")";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayCauHoiTheoSTT(String MaDT, int STT) throws Exception
	{
		String sql = "EXECUTE pr_LayCauHoiTheoSTT '"+MaDT+"',"+STT;
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayLuotThi(String MaDT, String TenDN) throws Exception
	{
		String sql = "SELECT DBO.fn_MaxLuotThi('"+MaDT+"','"+TenDN+"')";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet TinhDiemThi(String TenDN, String MaDT, int LuotThi) throws Exception
	{
		String sql = "SELECT DBO.fn_TinhDiemThi('"+TenDN+"','"+MaDT+"',"+LuotThi+")";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayKetQuaThi(String TenDN, String MaDT, int LuotThi) throws Exception
	{
		String sql = "EXECUTE pr_LayKetQuaThi '"+TenDN+"','"+MaDT+"',"+LuotThi;
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayCauTraLoi(String TenDN, String MaDT, int STT, int LuotThi) throws Exception
	{
		String sql = "EXECUTE pr_LayCauTraLoi '"+TenDN+"','"+MaDT+"',"+STT+","+LuotThi;
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public ResultSet LayThongTinBaiLam(String TenDN, String MaDT, int LuotThi) throws Exception
	{
		String sql = "EXECUTE pr_ThongTinBaiLam '"+TenDN+"','"+MaDT+"',"+LuotThi;
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayDeThiNguoiTao(String TenDN) throws Exception
	{
		String sql = "EXECUTE pr_LayDeThiNguoiTao '"+TenDN+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public boolean ResetDaLay()
	{
		String sql="EXECUTE pr_ResetDaLay";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean ThemVaoCauTraLoi(String TenDN, String MaCH, String MaDT, int LuotThi, String CauTraLoi)
	{
		String sql="EXECUTE pr_ThemVaoCauTraLoi '"+TenDN+"','"+MaCH+"','"+MaDT+"',"+LuotThi+",'"+CauTraLoi+"'";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	public boolean CapNhatCauTraLoi(String TenDN, String MaCH, String MaDT, int LuotThi, String CauTraLoi)
	{
		String sql="EXECUTE pr_CapNhatCauTraLoi '"+TenDN+"','"+MaCH+"','"+MaDT+"',"+LuotThi+",'"+CauTraLoi+"'";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	public boolean ThemVaoBangDiem(String TenDN, String MaDT, int LuotThi,float Diem)
	{
		String sql="EXECUTE pr_ThemVaoBANGDIEM '"+TenDN+"','"+MaDT+"',"+LuotThi+","+Diem;
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean ResetCauHoi(String MaDT)
	{
		String sql="EXECUTE pr_ResetCauHoi '"+MaDT+"'";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean ResetAll()
	{
		String sql="EXECUTE pr_ResetAll";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	
	public boolean CapNhatPhanHoiTS(String TenDNGui, String TenDNNhan, String MaDT, String NDPhanHoi)
	{
		String sql="EXECUTE pr_CapNhatPhanHoiTS '"+TenDNGui+"','"+TenDNNhan+"','"+MaDT+"',N'"+NDPhanHoi+"'";
		try {
			new DBConnect().excuteSQL(sql);		
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
}
