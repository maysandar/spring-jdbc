package com.techfun.jdbc.connectionhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionHelper {
	private static String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static String DB_CONNECTION = "jdbc:mysql://localhost:3306/ride";
	private static String DB_USER = "root";
	private static String DB_PASSWORD = "";

	public static Connection getDBConnection() {

		Connection dbConnection = null;
		try {
			Class.forName(DB_DRIVER);
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}
}
