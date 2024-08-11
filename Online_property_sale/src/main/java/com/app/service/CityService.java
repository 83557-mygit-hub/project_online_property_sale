package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.City;
import com.app.entities.Role;
import com.app.dao.CityDao;

@Service
public class CityService 
{
	
	@Autowired
	CityDao crepo;
	
	public City save(City l)
	{
		return crepo.save(l);
	}
	
	public City getRole(int id)
	{
		return crepo.findById(id).get();
	}
	
	public List<City> getAll()
	{
		return crepo.findAll();
	}
	
	

}
