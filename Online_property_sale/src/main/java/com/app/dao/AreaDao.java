package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.Area;
import com.app.entities.City;

@Repository
public interface AreaDao extends JpaRepository<Area, Integer> {

	@Query("select a from Area a where a.city_id.id = :id ")
	public List<Area> getareabyid(int id);
}
