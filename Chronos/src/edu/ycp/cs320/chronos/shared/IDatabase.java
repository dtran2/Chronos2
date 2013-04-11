package edu.ycp.cs320.chronos.shared;

import edu.ycp.cs320.chronos.modelClasses.Account;
import edu.ycp.cs320.chronos.modelClasses.Event;

public interface IDatabase {
	Event getNextEvent(Account user, int month, int day, int year);
	public Event findEvent(String eventName);
	public int getMonth(String eventName);
	public int getDay(String eventName);
	public int getYear(String eventName);
	public int getStartTime(String eventName);
	public int getEndTime(String eventName);
	public String getDetails(String eventName);
	public void createEvent(String eventName, int month, int day, int year, int startTime, int endTime, String details);
	public boolean isDupEvent(String eventName);
	public void removeEvent(String eventName);
	public void createAccount(String usrName, String password, String email);
	public void removeAccount(String account);
	public boolean verifyAccount(String usrName, String password);
	public boolean isDupAccount(String account);
	
	
}
