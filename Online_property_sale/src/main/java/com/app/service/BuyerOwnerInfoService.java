package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Login;
import com.app.entities.BuyerOwnerInfo;
import com.app.dao.BuyerOwnerInfoDao;

@Service
public class BuyerOwnerInfoService {
	
	@Autowired
	BuyerOwnerInfoDao toirepo;
	
	public BuyerOwnerInfo save(BuyerOwnerInfo l)
	{
		return toirepo.save(l);
	}
	
	public BuyerOwnerInfo getBuyerId(int id)
	{
	   return toirepo.getBuyerId(id);
	}
	public List<BuyerOwnerInfo> getAllReq() {
		return toirepo.findAll();
	}

}
