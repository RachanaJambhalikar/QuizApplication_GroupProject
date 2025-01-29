package com.project.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static final String Driver_Name = "oracle.jdbc.driver.OracleDriver";
	public static final String Driver_URL = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String Username = "system";
	public static final String Password = "system";

	public static Connection getConnection(){
		Connection connection=null;
		try {
			Class.forName(Driver_Name);
			connection = DriverManager.getConnection(Driver_URL, Username, Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}
}
