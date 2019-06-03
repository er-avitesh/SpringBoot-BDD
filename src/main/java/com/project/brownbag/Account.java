package com.project.brownbag;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {

	@Id
	private int CustomerID;
	private String name;
	private String city;

	public Account(int customerID, String name, String city) {
		super();
		CustomerID = customerID;
		this.name = name;
		this.city = city;
	}

	public Account() {
		super();
	}

	public int getCustomerID() {
		return CustomerID;
	}

	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
