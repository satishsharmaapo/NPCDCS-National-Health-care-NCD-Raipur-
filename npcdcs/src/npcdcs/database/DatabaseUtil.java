package npcdcs.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseUtil {
	public static void closeStatement(Statement stmt) {
		try {
			if (stmt != null) {

				stmt.close();
				stmt = null;
			}
		} catch (SQLException ex) {
			System.err.println(ex);
		}

	}

	public static void closeResultSet(ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException ex) {
			System.err.println(ex);
		}

	}
}
