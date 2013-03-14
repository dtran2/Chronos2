package edu.ycp.cs320.chronos.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface EventAdd extends RemoteService {

	public Boolean createEvent(String eventName, int month, int day, int year, 
			int startTime, int endTime, String details);
}
