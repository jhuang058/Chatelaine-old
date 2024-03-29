package com.chatelaine.daos;

import java.util.List;

import com.chatelaine.models.MaintenanceTicket;
import com.chatelaine.models.TicketStatus;

public interface ITicketDAO {

	MaintenanceTicket findById(int id);

	List<MaintenanceTicket> findAll();

	TicketStatus findTicketStatus(int id);

	boolean addTicket(MaintenanceTicket t);

	List<MaintenanceTicket> findByAuthor(int id);

	List<MaintenanceTicket> findByStatus(int id);

	boolean updateTicket(MaintenanceTicket t);

	public static void main(String[] args) {
		
	}

}
