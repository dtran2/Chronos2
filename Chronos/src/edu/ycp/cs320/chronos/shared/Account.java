package edu.ycp.cs320.chronos.shared;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String userName, password, emailAddress;
	private ArrayList<Event> events;
	public Account(String usr, String pwd, String email){
		this.userName = usr;
		this.password = pwd;
		this.emailAddress = email;
		this.events = new ArrayList();
		
	}
	public String getUserName(){
		return userName;
	}
	public String getPassword(){
		return password;
	}
	public String getEmail(){
		return emailAddress;
	}
	public void addEvent(Event event){
		this.events.add(event);
	}
	public ArrayList<Event> getEvents(){
		return this.events;
	}
}
