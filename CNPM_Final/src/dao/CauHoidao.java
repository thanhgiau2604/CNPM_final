package dao;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import dblayer.DBConnect;
import model.CauHoi;
public class CauHoidao implements ObjectDAO {

	public static Map<String, CauHoi> mapCauHoi = loadData();
 	public CauHoidao() {
 	}
 	private static Map<String, CauHoi> loadData() {
 		Map<String, CauHoi> mapTemp = new HashMap<>();
 		try {
 			ResultSet rs = new DBConnect().selectData("EXECUTE LayDanhSachCauHoi");
 			while (rs.next()) {
 				String maCauHoi = rs.getString(1);
 	            String noiDung = rs.getString(2);
 	            String luaChonA = rs.getString(3);
 	            String luaChonB = rs.getString(4);
 	            String luaChonC = rs.getString(5);
 	            String luaChonD = rs.getString(6);
 	            String dapAn = rs.getString(7);
 	            String nguoiTao = rs.getString(8);
 	            CauHoi ch = new CauHoi(maCauHoi,noiDung,luaChonA,luaChonB,luaChonC,luaChonD,dapAn,nguoiTao);
 	            mapTemp.put(ch.getMaCH(), ch);
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return mapTemp;
 	}
 	public boolean KiemTraMaDT(String MaDT) throws Exception
 	{
 		boolean ok =false;
 		String sql = "SELECT COUNT(*) FROM DETHI WHERE MaDT='"+MaDT+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		int count=0;
		while (rs.next())
		{
			count = rs.getInt(1);
		}
		if (count==1) return ok=true;
 		return ok;
 	}
 	public String RamdomMaDT(String TenDN) throws Exception
	{
		String sql = "SELECT COUNT(*) FROM DETHI WHERE NguoiTao='"+TenDN+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		int count=0;
		while (rs.next())
		{
		count = rs.getInt(1); 
		}
		String MaDT = "DT_"+TenDN+"_"+count;
		boolean ok = KiemTraMaCH(MaDT);
		while (ok==true)
		{
			count++;
			MaDT = "DT_"+TenDN+"_"+count;
			ok = KiemTraMaCH(MaDT);
		}
		return MaDT;
	}
 	public boolean KiemTraMaCH(String MaCH) throws Exception
 	{
 		boolean ok =false;
 		String sql = "SELECT COUNT(*) FROM CAUHOI WHERE MaCH='"+MaCH+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		int count=0;
		while (rs.next())
		{
			count = rs.getInt(1);
		}
		if (count==1) return ok=true;
 		return ok;
 	}
 	public String RamdomMaCH(String TenDN) throws Exception
	{
		String sql = "SELECT COUNT(*) FROM CAUHOI WHERE NguoiTao='"+TenDN+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		int count=0;
		while (rs.next())
		{
		count = rs.getInt(1); 
		}
		String MaCH = "CH_"+TenDN+"_"+count;
		boolean ok = KiemTraMaCH(MaCH);
		while (ok==true)
		{
			count++;
			MaCH = "CH_"+TenDN+"_"+count;
			ok = KiemTraMaCH(MaCH);
		}
		return MaCH;
	}
 	public ResultSet LayDanhSachCauHoi() throws Exception
	{
		String sql = "EXECUTE LayDanhSachCauHoi";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
 	public ResultSet LayCauHoiTheoMaCH(String MaCauHoi) throws Exception
	{
		String sql = "SELECT * FROM CAUHOI WHERE MaCH='"+MaCauHoi+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
 	public ResultSet LayCauHoiTheoTenDN(String TenDN) throws Exception
	{
		String sql = "EXEC LayDanhSachCauHoiTheoTenDN '"+TenDN+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
 	public static void main(String[] args) throws Exception {
		CauHoidao chdao = new CauHoidao();
 		System.out.println(chdao.RamdomMaDT("luyentran"));
	}
	
	
	@Override
	public boolean add(Object obj) {
		CauHoi ch = (CauHoi) obj;
		String sql = "EXECUTE ThemCauHoi '"+ch.getMaCH()+"',N'"+ch.getNoiDungCH()+"',N'"+ch.getLuaChonA()+"',N'"+ch.getLuaChonB()+
				"',N'"+ch.getLuaChonC()+"',N'"+ch.getLuaChonD()+"','"+ch.getDapAn()+"','"+ch.getNguoiTao()+"'";
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
		CauHoi ch = (CauHoi) obj;
		String sql="EXECUTE SuaCauHoi '"+ch.getMaCH()+"',N'"+ch.getNoiDungCH()+"',N'"+ch.getLuaChonA()+"',N'"+ch.getLuaChonB()+"',N'"
		+ch.getLuaChonC()+"',N'"+ch.getLuaChonD()+"','"+ch.getDapAn()+"','"+ch.getNguoiTao()+"'";
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
	public boolean delete(String id) {
		String sql="EXECUTE XoaCauHoi '"+id+"'";
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
