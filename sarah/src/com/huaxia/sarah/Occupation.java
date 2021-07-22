package com.huaxia.sarah;

// interface only provide abstract method.
public interface Occupation {
	double PI = 3.1415926;
	String[] availableOccupation = {"Student", "Teacher", "Engineer", "Software Developer", "Doctor"};
	
	public String getOccupation(); 
//	public double add(double x, double y); // Interface can include more than one method
}
