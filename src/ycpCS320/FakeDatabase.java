package ycpCS320;

import java.util.HashMap;
import java.util.Map;

public class FakeDatabase implements IDatabase {
	private Map<String, Event> nameToEventMap;
	
	public FakeDatabase() {
		nameToEventMap = new HashMap<String, Event>();
		
		//Event1 (Christmas)
		Event e = new Event(12, 25, 2013, 1200, 2400, "Christmas");
		e.setName("testevent");
		nameToEventMap.put("testevent", e);
		
		Event e1 = new Event(1, 1, 2014, 1200, 2400, "New Years");
		e.setName("New Years");
		nameToEventMap.put("new years", e1);
	}

	@Override
	public Event findEvent(String eventName) {
		return nameToEventMap.get(eventName);
	}

}
