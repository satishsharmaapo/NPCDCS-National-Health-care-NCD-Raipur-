package npcdcs.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static Connection con = null;
	private static String driver = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/npcdcs_best";
	private static String username = "cgncd_reports";
	private static String password = "reports123";
	static {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Problem as : " + e);
		}

	}
	static {

		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (SQLException io) {
			System.out.println("Error url ,username ,password : " + io);
		}
	}

	public static Connection getConnection() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(url, username, password);
			} catch (SQLException io) {
				System.out.println("Error url ,username ,password : " + io);
			}

		}
		return con;
	}
}
