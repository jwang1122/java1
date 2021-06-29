package com.huaxia.laura.homeworks;

// variable 02 hw

public class ShoppingList {

	public static void main(String[] args) 
	{
		double apple = 0.50;
		double bread = 2.50;
		double orange = 5.00;
		double bunchOfApples = apple * 5;
		double loavesOfBread = bread * 10;
		double bunchOfOranges = orange * 11;
		double totalCost = bunchOfApples + loavesOfBread + bunchOfOranges;
		System.out.println("The total cost of 5 apples, 10 loaves of bread, and 11 oranges, is $" + totalCost + "0.");
	}

}
