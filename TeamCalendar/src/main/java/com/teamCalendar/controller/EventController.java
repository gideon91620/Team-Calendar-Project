package com.teamCalendar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teamCalendar.dto.EventDto;
import com.teamCalendar.model.Event;
import com.teamCalendar.service.EventService;

@RestController
@RequestMapping("/events")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping
	public List<Event> events(){
		return eventService.getAllEvents();
	}
	
	@GetMapping("/{id}")
	public Event getEventById(@PathVariable("id") Long id) {
		System.out.println("event id====================="+ id);
		return eventService.getEvent(id);
	}
	
	@PostMapping
	public ResponseEntity<Void> events(@RequestBody EventDto event) {
		eventService.addEvent(event);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Void> updateEvent(@PathVariable("id") Long id, @RequestBody EventDto dto){
		eventService.updateEvent(id, dto);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEvent(@PathVariable("id") Long id){
		eventService.deleteEvent(id);
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
