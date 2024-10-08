package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.Payment;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Integer> 
{
	@Query("select p from Payment p where p.subscription_id.id is not null")
	List<Payment> findBySubscription_idIsNotNull();
	

}
