package com.ci.dependent_obj;

public class Address {
	private String street;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
	}
		
	public String getStreet() {
		return street;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void display_add() {
	System.out.println("street"+street+"city"+city+"state"+state+"country"+country);
		
	}
	}
