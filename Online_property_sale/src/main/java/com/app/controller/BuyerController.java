package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Area;
import com.app.entities.City;
import com.app.entities.Login;
import com.app.entities.Owner;
import com.app.entities.Role;
import com.app.entities.Buyer;
import com.app.entities.BuyerReg;
import com.app.service.AreaService;
import com.app.service.CityService;
import com.app.service.LoginService;
import com.app.service.RoleService;
import com.app.service.BuyerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class BuyerController 
{
	
	@Autowired
	BuyerService tservice;
	@Autowired
	LoginService lservice;
	@Autowired
	RoleService rservice;
	@Autowired
	CityService cservice;
	@Autowired
	AreaService aservice;
	
	@PostMapping("/regbuyer")
	public Buyer regBuyer(@RequestBody BuyerReg tr)
	{
		Role r =rservice.getRole(3);
		Login l=new Login(tr.getEmail(), tr.getPassword(), r, true);
		Login saved1=lservice.save(l);
		
		/*City c=new City(tr.getCity());
		City saved3=cservice.save(c);
		
		Area a=new Area(tr.getArea(), tr.getPincode(), saved3);
		Area saved4=aservice.save(a);*/
		
		Area area = aservice.getById(tr.getAreaid());
		
		Buyer t=new Buyer(tr.getFname(), tr.getLname(), 0, tr.getContact_no(),tr.getAddress(), area, l);
		Buyer saved2=tservice.save(t);
		return saved2;
	}
	
	@GetMapping("/getbuyerbyloginid/{id}")
	 public Buyer getBuyerByLogin(@PathVariable("id") int id) 
	 {
		 return tservice.findBuyerByLogin(id);
	 }
	
	@GetMapping("/getallbuyers")
	public List<Buyer> getAllTenants()
	{
		return tservice.getAll();
	}
	
	 @DeleteMapping("deletebuyer/{buyer_id}")
	 public ResponseEntity<Void> deleteBuyerById(@PathVariable int buyer_id) 
	 {
	     tservice.deleteBuyerById(buyer_id);
	     return ResponseEntity.noContent().build();
	 }
	 
	 
	 @DeleteMapping("deletebuyerbyloginid/{lid}")
	 public void deleteBuyerByLoginId(@PathVariable("lid") int id)
	 {
		  tservice.deleteBuyerByLoginId(id);
	 }
	 
	 @GetMapping("getbuyerbyid/{id}")
	 public Buyer getBuyerbyId(@PathVariable("id") int id)
	 {
		 return tservice.getBuyerByid(id);
	 }

}
