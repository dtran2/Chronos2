package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface EventManagementServiceAsync {

	void createEvent(String eventName, int month, int day, int year,
			int startTime, int endTime, String details,
			AsyncCallback<Boolean> callback);

	void isDupEvent(String EventName, AsyncCallback<Boolean> callback);
	
	void removeEvent(String eventName, AsyncCallback<Void> callback);
	
}
