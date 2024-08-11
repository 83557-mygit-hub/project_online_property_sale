package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entities.BuyerOwnerInfo;

@Repository
public interface BuyerOwnerInfoDao extends JpaRepository<BuyerOwnerInfo, Integer> {
	
	@Query("select t.buyer_id from BuyerOwnerInfo t where t.owner_id=:id")
	public BuyerOwnerInfo getBuyerId(int id);

}
