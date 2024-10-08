package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entities.PropertyType;

@Repository
public interface PropertyTypeDao extends JpaRepository<PropertyType, Integer> {

}
