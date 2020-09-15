package com.revature.daos;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.revature.models.Event;


public interface IEventDAO {
	
	public List<Event> findAll();
	public Event findByDate(Date date);
	public boolean addEvent(Event event);
	
}
