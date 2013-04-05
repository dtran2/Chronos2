package edu.ycp.cs320.chronos.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.ycp.cs320.chronos.client.AccountManagementService;

public class AccountManagementServiceImpl extends RemoteServiceServlet
		implements AccountManagementService {
	private static final long serialVersionUID = 1L;

	@Override
	public boolean verifyAccount(String username, String password) {
		return DatabaseUtil.instance().verifyAccount(username, password);
	}

}
