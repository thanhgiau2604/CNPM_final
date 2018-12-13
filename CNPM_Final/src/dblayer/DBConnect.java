package dblayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class DBConnect {
	public DBConnect() {
		
	}
	public static Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=TracNghiemTrucTuyen; user=sa; password=123456789");
		}
		catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database! Error is "+e.getMessage());
		}
		return conn;
	}
	public static void main(String[] args)
	{
		System.out.println(getConnection());
	}
	
	public void excuteSQL(String sql) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		stmt.executeUpdate(sql);
	}
	public ResultSet selectData(String sql) throws Exception{
		Connection conn = getConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		return rs;
	}
	
}