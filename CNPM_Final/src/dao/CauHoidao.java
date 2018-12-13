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
	
 	public static void main(String[] args) {
		CauHoidao chdao = new CauHoidao();
 		System.out.println(chdao.mapCauHoi);
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
