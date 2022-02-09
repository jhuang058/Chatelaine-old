package com.chatelaine.daos;

import java.sql.Date;

import java.util.List;

import com.chatelaine.models.Event;


public interface IEventDAO {
	
	public List<Event> findAll();
	public Event findByDate(Date date);
	public boolean addEvent(Event event);
	boolean updateEvent(Event ev);
	List<Event> findUpcoming(Date date);
	List<Event> findPast(Date date);
	List<Event> findByUser(int userId);
	
}
