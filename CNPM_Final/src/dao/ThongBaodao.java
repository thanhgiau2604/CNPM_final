package dao;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import dblayer.DBConnect;
import model.ThongBao;

public class ThongBaodao implements ObjectDAO{
	public static Map<String, ThongBao> mapThongBao = loadData();
	 public ThongBaodao(){}
	 private static Map<String, ThongBao>loadData(){ 
         Map<String, ThongBao >mapTemp = new HashMap<>();
         try
         {  
         	ResultSet rs = new DBConnect().selectData("EXECUTE LayDanhSachThongBao");
         	while  (rs.next()) {
                     String maThongBao = rs.getString(1);
                     String noidungThongBao = rs.getString(2);
                     int laAdmin = rs.getInt(3);
                     int guiGV = rs.getInt(4);
                     int guiTS = rs.getInt(5);
                     String ngaygui = rs.getString(6);
                     String xoa = rs.getString(7);
                     String nguoitao =rs.getString(8);
                     ThongBao tb = new ThongBao(maThongBao, noidungThongBao, laAdmin, guiGV, guiTS, ngaygui, xoa, nguoitao);
                     mapTemp.put(tb.getMaTB(), tb);
         	}
         }
         catch (Exception e)
         {
                     e.printStackTrace();
          }
         return mapTemp;}
	 public ResultSet LayDanhSachThongBao() throws Exception
     {
                 String sql = "EXECUTE LayDanhSachThongBao";
                 DBConnect dbc = new DBConnect();
                 ResultSet rs = dbc.selectData(sql);
                 return rs;
     }
	 public ResultSet LayThongBaoTheoMa(String MaThongBao) throws Exception
     {
     	String sql = "SELECT *FROM THONGBAO WHERE MaTB='" + MaThongBao +"'";
     	DBConnect dbc = new DBConnect();
     	ResultSet rs = dbc.selectData(sql);
     	return rs;
     }
	 public ResultSet LayDanhSachThongBaoGV(String TenDN) throws Exception
     {
                 String sql = "EXECUTE LayDanhSachThongBaoGV '"+TenDN+"'";
                 DBConnect dbc = new DBConnect();
                 ResultSet rs = dbc.selectData(sql);
                 return rs;
     }
	 public ResultSet LayDanhSachThongBaoTuAD() throws Exception
     {
                 String sql = "EXECUTE NhanThongBaoLaAdmin";
                 DBConnect dbc = new DBConnect();
                 ResultSet rs = dbc.selectData(sql);
                 return rs;
     }
	 public ResultSet LayDanhSachThongBaoTuGV() throws Exception
     {
                 String sql = "EXECUTE NhanThongBaoGV";
                 DBConnect dbc = new DBConnect();
                 ResultSet rs = dbc.selectData(sql);
                 return rs;
     }
	 public ResultSet LayDanhSachThongBaoGVNhan() throws Exception
     {
                 String sql = "EXECUTE LayDanhSachThongBaoGVNhan";
                 DBConnect dbc = new DBConnect();
                 ResultSet rs = dbc.selectData(sql);
                 return rs;
     }
	 public static void main(String[] args)
     { 
                ThongBaodao tbdao = new ThongBaodao();
                System.out.println(tbdao.mapThongBao);
     }
	 @Override
		public boolean add(Object obj) {
			ThongBao tb = (ThongBao) obj;
		    String sql = "EXECUTE ThemThongBao N'"+tb.getMaTB()+"',N'" + tb.getNoiDungTB()+"',N'"+tb.getLaAdmin() +"',N'"+tb.getGuiGV()+"',N'"+tb.getGuiTS()+"',N'"+tb.getNguoiTao()+"'";
		    try {
		          new DBConnect().excuteSQL(sql);
		          return true;
		           } 
		    catch(Exception e)
		    {
		            e.printStackTrace();
		             System.out.println(e.getMessage());
		    }
			return false;
		}

	 @Override
		public boolean delete(String id) {
			String sql="EXECUTE XoaThongBao '"+id+"'";
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
		// TODO Auto-generated method stub
		return false;
	}

}
