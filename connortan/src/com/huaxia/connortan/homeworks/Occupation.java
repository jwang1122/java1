package com.huaxia.connortan.homeworks;

// interface only provide abstract methods
public interface Occupation {
	double PI = 3.1415926535;
	String[] avaiblableOccupation = {"Student", "Teacher","Engineer","Software Developer", "Doctor"};
	
	public String getOccupation();
		// public double add(double x, double y); // Interface can include more than one method
}
