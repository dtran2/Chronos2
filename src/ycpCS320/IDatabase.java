package ycpCS320;

public interface IDatabase {
	
	public Event findEvent(String eventName);
	public int getMonth(String eventName);
	public int getDay(String eventName);
	public int getYear(String eventName);
	public int getStartTime(String eventName);
	public int getEndTime(String eventName);
	public String getDetails(String eventName);
}
