package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.ycp.cs320.chronos.shared.Account;
import edu.ycp.cs320.chronos.shared.Event;
/*
import edu.ycp.cs320.chronos.modelClasses.Account;
import edu.ycp.cs320.chronos.modelClasses.Event;
*/
@RemoteServiceRelativePath("eventManagement")
public interface EventManagementService extends RemoteService {

	void createEvent(String eventName, int month, int day, int year,
			int startTime, int endTime, String details);
	public Boolean isDupEvent(String eventName);
	public void removeEvent(String eventName);
	public Event getNextEvent(Account user, int month, int day, int year);
	public Event findEvent(String eventName);
	public int getMonth(String eventName);
	public int getDay(String eventName);
	public int getYear(String eventName);
	public int getStartTime(String eventName);
	public int getEndTime(String eventName);
	public String getDetails(String eventName);
}
