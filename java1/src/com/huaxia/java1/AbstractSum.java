package com.huaxia.java1;

public abstract class AbstractSum {
	double result; // by defualt, result==0
	
	// define abstract methods, leave them for subclass to implement
	protected abstract int sumOfTwo(int x, int y);
	protected abstract int sumOfThree(int x, int y, int z);

	// method overloading
	public double sumOfTwo(double x, double y) {
		result = x + y;
		return result;
	}
	
	// display() method is a concrete method for all subclass
	public void display() {
		System.out.printf("The result of calculation is %.3f\n", result); // %.3f is placeholder for double with only 3 decimal digits.
	}
}
