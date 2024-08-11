package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Area;
import com.app.entities.Login;
import com.app.entities.Owner;
import com.app.entities.Buyer;
import com.app.dao.OwnerDao;


@Service
public class OwnerService 
{
	@Autowired
	OwnerDao orepo;
	
	public Owner save(Owner l)
	{
		return orepo.save(l);
	}
	
	public Owner getById(int id)
	{
		return orepo.findById(id).get();
	}
	
	public String getContactNoByOwnerId(int ownerId) {
        return orepo.findContactNoByOwnerId(ownerId);
    }
	
	public Owner findOwnerByLogin(int id) 
	{
        return orepo.findByLogin(id);
    }
	
	public List<Owner> getAll()
	{
		return orepo.findAll();
	}
	
	public void deleteOwnerById(int id) 
	 {
	        orepo.deleteById(id);
	 }
	
	public void deleteOwnerByLoginId(int id) 
	{
	     orepo.deleteOwnerByLoginId(id);
	}
	public Owner getOwnerByid(int id)
	{
		return orepo.getOwnerById(id);
	}
}
