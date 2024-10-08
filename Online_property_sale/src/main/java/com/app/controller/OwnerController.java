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
import com.app.entities.Login;
import com.app.entities.Owner;
import com.app.entities.OwnerReg;
import com.app.entities.Role;
import com.app.entities.Buyer;
import com.app.service.AreaService;
import com.app.service.CityService;
import com.app.service.LoginService;
import com.app.service.OwnerService;
import com.app.service.RoleService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class OwnerController {
	
	@Autowired
	OwnerService oservice;
	@Autowired
	LoginService lservice;
	@Autowired
	RoleService rservice;
	@Autowired
	CityService cservice;
	@Autowired
	AreaService aservice;
	
	@PostMapping("/regowner")
	public Owner regOwner(@RequestBody OwnerReg or)
	{
		Role r =rservice.getRole(2);
		Login l=new Login(or.getEmail(), or.getPassword(), r, true);
		Login saved1=lservice.save(l);
		
		Area area = aservice.getById(or.getAreaid());
		
		Owner o=new Owner(or.getFname(), or.getLname(), 0, or.getContact_no(),or.getAddress(), area, l);
		Owner saved2=oservice.save(o);
		return saved2;
	}
	
	 @GetMapping("/contactNo/{ownerId}")
	 public ResponseEntity<String> getContactNoByOwnerId(@PathVariable int ownerId) 
	 {
	    String contactNo = oservice.getContactNoByOwnerId(ownerId);
	    return ResponseEntity.ok(contactNo);
	 }
	 
	 @GetMapping("/getownerbyloginid/{id}")
	 public Owner getOwnerByLogin(@PathVariable("id") int id) 
	 {
		 return oservice.findOwnerByLogin(id);
	 }
	 
	 @GetMapping("/getallowners")
	 public List<Owner> getAllOwners()
	{
		return oservice.getAll();
	}
	 
	 @DeleteMapping("deleteowner/{owner_id}")
	 public ResponseEntity<Void> deleteOwnerById(@PathVariable int owner_id) 
	 {
	     oservice.deleteOwnerById(owner_id);
	     return ResponseEntity.noContent().build();
	 }
	 
	 @DeleteMapping("deleteownerbyloginid/{lid}")
	 public void deleteOwnerByLoginId(@PathVariable("lid") int id)
	 {
		  oservice.deleteOwnerByLoginId(id);
	 }
	 @GetMapping("getownerbyid/{id}")
	 public Owner getOwnerById(@PathVariable("id") int id)
	 {
		 return oservice.getOwnerByid(id);
	 }

}
