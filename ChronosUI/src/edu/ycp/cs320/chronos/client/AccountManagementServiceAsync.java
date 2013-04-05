package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AccountManagementServiceAsync {

	void verifyAccount(String username, String password,
			AsyncCallback<Boolean> callback);

}
