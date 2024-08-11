package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Area;
import com.app.entities.Owner;
import com.app.entities.Buyer;
import com.app.dao.BuyerDao;

@Service
public class BuyerService {
	
	@Autowired
	BuyerDao trepo;
	
	public Buyer save(Buyer l)
	{
		return trepo.save(l);
	}
	
	public Buyer findBuyerByLogin(int id) {
        return trepo.findBuyerByLogin(id);
    }
	
	public List<Buyer> getAll()
	{
		return trepo.findAll();
	}
	
	public void deleteBuyerById(int id) 
	 {
	     trepo.deleteById(id);
	 }
	
	public void deleteBuyerByLoginId(int id) 
	{
	     trepo.deleteBuyerByLoginId(id);
	}
	
	public Buyer getBuyerByid(int id)
	{
		return trepo.getBuyerById(id);
	}

}
