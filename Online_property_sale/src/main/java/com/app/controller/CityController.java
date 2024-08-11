package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.City;
import com.app.service.CityService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class CityController {
	@Autowired
	CityService rservice;
	
	@GetMapping("/getallcity")
	public List<City> getAll()
	{
		return rservice.getAll();
	}
}
