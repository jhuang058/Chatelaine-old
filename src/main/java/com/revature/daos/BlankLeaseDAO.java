package com.revature.daos;

import java.sql.Blob;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;

import com.revature.models.BlankLease;
import com.revature.utils.HibernateUtil;

public class BlankLeaseDAO implements IBlankLeaseDAO {
	private static final Logger log = LogManager.getLogger(EventDAO.class);

	public BlankLeaseDAO() {
	}

	@Override
	public BlankLease findBlankLease() {
		Session session = HibernateUtil.getSession();
		
		List<BlankLease> leases = session.createQuery("FROM BlankLease").list();
		BlankLease lease = leases.get(0);
		
		log.info("Viewing Blank Lease");
		System.out.println(lease + " ");
		return lease;
	}

}
