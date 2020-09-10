package com.revature.models;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Events implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="event_id", nullable=false)
	private int eventID;
	@Column(name="event_name", nullable=false)
	private String eventName;
	@Column(name="event_description")
	private String eventDescription;
	@Column(name="event_date", nullable=false)
	private Timestamp eventDate;
	@ManyToMany(mappedBy="roleID", fetch=FetchType.LAZY)
	private List<User> userList;
	
	

}
