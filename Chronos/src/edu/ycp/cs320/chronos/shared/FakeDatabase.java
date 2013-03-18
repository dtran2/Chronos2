package edu.ycp.cs320.chronos.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FakeDatabase implements IDatabase {
	private Map<String, Event> nameToEventMap;
	private Map<String, Account> accountMap;
	//Nested Maps to manage events of an account
	private Map<Map<String, Account>, Map<String, Event>> accountToEventMap;
	
	public FakeDatabase() {
		nameToEventMap = new HashMap<String, Event>();
		accountMap = new HashMap<String, Account>();
		
		createEvent("Christmas", 12, 25, 2013, 1200, 2400, "Christmas");
		createEvent("New Years", 1, 1, 2014, 1200, 2400, "New Years day!");
		createEvent("Thanksgiving", 11, 28, 2013, 1200, 2400, "turkey turkey turkey");
		
		createAccount("Spongebob", "Squarepants", "x@y.z");
		createAccount("Patric", "Star", "a@b.c");
		createAccount("Sandy", "Cheeks", "q@r.s");
	}

	@Override
	/**
	 * Methods for handling event info.
	 * 
	 */
	
	public Event getNextEvent(Account user){
		ArrayList<Event> events = user.getEvents();
		//Sift through the array list to find the next coming event
		
		
	}
	public Event findEvent(String eventName) {
		return nameToEventMap.get(eventName);
	}
	public int getMonth(String eventName){
		return findEvent(eventName).getMonth();
	}
	public int getDay(String eventName){
		return findEvent(eventName).getDay();
	}
	public int getYear(String eventName){
		return findEvent(eventName).getYear();
	}
	public int getStartTime(String eventName){
		return findEvent(eventName).getStartTime();
	}
	public int getEndTime(String eventName){
		return findEvent(eventName).getEndTime();
	}
	public String getDetails(String eventName){
		return findEvent(eventName).getDetails();
	}
	public Event getNextEvent(String account){
		Event next;
		
		
		return next;
	}
	/**
	 * Create an event
	 * Add event to "nameToEventMap" Map
	 * @param eventName 
	 * @param month
	 * @param day
	 * @param year
	 * @param startTime
	 * @param endTime
	 * @param details
	 */
	public void createEvent(String eventName, int month, int day, int year, int startTime, int endTime, String details){
		Event e = new Event(month, day, year, startTime, endTime, details);
		e.setName(eventName);
		nameToEventMap.put(eventName, e);
	}
	public boolean isDupEvent(String eventName){
		if(!nameToEventMap.containsKey(eventName)){
			return false;
		}
		else{
			return true;
		}
	}
	
	/**
	 * Removes specified event from "nameToEventMap"
	 * @param eventName
	 */
	public void removeEvent(String eventName){
		nameToEventMap.remove(eventName);
	}
	
	/**
	 * Methods for handling Account info.
	 */
	public void createAccount(String usr, String password, String email){
		Account a = new Account(usr, password, email);
		accountMap.put(usr, a);	
	}
	public void removeAccount(String account){
		accountMap.remove(account);
	}
	/**
	 * Method for verifying account username and password match.
	 * @param usr
	 * @param password
	 * @return true if password matches with the account; false otherwise
	 */
	public boolean verifyAccount(String usr, String password){
		if(accountMap.get(usr).getPassword() == password){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isDupAccount(String account){
		if(!accountMap.containsKey(account)){
			return false;
		}
		else{ 
			return true;
		}
	}


}
