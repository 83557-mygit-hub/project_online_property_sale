package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Login;
import com.app.entities.LoginCheck;
import com.app.service.LoginService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class LoginController 
{
	@Autowired
	LoginService lservice; 
	
	@PostMapping("checklogin")
	  public Login checkLogin(@RequestBody LoginCheck lcheck) {
	    return lservice.getLogin(lcheck.getEmail(), lcheck.getPassword());
	  }
	
}
