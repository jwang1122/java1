package com.huaxia.emma.homeworks;

public class Variable02 {

	public static void main(String[] args) {

		double appleUnitPrice = 0.50;
		double breadUnitPrice = 2.50;
		double orangeUnitPrice = 5.00;
		int appleAmount = 15;
		int breadAmount = 100;
		int orangeAmount = 11;
		double bunchofApples = appleUnitPrice * appleAmount;
		double loavesOfBread = breadUnitPrice * breadAmount;
		double bunchOfOranges = orangeUnitPrice * orangeAmount;
		double totalCost = bunchofApples + loavesOfBread + bunchOfOranges;
		System.out.println("The total cost of 5 apples, 10 loaves of bread, and 11 oranges is $" + totalCost + "0.");
		String output = String.format("The total cost of %d apples, %d loaves of bread and %d oranges, is $%.2f.",
				appleAmount, breadAmount, orangeAmount, totalCost);
		System.out.println(output);

		double a, b;
		a = 0.50;
		b = 5 * a;
		System.out.println(b);

		double c, d;
		c = 2.5;
		d = 10 * c;
		System.out.println(d);

		// no specification on how many oranges in each bag so i calculated the priced
		// of 11 oranges

// Variable 01 is below 

		int xx = 11;
		int yy = 5;
		System.out.printf("11 oranges is %d*%d=%d dollars", 11, 5, (xx * yy));

		// This application shows the amount left in the bank account after withdrawls
		// int bankAmount2=100;

	}

}
