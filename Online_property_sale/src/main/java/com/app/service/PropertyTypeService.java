package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Area;
import com.app.entities.Property;
import com.app.entities.PropertyType;
import com.app.dao.PropertyTypeDao;

@Service
public class PropertyTypeService {
	
	@Autowired
	PropertyTypeDao ptrepo;
	
	public PropertyType save(PropertyType l)
	{
		return ptrepo.save(l);
	}
	
	public PropertyType getById(int id)
	{
		return ptrepo.findById(id).get();
	}
	
	public List<PropertyType> getAll()
	{
		return ptrepo.findAll();
	}
	
	/*public List<PropertyType> getareabycity(int id)
	{
		return arepo.getareabyid(id);
	}*/

}
