package com.huaxia.connortan.homeworks;

public class ShoppingList {

	public static void main(String[] args) 
	{
		double appleUnitPrice = 0.50;
		double breadUnitPrice = 2.50;
		double orangeUnitPrice = 5.00;
		int appleAmount = 15;
		int breadAmount = 100;
		int orangeAmount = 11;
		double bunchOfApples = appleUnitPrice * appleAmount;
		double loavesOfBread = breadUnitPrice * breadAmount;
		double bunchOfOranges = orangeUnitPrice * orangeAmount;
		double totalCost = bunchOfApples + loavesOfBread + bunchOfOranges;
		System.out.println("The total cost of 5 apples, 10 loaves of bread, and 11 oranges, is $" + totalCost + "0.");
		String output = String.format("The total cost of %d apples, %d loaves of bread, and %d oranges, is $%.2f.", appleAmount,breadAmount,orangeAmount,totalCost);
		System.out.println(output);
	}

}