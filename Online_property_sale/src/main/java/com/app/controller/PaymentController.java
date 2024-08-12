package com.app.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Area;
import com.app.entities.Login;
import com.app.entities.Owner;
import com.app.entities.Payment;
import com.app.entities.PaymentReg;
import com.app.entities.Role;
import com.app.entities.Subscription;
import com.app.entities.Buyer;
import com.app.entities.BuyerReg;
import com.app.service.LoginService;
import com.app.service.OwnerService;
import com.app.service.PaymentService;
import com.app.service.SubscriptionService;
import com.app.service.BuyerService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class PaymentController {
	
	@Autowired
	PaymentService pservice;
	@Autowired
	LoginService lservice;
	@Autowired
	SubscriptionService sservice;
	@Autowired
	OwnerService oservice;
	@Autowired
	BuyerService tservice;
	
	 @GetMapping("/updateloginstatus")
	 public ResponseEntity<String> updateLoginStatusBasedOnPayments() 
	 {
	     pservice.updateLoginStatusBasedOnPayments();
	     return ResponseEntity.ok("Login statuses updated based on payment subscription.");
	 }
	 
	    @PostMapping("/regpayment")
		public Payment regPayment(@RequestBody PaymentReg pr)
		{
			
			Login l=lservice.getLoginByEmail(pr.getEmail());
			Subscription subscription=sservice.getSub(pr.getSubscription_id());
			l.setStatus(true);
			
			LocalDate curdate=LocalDate.now();
			String dateString=curdate.toString();
			Payment payment=new Payment(dateString, pr.getAmount(), null, l, subscription);
			Payment saved=pservice.save(payment);
		//	Owner owner=oservice.getById(0) payment.getId();
			if(l.getRole_id().getId()==2)
			{
				Owner owner=oservice.findOwnerByLogin(l.getId());
				owner.setPayment_id(saved);
				owner.setAdd_property_request_rem(pr.getNo_of_properties());
				oservice.save(owner);
			}
			else if(l.getRole_id().getId()==3)
			{
				Buyer tenant=tservice.findBuyerByLogin(l.getId());
				tenant.setPayment_id(saved);
				tenant.setNo_of_req_rem(pr.getNo_of_requests());
				tservice.save(tenant);
			}
			
			return saved;
		}
	    
	    @GetMapping("/getalltransaction")
		public List<Payment> getAll()
		{
			return pservice.getAll();
		}
	

}
