package com.huaxia.laura.homeworks;
/**
 * 
 * @author John
 *
 */
public class BankAccount {

	public static void main(String[] args) 
	{
		int bankAmount = 100;
		int withdrawOne = 25;
		int withdrawTwo = 30;
		int withdrawThree = 115;
//		int withdraw = withdrawOne + withdrawTwo + withdrawThree;
//		bankAmount = bankAmount - withdraw;
		if (bankAmount>= withdrawOne) {
			bankAmount -= withdrawOne;
		}else {
			System.out.println("Sorry, you don't have enough balance.");
			System.out.println("The remaining amount of money left over after three withdraws is $" + bankAmount + ".");
			System.exit(0);
		}
		if (bankAmount>= withdrawTwo) {
			bankAmount -= withdrawTwo;
		}else {
			System.out.println("Sorry, you don't have enough balance.");
			System.out.println("The remaining amount of money left over after three withdraws is $" + bankAmount + ".");
			System.exit(0);
		}
		if (bankAmount>= withdrawThree) {
			bankAmount -= withdrawThree;
		}else {
			System.out.println("Sorry, you don't have enough balance.");
			System.out.println("The remaining amount of money left over after three withdraws is $" + bankAmount + ".");
			System.exit(0);
		}
		
	}

}
// This adds up all of the withdraws into withdraw and subtracts it from bankAmount. It then prints the amount left over.