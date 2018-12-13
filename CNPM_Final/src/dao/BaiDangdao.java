package dao;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import dblayer.DBConnect;
import model.BaiDang;

public class BaiDangdao implements ObjectDAO  {
           public static Map<String, BaiDang > mapBaiDang = loadData();
           public BaiDangdao(){}
           private static Map<String, BaiDang>loadData(){ 
                            Map<String, BaiDang >mapTemp = new HashMap<>();
                        try
                        {  
                        	ResultSet rs = new DBConnect().selectData("EXECUTE LayDanhSachBaiDang");
                        	while  (rs.next()) {
                                    String maBaiDang = rs.getString(1);
                                    String tieudeBaiDang = rs.getString(2);
                                    String noidungBaiDang = rs.getString(3);
                                    String tacgia = rs.getString(4);
                                    BaiDang bd = new BaiDang(maBaiDang, tieudeBaiDang, noidungBaiDang, tacgia);
                                    mapTemp.put(bd.getMaBD(), bd);
                        	}
                        }
                        catch (Exception e)
                        {
                                    e.printStackTrace();
                         }
                        return mapTemp;}
            public ResultSet LayDanhSachBaiDang() throws Exception
            {
                        String sql = " EXECUTE LayDanhSachBaiDang";
                        DBConnect dbc = new DBConnect();
                        ResultSet rs = dbc.selectData(sql);
                        return rs;
            }
            public ResultSet LayDanhSachBaiDangTheoMa(String MaBaiDang) throws Exception
            {
            	String sql = "SELECT *FROM BAIDANG WHERE MaBD='" + MaBaiDang +"'";
            	DBConnect dbc = new DBConnect();
            	ResultSet rs = dbc.selectData(sql);
            	return rs;
            }
            public static void main(String[] args)
            { 
                       BaiDangdao bd = new BaiDangdao();
                       System.out.println(bd.mapBaiDang);
            }
			@Override
			public boolean add(Object obj) {
				BaiDang bd = (BaiDang) obj;
			    String sql = "EXECUTE ThemBaiDang N'"+bd.getMaBD()+"',N'"+bd.getTieuDeBD()+"',N'"+bd.getNoiDungBD()+"',N'" + bd.getTacGia() + "'";
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
			public boolean edit(Object obj, String id) {
				BaiDang bd = (BaiDang) obj;
			    String sql = "EXECUTE SuaBaiDang N'"+bd.getMaBD()+"',N'"+bd.getTieuDeBD()+"',N'"+bd.getNoiDungBD()+"',N'" + bd.getTacGia() + "'";
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
				String sql="EXECUTE XoaBaiDang '"+id+"'";
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
