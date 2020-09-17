package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.BlankLeaseDAO;
import com.revature.daos.LeaseDAO;
import com.revature.models.BlankLease;
import com.revature.models.Lease;
import com.revature.models.User;

@Service
public class leaseServices {
	@Autowired
	private LeaseDAO lDAO;
	private BlankLeaseDAO bDAO;

	public leaseServices() {
	}



	public Lease findLeaseByTenant(int id) {
		return lDAO.findLeaseByTenant(id);
	}

	public List<Lease> findAllLease() {
		return lDAO.findAllLease();
	}



	public Lease updateLease(int id) {
	 return lDAO.updateLease(id);
	}



	public Lease addLease(Lease l) {
		return lDAO.addLease(l);
	}



	public Lease updateLease(Lease l) {
		return lDAO.updateLease(l);
	}



	public BlankLease findBlankLease() {
		return bDAO.findBlankLease();
	}



}
