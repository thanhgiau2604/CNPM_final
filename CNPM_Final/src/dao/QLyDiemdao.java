package dao;

import java.sql.ResultSet;

import dblayer.DBConnect;

public class QLyDiemdao {
	public ResultSet ThongTinAllDeThi(String TenDN) throws Exception
	{
		String sql = "EXECUTE pr_ThongTinAllDeThi '"+TenDN+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet LayDanhSachDiemTheoDeThi(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_LayDanhSachDiemTheoDeThi '"+MaDT+"'";
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
	
	public ResultSet DSDiem_LuotThi(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_SX_LuotThi '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public ResultSet DSDiem_Max(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_TimDiemMax '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet DSDiem_Min(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_TimDiemMin '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public ResultSet DSDiem_TrenTB(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_TimDiemTrenTrungBinh '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet DSDiem_DuoiTB(String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_TimDiemDuoiTrungBinh '"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	public ResultSet DSDiem_Search(String TenDN, String MaDT) throws Exception
	{
		String sql = "EXECUTE pr_TimKiemDiemThiSinh '"+TenDN+"','"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
}
