package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Role;
import com.app.service.RoleService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class RoleController {
	@Autowired
	RoleService rservice;
	
	@GetMapping("/getallroles")
	public List<Role> getAll()
	{
		return rservice.getAll();
	}

}
