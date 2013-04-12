package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.ycp.cs320.chronos.shared.Account;
import edu.ycp.cs320.chronos.shared.Event;

public interface EventManagementServiceAsync {

	void createEvent(String eventName, int month, int day, int year,
			int startTime, int endTime, String details,
			AsyncCallback<Void> callback);
	void isDupEvent(String eventName, AsyncCallback<Boolean> callback);
	void removeEvent(String eventName, AsyncCallback<Void> callback);
	void getNextEvent(Account user, int month, int day, int year,
			AsyncCallback<Event> callback);
	void findEvent(String eventName, AsyncCallback<Event> callback);
	void getMonth(String eventName, AsyncCallback<Integer> callback);
	void getDay(String eventName, AsyncCallback<Integer> callback);
	void getYear(String eventName, AsyncCallback<Integer> callback);
	void getStartTime(String eventName, AsyncCallback<Integer> callback);
	void getEndTime(String eventName, AsyncCallback<Integer> callback);
	void getDetails(String eventName, AsyncCallback<String> callback);
}
