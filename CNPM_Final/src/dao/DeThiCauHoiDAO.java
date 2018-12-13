package dao;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import dblayer.DBConnect;
import model.DeThiCauHoi;

public class DeThiCauHoiDAO implements ObjectDAO {

	public DeThiCauHoiDAO() {
		super();

	}
	//public static Map<String, DeThiCauHoi> mapDeThiCH = loadData();

 	public static Map<String, DeThiCauHoi> loadData(String MaDT) 
 	{
 		Map<String, DeThiCauHoi> mapTemp = new HashMap<>();
 		try {
 			ResultSet rs = new DBConnect().selectData(" select * from [CH-DT]'");
 			while (rs.next()) {
 				String madt = rs.getString(1);
 	            String mach= rs.getString(2);	           
 	            int STT=rs.getInt(3);
 	            boolean DaLay=rs.getBoolean(4);
	            DeThiCauHoi dtch=new DeThiCauHoi(mach,madt,STT,DaLay);
 	            mapTemp.put(dtch.getMaCH(), dtch);    
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return mapTemp;
 	}

	public ResultSet LayDanhSachCauHoiTheoTaiKhoan(String nguoitao) throws Exception
	{
		String sql = "  select MaCH,NoiDung" + 
				"  from CAUHOI" + 
				"  where NguoiTao=N'"+nguoitao+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public ResultSet LayCauHoiTrongDeThiTheostt(String madt,int stt) throws Exception
	{
		String sql = " exec LayCauHoiTrongDeThiTheostt N'"+madt+"',"+stt+"";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public int SoCauHoiCuaDeThi(String madt) throws Exception
	{
		String sql= "	select dbo.SoCauHoiCuaDeThi('"+madt+"')";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		int gt=0;
		while(rs.next())
		{
			gt=rs.getInt(1);
		}
		return gt;
	}
	
	public ResultSet LayCauHoiTheostt(String madt,String mach,int stt) throws Exception
	{
		String sql = " exec LayCauHoiTheostt '"+madt+"', N'"+mach+"',"+stt+"";
		System.out.println(sql);
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public ResultSet LayDanhSachCauHoiTheoDeThi(String madt) throws Exception
	{
		String sql = "exec LayDanhSachDeThiCauHoi N'"+madt+"'";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		return rs;
	}
	
	public boolean KiemTraCauHoiTonTai(String MaCH,String MaDT) throws Exception
	{
		String sql= "select dbo.KiemTraCauHoiTonTai(N'"+MaCH+"',N'"+MaDT+"')";
		DBConnect dbc = new DBConnect();
		ResultSet rs = dbc.selectData(sql);
		//System.out.println(sql);
		int gt=0;
		while(rs.next())
		{
			gt=rs.getInt(1);
		}
		if(gt==1)
			return true;
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		
		
	}
	
   public boolean XoaCauHoiDeThi(String MaCH,String MaDT)
   {
		String sql = " exec XoaCauHoiDeThi N'"+MaCH+"',N'"+MaDT+"'";
		System.out.println(sql);
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
	public boolean add(Object obj) {
		DeThiCauHoi dt = (DeThiCauHoi) obj;
		String sql="exec ThemDeThiCauHoi N'"+dt.getMaCH()+"',N'"+dt.getMaDT()+"',"+dt.getSoTT()+",'"+dt.isDaLay()+"'";
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

	@Override
	public boolean delete( String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
	

}
