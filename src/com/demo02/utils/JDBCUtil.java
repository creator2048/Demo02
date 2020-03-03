package com.demo02.utils;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

public class JDBCUtil {
	
	public static String url = "jdbc:mysql://localhost:3306/jdbc_db";
	public static String user = "root";
	public static String password = "root";
	public static String drivername = "com.mysql.jdbc.Driver";
	
	public static Connection getConn() {
		try {
			Class.forName(JDBCUtil.drivername);
			
			return (Connection) DriverManager.getConnection(JDBCUtil.url, JDBCUtil.user, JDBCUtil.password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
