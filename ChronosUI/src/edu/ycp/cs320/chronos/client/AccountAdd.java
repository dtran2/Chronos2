package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface AccountAdd extends RemoteService {

	
	public Boolean CreateAccount(String userName , String password, String emailAddress);
}
