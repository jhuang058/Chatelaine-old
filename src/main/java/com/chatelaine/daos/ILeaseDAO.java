package com.chatelaine.daos;

import java.util.List;

import com.chatelaine.models.Lease;

public interface ILeaseDAO {
	public List<Lease> findAllLease();
	public Lease findLeaseByTenant(int id);
	public Lease findBySig();
	public Lease findCurrent();
	public Lease findExpired();
	public Lease updateLease(int id);


}
