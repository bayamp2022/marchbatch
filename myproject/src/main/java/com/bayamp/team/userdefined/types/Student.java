package com.bayamp.team.userdefined.types;

public class Student extends Person implements StudentInterface,GenericInterface {

	// Data Members (attributes of every student)

	private double gpa;

	// every student "has a" list (array( of books

	private String[] studentBooks = new String[100];

	public Student(String firstName, String lastName, char middleInitial, int id, Address address, double studGpa) {
		super(firstName, lastName, middleInitial, id, address);
		System.out.println("Student(Child) Constructor");
		this.gpa = studGpa;

	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public double getGPA() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
