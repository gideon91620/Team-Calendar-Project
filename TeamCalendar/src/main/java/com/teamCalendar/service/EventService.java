package com.teamCalendar.service;

import java.util.ArrayList;
import java.util.List;

import com.teamCalendar.model.Event;

public class EventService {
	
	 private List<Event> events;

	    public EventService() {
	        this.events = new ArrayList<Event>();
	    }

	    public List<Event> getAllEvents() {
	        return events;
	    }

	    public void addEvent(Event event) {
	        events.add(event);
	    }

	    public Event getEvent(String name) {
	        for (Event event : events) {
	            if (event.getName().equals(name)) {
	                return event;
	            }
	        }
	        return null;
	    }

	    public void updateEvent(Event event) {
	        Event currentEvent = getEvent(event.getName());
	        currentEvent.setType(event.getType());
	        currentEvent.setLocation(event.getLocation());
	        currentEvent.setDate(event.getDate());
	        currentEvent.setTime(event.getTime());
	        currentEvent.setReason(event.getReason());
	    }

	    public void deleteEvent(String name) {
	        Event event = getEvent(name);
	        events.remove(event);
	    }

}
