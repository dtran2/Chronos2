package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("eventManagement")
public interface EventManagementService extends RemoteService {

	public Boolean createEvent(String eventName, int month, int day, int year, 
			int startTime, int endTime, String details);
	
	public Boolean isDupEvent(String EventName);
	
	public void removeEvent(String eventName);
	
	
}
