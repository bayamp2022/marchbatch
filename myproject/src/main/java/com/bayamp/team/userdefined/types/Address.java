package com.bayamp.team.userdefined.types;

public class Address {
	
//Every address has 
	//2086 Walsh Ave #C1, Santa Clara CA 95050

	private String buildingNumber;
	private String streetName;
	private String unitNumber;
	private String city;
	private String state;
	private String zip;

	//constrcutror 
	//getters 
	
	public Address(String buildingNumber, String streetName, String unitNumber, String city, String state, String zip) {
		
		this.buildingNumber = buildingNumber;
		this.streetName = streetName;
		this.unitNumber = unitNumber;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	

	public static void main(String[] args) {
		
		Address a1 = new Address("2086","Walsh Ave","#c1","Santa Clara","CA","95050");
		
		
	}
	

}
