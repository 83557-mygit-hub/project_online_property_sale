package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Area;
import com.app.entities.Role;
import com.app.dao.AreaDao;

@Service
public class AreaService {
	
	@Autowired
	AreaDao arepo;
	
	public Area save(Area l)
	{
		return arepo.save(l);
	}
	
	public Area getById(int id)
	{
		return arepo.findById(id).get();
	}
	
	public List<Area> getAll()
	{
		return arepo.findAll();
	}
	
	public List<Area> getareabycity(int id)
	{
		return arepo.getareabyid(id);
	}

}
