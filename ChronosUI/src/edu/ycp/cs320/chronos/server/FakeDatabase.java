package edu.ycp.cs320.chronos.server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import edu.ycp.cs320.chronos.modelClasses.Account;
import edu.ycp.cs320.chronos.modelClasses.Event;
import edu.ycp.cs320.chronos.shared.IDatabase;

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

	//@Override
	/**
	 * Methods for handling event info.
	 * 
	 */

	/**
	 * Sifts through an arraylist of today's events and returns the Event that will occur next
	 * 
	 *            Note: Replace current method of doing this with recursion
	 */
	public Event getNextEvent(Account user, int month, int day, int year){
		ArrayList<Event> events = user.getTodaysEvents(month, day, year);
		Event nextEvent = events.get(0); //Set the "nextEvent] to the first Event in the arrayList "events"
		//Sift through the array list to find the next coming event
		for(int i = 1; i < events.size(); i++){
			//if the current "nextEvent"'s start time is greater, it is not the next event 
			if(nextEvent.getStartTime() > events.get(i).getStartTime()){
				nextEvent = events.get(i);
			}
		}
		return nextEvent;
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
	 * Method for verifying account username and password.
	 * @param usr
	 * @param password
	 * @return true if password matches with the account; false otherwise
	 */
	public boolean verifyAccount(String usr, String password){
		Account account = accountMap.get(usr);
		if (account == null) {
			return false;
		}
		if(account.getPassword().equals(password)){
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
