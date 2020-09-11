package com.revature.daos;

import java.sql.Timestamp;
import java.util.List;

import com.revature.models.Events;

public interface IEventDAO {
	
	
	public List<Events> findAll();
	public Events findByDate(Timestamp date);
	public boolean addEvent(Events event);
}
