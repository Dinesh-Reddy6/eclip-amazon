package com.cmr.amazon.common;
import java.sql.*;
public class DBconfactory {

	private static String url=null;
	private static String username =null;
	private static String password = null;
	
	static {
		try {
			System.out.println("s");
				Class.forName("oracle.jdbc.driver.OracleDriver");
				System.out.println("s");
				username = "system";
				password = "root";
				url = "jdbc:oracle:thin:@localhost:1521:xe";
				
			}catch(Exception e) {System.out.println(e);}
	}
	public static Connection getConnection() {
		Connection con = null;
		try {
			
			con = DriverManager.getConnection(url, username, password);
			
		}catch(Exception e) {System.out.println(e);}
		
		return con;
	}
}

