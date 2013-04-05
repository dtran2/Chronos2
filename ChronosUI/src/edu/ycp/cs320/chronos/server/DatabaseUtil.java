package edu.ycp.cs320.chronos.server;

import edu.ycp.cs320.chronos.shared.IDatabase;

public class DatabaseUtil {

	private static final IDatabase Instance = new FakeDatabase();

	public static IDatabase instance() {
		return Instance;
	}
/*
	public static void closeQuietly(PreparedStatement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// FIXME: should log
			}
		}
	}

	public static void closeQuietly(ResultSet resultSet) {
		if (resultSet != null) {
			try {
				resultSet.close();
			} catch (SQLException e) {
				// FIXME: should log
			}
		}
	}
*/
}