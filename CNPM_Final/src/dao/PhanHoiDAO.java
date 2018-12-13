package dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import dblayer.DBConnect;
import model.PhanHoi;

public class PhanHoiDAO implements ObjectDAO {

	public static Map<String, PhanHoi> mapPhanHoi = loadData();
 	public PhanHoiDAO() {
 	}
 	private static Map<String, PhanHoi> loadData() {
 		Map<String, PhanHoi> mapTemp = new HashMap<>();
 		try {
 			ResultSet rs = new DBConnect().selectData("EXECUTE LayDanhSachPhanHoiTheoTaiKhoan");
 			while (rs.next()) {
 				String tendngui = rs.getString(1);
 	            String tendnnhan = rs.getString(2);
 	            String madt = rs.getString(3);
 	            String noidung = rs.getString(4);
 	            boolean daxem = rs.getBoolean(5);
 	            PhanHoi ph = new PhanHoi(tendngui,tendnnhan,madt,noidung,daxem);
 	            mapTemp.put(ph.getTenDNnhan(),ph);
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return mapTemp;
 	}
 	public ResultSet LayDanhSachPhanHoiTheoTaiKhoan(String nguoitao) throws Exception
	{
		String sql = "EXECUTE LayDanhSachPhanHoiTheoTaiKhoan N'"+nguoitao+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
		
	}
 	
 	public ResultSet LayChiTietPhanHoi(String mats,String madt,String tendn) throws Exception
	{
		String sql = "  exec LayChiTietPhanHoi N'"+mats+"',N'"+madt+"',N'"+tendn+"'";
		System.out.println(sql);
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
		
		
	}
 	
 	public boolean CapNhatPhanHoi(String mats,String madt,String tendn) throws Exception
 	{
 		String sql=" exec CapNhatPhanHoi N'"+mats+"',N'"+madt+"',N'"+tendn+"'"; 		
 		try {
			new DBConnect().excuteSQL(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
 		return false;
 	}
 	
 	public boolean LuuPhanHoi(String mats,String tendn, String madt,String noidung) throws Exception
 	{
 		String sql=" exec LuuPhanHoi N'"+mats+"',N'"+tendn+"',N'"+madt+"',N'"+noidung+"'"; 		
 		try {
			new DBConnect().excuteSQL(sql);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
 		return false;
 	}
 	
 	public static void main(String[] args) {
 		System.out.println("aaaaaaaaaaaaaa");
	}
 	
	@Override
	public boolean add(Object obj) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Object obj, String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
