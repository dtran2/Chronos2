package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AccountAddAsync {

	void CreateAccount(String userName, String password, String emailAddress,
			AsyncCallback<Boolean> callback);

}
