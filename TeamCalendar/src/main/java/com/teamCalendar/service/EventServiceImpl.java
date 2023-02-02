package com.teamCalendar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamCalendar.dao.EventDao;
import com.teamCalendar.dto.EventDto;
import com.teamCalendar.model.Event;

@Service("eventService")
@Transactional
public class EventServiceImpl implements EventService {
	
	   @Autowired
	   private EventDao eventDao;
	   
	   @Override
	    public List<Event> getAllEvents() {
	        return eventDao.getAllEvents();
	    }

	   @Override
	    public void addEvent(EventDto dto) {
	    	Event event = new Event(dto.getName(), dto.getType(), dto.getLocation(), dto.getDate(), dto.getTime(), dto.getReason());
	        eventDao.addEvent(event);
	    }

	   @Override
	    public Event getEvent(Long id) {
		   return eventDao.getEvent(id);
	    }

	   @Override
	    public void updateEvent(Long id, EventDto dto) {
	        Event event = eventDao.getEvent(id);
	        //System.out.println("event dto =========================" + dto.toString());
	        event.setName(dto.getName());
	        event.setType(dto.getType());
	        event.setLocation(dto.getLocation());
	        event.setDate(dto.getDate());
	        event.setTime(dto.getTime());
	        event.setReason(dto.getReason());
	        eventDao.updateEvent(event);
	    }

	   @Override
	    public void deleteEvent(Long id) {
//	        Event event = getEvent(name);
	        eventDao.deleteEvent(id);
	    }

}
