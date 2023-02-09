package com.springcore.ci;

public class Address {
	String street;
	String colony;
	String city;
	
	public Address(String street, String colony, String city) {
		super();
		this.street = street;
		this.colony = colony;
		this.city = city;
	}

	@Override
	public String toString() {
		return this.street + " "+this.colony+" " +this.city+" ";
	}
	
	
	

}
