package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.app.entities.Subscription;

import com.app.service.SubscriptionService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SubscriptionController {
	
	@Autowired
	SubscriptionService sservice;
	
	@GetMapping("/getallsubscriptions")
	public List<Subscription> getAll()
	{
		return sservice.getAll();
	}
	
	@GetMapping("/getsubbyid/{id}")
	public Subscription getAll(@PathVariable("id")int id)
	{
		return sservice.getSubById(id);
	}

}
