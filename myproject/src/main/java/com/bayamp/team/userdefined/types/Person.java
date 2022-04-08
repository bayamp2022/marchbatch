package com.bayamp.team.userdefined.types;

public abstract class  Person {

	protected String firstName;
	protected String lastName;
	protected char middleInitial;
	protected int id;
	protected Address address;

	private Person() {

	}

	public Person(String firstName, String lastName, char middleInitial, int id, Address address2) {
		// super(); //it is calling parent Constructor (in this case default(constructor
		// with no arguements)) from Object class
		System.out.println("Person (Parent) constructor");
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleInitial = middleInitial;
		this.id = id;
		this.address = address2;
	}

	private Book getMyClass() {

		Book b1 = new Book("", "", "", 11, "");

		int x = 10;
		String s1 = new String("");
		return b1;
	}

	@Override
	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", middleInitial=" + middleInitial
				+ ", id=" + id + ", address=" + address;
	}
	
	//abstract public String getFirstName();

	public String getFirstName() {
		
		return this.firstName;
	}
	
	
}
