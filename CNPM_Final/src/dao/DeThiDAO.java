package dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import dblayer.DBConnect;
import model.DeThi;

public class DeThiDAO implements ObjectDAO  {

	public DeThiDAO()
	{
		
	}
	public static Map<String, DeThi> mapDeThi = loadData();

 	private static Map<String, DeThi> loadData() {
 		Map<String, DeThi> mapTemp = new HashMap<>();
 		try {
 			String NguoiTao="luyentran";
 			ResultSet rs = new DBConnect().selectData("exec LayDanhSachDeThi N'"+NguoiTao+"'");
 			while (rs.next()) {
 				String MaDT = rs.getString(1);
 	            String KyThi = rs.getString(2);
 	            String MonThi = rs.getString(3);
 	            int SoCH = rs.getInt(4);
 	            int ThoiGianThi = rs.getInt(5);
 	            int SoDiem = rs.getInt(6);
 	            DeThi dt = new DeThi(MaDT,KyThi,MonThi,SoCH,ThoiGianThi,SoDiem,NguoiTao);
 	            mapTemp.put(dt.getMaDT(), dt);
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return mapTemp;
 	}
 	public ResultSet LayDanhSachDeThi(String nguoitao) throws Exception
	{
		String sql = "exec LayDanhSachDeThi N'"+nguoitao+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
 	public ResultSet LayDeThiTheoMaDT(String MaDT) throws Exception
	{
		String sql = " exec LayThongTinDeThi N'"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
 	
 	public ResultSet LayThongTinCauHoiCuaDeThi(String MaDT) throws Exception
	{
		String sql = "exec LayThongTinCauHoiCuaDeThi N'"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
 	
 	
	public ResultSet LayCauHoiDeThem(String MaDT) throws Exception
	{
		String sql = "select MaCH,NoiDung" + 
				"  from CAUHOI";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
 	public static void main(String[] args) {
		DeThiDAO chdao = new DeThiDAO();
 		System.out.println(chdao.mapDeThi);
	}
	@Override
	public boolean add(Object obj) {
		DeThi dt = (DeThi) obj;
		String sql = "EXECUTE ThemDeThi N'"+dt.getMaDT()+"',N'"+dt.getKyThi()+"',N'"+dt.getMonThi()+"','"+dt.getSoCH()+
				"','"+dt.getThoiGianThi()+"','"+dt.getSoDiem()+"',N'"+dt.getNguoiTao()+"'";
		try {
			new DBConnect().excuteSQL(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	@Override
	public boolean edit(Object obj, String id) {
		DeThi dt = (DeThi) obj;
		String sql="EXECUTE SuaDeThi N'"+dt.getMaDT()+"',N'"+dt.getKyThi()+"',N'"+dt.getMonThi()+"','"+dt.getSoCH()+
				"','"+dt.getThoiGianThi()+"','"+dt.getSoDiem()+"',N'"+dt.getNguoiTao()+"'";
		try {
			new DBConnect().excuteSQL(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return false;
	}
	@Override
	public boolean delete(String madt) {
		String sql="EXECUTE XoaDeThi '"+madt+"'";
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
