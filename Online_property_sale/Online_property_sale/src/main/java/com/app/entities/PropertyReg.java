package com.app.entities;


import java.util.Set;



public class PropertyReg 
{
	int area_id,property_type_id,owner_id;
	String property_name,pdesc;
	float price,deposit;
	Set<Integer> facilities;
	public int getArea_id() {
		return area_id;
	}
	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}
	public int getProperty_type_id() {
		return property_type_id;
	}
	public void setProperty_type_id(int property_type_id) {
		this.property_type_id = property_type_id;
	}
	public String getProperty_name() {
		return property_name;
	}
	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}
	public String getPdesc() {
		return pdesc;
	}
	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public Set<Integer> getFacilities() {
		return facilities;
	}
	public void setFacilities(Set<Integer> facilities) {
		this.facilities = facilities;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	
	
	
	
}

