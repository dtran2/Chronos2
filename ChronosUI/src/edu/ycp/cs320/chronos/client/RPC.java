package edu.ycp.cs320.chronos.client;

import com.google.gwt.core.client.GWT;

public class RPC {
	public static final AccountManagementServiceAsync accountManagementService =
			GWT.create(AccountManagementService.class);
}
