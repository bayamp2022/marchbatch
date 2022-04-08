package com.bayamp.team.userdefined.types;

public class Employee extends Person implements EmployeeInterface,GenericInterface{
	
	private double salary;
	
	//every employee has a manager
	//Employee manager;
	

	public Employee(String firstName, String lastName, char middleInitial, int id, Address address,double empSalary) {
		super(firstName, lastName, middleInitial, id, address);
		System.out.println("Employe(Child) Constructor");
		this.salary = empSalary;
	
	}

	public void print() {
		// TODO Auto-generated method stub
		
	}

	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
