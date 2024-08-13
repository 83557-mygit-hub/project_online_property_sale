package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.Subscription;

@Repository
public interface SubscriptionDao extends JpaRepository<Subscription, Integer> {
	
	@Query("select s from Subscription s where s.id=:id")
	public Subscription getSubById(int id) ;

}
