package singleTonConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	public static Connection con = null;

	private DbConnection() {
	}

	public static Connection getDatabaseCoonection() {
		try {
			if (con == null) {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqltag?autoReconnect=true&useSSL=false", "root", "password");
			}
		} catch (ClassNotFoundException e) {
			//System.out.println("Class Not Found Exception");
			e.printStackTrace();
		} catch (SQLException e) {
			//System.out.println("SQL Exception");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
