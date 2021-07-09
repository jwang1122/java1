package com.huaxia.hongkai;

public class Person {
	protected String firstName;
	private String lastName;
	private String ssn;
	private int age;
	private int gender; //1: male, 2:famale, 0: other
	
	public String getOccupation() {
		return "None";
	}
	
	public String getFirstName() { // a getter
		return firstName;
	}
	
	public void setFirstName(String firstName) { // a setter
		this.firstName = firstName;
	}

	protected String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		this.lastName = lastName;
	}

	protected String getSsn() {
		return ssn;
	}

	protected void setSsn(String ssn) {
		this.ssn = ssn;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getGender() {
		return gender;
	}

	protected void setGender(int gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", ssn=" + ssn + "]";
	}
	
	
}
