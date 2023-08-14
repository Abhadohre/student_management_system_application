package com.data;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcC {
	 static Connection con;
	public  static Connection jdbcC1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String user ="root";
			String password = "root";
			String url ="jdbc:mysql://localhost:3360/student_management_system_application";
			con =DriverManager.getConnection(url,user ,password);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
	}

}
