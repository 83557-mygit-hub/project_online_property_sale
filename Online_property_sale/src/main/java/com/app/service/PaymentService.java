package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.LoginDao;
import com.app.dao.PaymentDao;
import com.app.entities.*;

@Service
public class PaymentService {
	
	@Autowired
	PaymentDao prepo;
	
	@Autowired
	LoginDao lrepo;
	
	public void updateLoginStatusBasedOnPayments() {
        List<Payment> paymentsWithSubscription = prepo.findBySubscription_idIsNotNull();

        for (Payment payment : paymentsWithSubscription) {
            Login login = payment.getLogin_id();
            login.setStatus(true);  // Set the status to true
            lrepo.save(login);
        }
    }
	
	public Payment save(Payment l)
	{
		return prepo.save(l);
	}
	
	public List<Payment> getAll()
	{
		return prepo.findAll();
	}
	

}
