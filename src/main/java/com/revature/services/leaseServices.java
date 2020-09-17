package com.revature.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.daos.LeaseDAO;
import com.revature.models.Lease;
import com.revature.models.User;

@Service
public class leaseServices {
	@Autowired
	private LeaseDAO lDAO;

	public leaseServices() {
		// TODO Auto-generated constructor stub
	}



	public Lease findLeaseByTenant(int id) {
		return lDAO.findLeaseByTenant(id);
	}

	public List<User> findAllLease() {
		return null;
	}



	public Lease updateLease(int id) {
	 return lDAO.updateLease(id);
	}



	public Lease addLease(Lease l) {
		return lDAO.addLease(l);
	}



}
