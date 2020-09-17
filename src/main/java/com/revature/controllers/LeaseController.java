package com.revature.controllers;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Lease;
import com.revature.models.Role;
import com.revature.models.User;
import com.revature.services.UserServices;
import com.revature.services.leaseServices;

@RestController
//Adding the URI mapping for what requests this controller will handle
@RequestMapping(value="/lease")
@ResponseBody //This will at compile time add @ResponseBody to all methods in the class
public class LeaseController {
	
	@Autowired
	private leaseServices lServices;

	public LeaseController(leaseServices lServices) {
		super();
		this.lServices = lServices;
	}
	
	
			@RequestMapping(method=RequestMethod.GET)
			public List<User> assemble() {
				return lServices.findAllLease();
			}
			
			@GetMapping("/{id}") 
			public ResponseEntity<Lease> findLeaseByTenant(@PathVariable("id") int id) {
				Lease a = lServices.findLeaseByTenant(id);
				if(a==null) {
					return ResponseEntity.status(HttpStatus.SC_NO_CONTENT).build(); 
				}
				return ResponseEntity.status(HttpStatus.SC_ACCEPTED).body(a);
			}
			
			
			
			@PutMapping
			public ResponseEntity<Lease> updateLease(@RequestBody int id) {
				Lease lease = lServices.updateLease(id);
				if(lease==null) {
					return ResponseEntity.status(HttpStatus.SC_NO_CONTENT).build(); 
				}
				return ResponseEntity.status(HttpStatus.SC_ACCEPTED).body(lease);
			}
			
			
			@PostMapping
			public ResponseEntity<Lease> addLease(@RequestBody Lease l) {
				Lease temp = lServices.addLease(l);
				if (temp == null) {
					return ResponseEntity.status(HttpStatus.SC_NO_CONTENT).build(); //sends back an empty body in the response. 
				}
				return ResponseEntity.status(HttpStatus.SC_ACCEPTED).body(l);
			}
				

}
