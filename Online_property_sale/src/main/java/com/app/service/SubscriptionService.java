package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Login;
import com.app.entities.Role;
import com.app.entities.Subscription;
import com.app.dao.SubscriptionDao;

@Service
public class SubscriptionService {
	
	@Autowired
	SubscriptionDao srepo;
	
	
	public Subscription save(Subscription s)
	{
		return srepo.save(s);
	}
	
	
	public Subscription getSub(int id)
	{
		return srepo.findById(id).get();
	}

	public List<Subscription> getAll()
	{
		return srepo.findAll();
	}
	
	public Subscription getSubById(int id) {
		return srepo.getSubById(id);
	}
	

}
