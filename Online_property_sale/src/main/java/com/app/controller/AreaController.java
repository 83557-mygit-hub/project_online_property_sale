package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Area;
import com.app.entities.City;
import com.app.service.AreaService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AreaController {
	@Autowired
	AreaService aService;
	@GetMapping("/getallarea")
	public List<Area> getAll()
	{
		return aService.getAll();
	}
	
	@GetMapping("/getareabycity")
	public List<Area> getareabycity(@RequestParam("city_id") int id)
	{
		return aService.getareabycity(id);
	}
}
