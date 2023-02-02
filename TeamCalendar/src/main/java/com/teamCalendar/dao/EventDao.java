package com.teamCalendar.dao;

import java.util.List;


import com.teamCalendar.model.Event;

public interface EventDao {

	public void addEvent(Event event);
	List<Event> getAllEvents();
	public Event getEvent(Long id);
	public void updateEvent(Event event);
	 public void deleteEvent(Long id);
}
