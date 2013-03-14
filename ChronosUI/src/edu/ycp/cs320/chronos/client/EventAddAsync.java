package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EventAddAsync {

	void createEvent(String eventName, int month, int day, int year,
			int startTime, int endTime, String details,
			AsyncCallback<Boolean> callback);

	
}
