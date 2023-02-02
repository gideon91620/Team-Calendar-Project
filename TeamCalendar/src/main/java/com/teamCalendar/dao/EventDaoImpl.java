package com.teamCalendar.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


import com.teamCalendar.model.Event;

@Repository("eventDao")
public class EventDaoImpl extends AbstractDao implements EventDao {

	@Override
	public void addEvent(Event event) {
//		Session session = getSession();
//		session.beginTransaction();
//		session.save(event);
//		session.getTransaction().commit();
		persist(event);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Event> getAllEvents() {
		@SuppressWarnings("deprecation")
		Criteria criteria = getSession().createCriteria(Event.class);
		return (List<Event>) criteria.list();
	}

	@Override
	public Event getEvent(Long id) {
//		Session session = getSession();
//		session.beginTransaction();
//		Event event = session.get(Event.class, id);
//		session.getTransaction().commit();
		String hql = "FROM Event e WHERE e.id = ?1";
		
		return getSession().createQuery(hql, Event.class).setParameter(1, id).uniqueResult();
	}

	@Override
	public void updateEvent(Event event) {
//		Session session = getSession();
//		session.beginTransaction();
//		session.update(event);
//		session.getTransaction().commit();
		String hql = "UPDATE Event e SET e.name = ?1, e.type = ?2, e.location = ?3, e.date = ?4, e.time = ?5, e.reason = ?6 WHERE e.id = ?7";
		getSession().createQuery(hql)
				.setParameter(1, event.getName())
				.setParameter(2, event.getType())
				.setParameter(3, event.getLocation())
				.setParameter(4, event.getDate())
				.setParameter(5, event.getTime())
				.setParameter(6, event.getReason())
				.setParameter(7, event.getId())
				.executeUpdate();
		
	}

	@Override
	public void deleteEvent(Long id) {
//		Session session = getSession();
//		session.beginTransaction();
//		Event event = session.get(Event.class, id);
//		session.delete(event);
//		session.getTransaction().commit();
     String hql = "DELETE Event e WHERE e.id = ?1";
     getSession().createQuery(hql).setParameter(1, id).executeUpdate();
	}
}