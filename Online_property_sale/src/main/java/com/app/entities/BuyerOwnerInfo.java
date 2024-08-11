package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "buyerownerinfo")
public class BuyerOwnerInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	int owner_id;
	@Column
	int buyer_id;
	@Column
	int property_id;
	
	@Column
	String fname;
	@Column
	String lname;
	@Column
	String email;
	@Column
	String contact_no;
	public BuyerOwnerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BuyerOwnerInfo(int owner_id, int buyer_id, int property_id) {
		super();
		this.owner_id = owner_id;
		this.buyer_id = buyer_id;
		this.property_id = property_id;
	}
	
	public BuyerOwnerInfo(int owner_id, int buyer_id, int property_id, String fname, String lname, String email,
			String contact_no) {
		super();
		this.owner_id = owner_id;
		this.buyer_id = buyer_id;
		this.property_id = property_id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.contact_no = contact_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	public int getBuyer_id() {
		return buyer_id;
	}
	public void setBuyer_id(int buyer_id) {
		this.buyer_id = buyer_id;
	}
	public int getProperty_id() {
		return property_id;
	}
	public void setProperty_id(int property_id) {
		this.property_id = property_id;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}

}

