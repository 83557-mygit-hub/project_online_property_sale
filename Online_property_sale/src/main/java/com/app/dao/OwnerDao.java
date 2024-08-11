package com.app.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entities.Login;
import com.app.entities.Owner;

@Transactional
@Repository
public interface OwnerDao extends JpaRepository<Owner, Integer> 
{
	
	@Query("SELECT o.contact_no FROM Owner o WHERE o.id = :ownerId")
    String findContactNoByOwnerId(@Param("ownerId") int ownerId);
	
	@Query("SELECT o FROM Owner o WHERE o.login_id.id = :id")
    public Owner findByLogin(int id);
	
	@Modifying
	@Query("delete from Owner o where o.login_id.id = :id")
	public void deleteOwnerByLoginId(int id);
	
	@Query("SELECT o FROM Owner o WHERE o.id = :id")
    public Owner getOwnerById(int id);
	
	
}
