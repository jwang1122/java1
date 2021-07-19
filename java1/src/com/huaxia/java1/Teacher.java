package com.huaxia.java1;

public class Teacher extends Person { // teacher is a person
	private String employeeID;
	
	public Teacher(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public  String getOccupation() {
		return "Teacher";
	}

	public void grade() {
		System.out.println("I am doing the grade...");
	}
	
	public String getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(String employeeID) {
		this.employeeID = employeeID;
	}

	@Override
	public String toString() {
		return "Teacher [" + lastName + ", " + firstName + "]";
	}

	public static void main(String[] args) {
		Teacher t1 = new Teacher("John", "Wang");
		t1.setEmployeeID("T11-22-333");
		System.out.println(t1);
	}

	@Override
	public double add(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}

}
