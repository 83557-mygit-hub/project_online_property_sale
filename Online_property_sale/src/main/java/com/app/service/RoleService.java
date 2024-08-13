package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.app.entities.Role;
import com.app.dao.RoleDao;

@Service
public class RoleService {
	@Autowired
	RoleDao rrepo;
	
	public List<Role> getAll()
	{
		return rrepo.findAll();
	}
	
	public Role getRole(int id)
	{
		return rrepo.findById(id).get();
	}

}
