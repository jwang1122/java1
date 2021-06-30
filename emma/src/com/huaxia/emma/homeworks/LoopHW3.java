package com.huaxia.emma.homeworks;

public class LoopHW3 {

	public static void main(String[] args) {
		int i, fact = 1;
		int number = 6;// It is the number to calculate factorial
		for (i = 1; i <= 6; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
		System.out.printf("Factorial of %d is: %d\n ", number, fact);
		String format= "Factorial of %d is: %d\n";
		System.out.printf(format,  number, fact); //this line of code is very stable 
	}

}