package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Property;
import com.app.entities.PropertyType;
import com.app.service.PropertyTypeService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PropertyTypeController {
	
	@Autowired
	PropertyTypeService ptservice;
	
	@GetMapping("/getallpropertytype")
	public List<PropertyType> getAll()
	{
		return ptservice.getAll();
	}
	

}
