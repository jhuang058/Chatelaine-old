package com.chatelaine.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chatelaine.daos.BlankLeaseDAO;
import com.chatelaine.daos.LeaseDAO;
import com.chatelaine.models.BlankLease;
import com.chatelaine.models.Lease;

@Service
public class leaseServices {
	
	private LeaseDAO lDAO;
	private BlankLeaseDAO bDAO;
	@Autowired
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




	public BlankLease findBlankLease() {
		return bDAO.findBlankLease();
	}



}
