package com.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.Owner;
import com.app.entities.Buyer;

@Transactional
@Repository
public interface BuyerDao extends JpaRepository<Buyer, Integer> {
	
	@Query("SELECT t FROM Buyer t WHERE t.login_id.id = :id")
    public Buyer findBuyerByLogin(int id);
	
	@Modifying
	@Query("delete from Buyer t where t.login_id.id = :id")
	public void deleteBuyerByLoginId(int id);
	
	@Query("SELECT t FROM Buyer t WHERE t.id = :id")
    public Buyer getBuyerById(int id);

}
