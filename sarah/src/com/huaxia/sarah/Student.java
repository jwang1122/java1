package com.huaxia.sarah;

public class Student extends Person {
	private String studentID;
	private int grade;

	@Override
	public String getOccupation() {
		return "Student";
	}

	public void turnInHomeworks() {
		System.out.println(firstName + " is turning in my homework...");
	}
	
	public void doHomeworks() {
		System.out.println(firstName + " is doing my homework...");
	}
	
	public String getStudentID() {
		return studentID;
	}



	public void setStudentID(String studentID) {
		// check for user authorization first before make change
		this.studentID = studentID;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setFirstName("John");
		s1.setLastName("Wang");
		s1.setSsn("111-22-3333");
		s1.turnInHomeworks();
		System.out.println(s1);
		
		Student s2 = new Student();
		s2.setFirstName("Connor");
		s2.setLastName("Tan");
		s2.setSsn("222-22-2222");
		s2.doHomeworks();
		System.out.println(s2);

	}

}
