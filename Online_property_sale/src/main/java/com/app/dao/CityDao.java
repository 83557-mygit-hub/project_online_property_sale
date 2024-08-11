package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.City;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {
	
	@Query("select c from City c where c.id=:id ")
	public List<City> getcitybyid(int id);
	
	

}
