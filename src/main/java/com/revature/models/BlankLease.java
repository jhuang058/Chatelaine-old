package com.revature.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="blank_lease")
public class BlankLease implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="blank_lease_id", nullable=false)
	private int blankLeaseID;
	@Column(name="blank_lease", nullable=false)
	private String blankLeaseName;
	@OneToMany(mappedBy="blankLeaseID", fetch=FetchType.LAZY)
	private List<User> userList;

	
	

}
