package edu.ycp.cs320.chronos.shared;
import java.io.Serializable;

public class Event implements Serializable {
	private static final long serialVersionUID = 1L;
		private int month;
		private int day;
		private int year;
		private int startTime;
		private int endTime;
		private String details;
		private String eventName;
		
	public Event() {
		
	}
		
	public Event(int m, int d, int y, int st, int et, String de, String name){
		this.month = m;
		this.day = d;
		this.year = y;
		this.startTime = st;
		this.endTime = et;
		this.details = de;
		this.eventName = name;
	}
	public int getMonth(){
		return month;
	}
	public int getDay(){
		return day;
	}
	public int getYear(){
		return year;
	}
	public int getStartTime(){
		return startTime;
	}
	public int getEndTime(){
		return endTime;
	}
	public String getDetails(){
		return details;
	}
	public void setName(String name){
		this.eventName = name;
	}
	public String getName(){
		return eventName;
	}
	
	
	
}
