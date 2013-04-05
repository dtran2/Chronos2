package edu.ycp.cs320.chronos.shared;



public class Database {
	private static final IDatabase instance = new ChronosDatabase();
	
	public static IDatabase getDatabase() {
		return instance;
	}
}
