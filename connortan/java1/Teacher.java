package com.huaxia.java1;

public class Teacher extends Person{
	private String employeeID;
	

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
		return "Teacher [employeeID=" + employeeID + "]";
	} 	
	
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.setEmployeeID("T11-22-333");
		System.out.println(t1);
	
	}
	
	@Override
	protected String getOccupation() {
		return "Teacher";
}
}
