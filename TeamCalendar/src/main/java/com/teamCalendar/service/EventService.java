package com.teamCalendar.service;

import java.util.List;

import com.teamCalendar.dto.EventDto;
import com.teamCalendar.model.Event;

public interface EventService {
	
	public List<Event> getAllEvents();
	public void addEvent(EventDto event);
	public Event getEvent(Long id);
	public void updateEvent(Long id, EventDto event);
	public void deleteEvent(Long id);


}
