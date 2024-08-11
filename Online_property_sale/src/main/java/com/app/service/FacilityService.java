package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.City;
import com.app.entities.Facility;
import com.app.dao.FacilityDao;

@Service
public class FacilityService 
{
	@Autowired
	FacilityDao frepo;
	
	public Facility save(Facility f)
	{
		return frepo.save(f);
	}
	public List<Facility> getAll()
	{
		return frepo.findAll();
	}
	public Facility getById(int id)
	{
		return frepo.findById(id).get();
	}
	
	public List<Facility> getFacilitiesByPropertyId(int propertyId) {
        return frepo.findFacilitiesByPropertyId(propertyId);
    }
	
	
}
