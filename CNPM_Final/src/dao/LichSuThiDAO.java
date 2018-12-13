package dao;

import java.sql.ResultSet;

import dblayer.DBConnect;

public class LichSuThiDAO {
	public LichSuThiDAO()
	{
		
	}
	
 	public ResultSet LayLichSuThiTS(String tendn) throws Exception
	{
		String sql = "exec LayLichSuThiTS N'"+tendn+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
		
	}
 	
	public ResultSet LayThongTinTS(String tendn) throws Exception
	{
		String sql = "exec LayThongTinTS N'"+tendn+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
		
	}
	

}
