package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.GWT;

import edu.ycp.cs320.chronos.database.Database;

public class RPC {
	public static final Database database =
			GWT.create(Database.class);
}
