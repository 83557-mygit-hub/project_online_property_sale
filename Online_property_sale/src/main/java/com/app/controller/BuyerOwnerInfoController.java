package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Property;
import com.app.entities.RequestInfo;
import com.app.entities.BuyerOwnerInfo;
import com.app.service.BuyerOwnerInfoService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BuyerOwnerInfoController {
	
	@Autowired
	BuyerOwnerInfoService toiservice;
	
//	@PostMapping("/save")
//	public TenantOwnerInfo saveTenantOwnerInfo(@RequestBody TenantOwnerInfo f)
//	{
//		return toiservice.save(f);
//	}
	
	@PostMapping("/saverequest")
	public BuyerOwnerInfo saveInfo(@RequestBody RequestInfo rf)
	{
		BuyerOwnerInfo t=new BuyerOwnerInfo(rf.getOwner_id(), rf.getBuyer_id(), rf.getProperty_id(),rf.getFname(),rf.getLname(),rf.getEmail(),rf.getContact_no());
		BuyerOwnerInfo saved=toiservice.save(t);
		return saved;
	}
	
	@GetMapping("/getbuyerid/{id}")
	public BuyerOwnerInfo getBuyerId(@PathVariable("id") int id)
	{
		return toiservice.getBuyerId(id);
	}
	@GetMapping("getallrequests")
	public List<BuyerOwnerInfo> getAllReq()
	{
		return toiservice.getAllReq();
	}

}
