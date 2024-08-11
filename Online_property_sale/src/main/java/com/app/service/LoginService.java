package com.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Login;
import com.app.entities.Role;
import com.app.dao.LoginDao;

@Service
public class LoginService {
	@Autowired
	LoginDao lrepo;
	
	public Login getLogin(String email,String password)
	{
		Login l;
		Optional<Login> ol=lrepo.getLogin(email, password);
		try 
		{
			l=ol.get();
		}
		catch(Exception e)
		{
			l=null;
		}
		return l;
	}
	
	public Login save(Login l)
	{
		return lrepo.save(l);
	}
	
	
	public Login getLogin(int id)
	{
		return lrepo.findById(id).get();
	}
	
	public Login getLoginByEmail(String id)
	{
		return lrepo.findByEmail(id);
	}

}
