package com.huaxia.sarah;

import java.util.Random;

import java.util.Scanner;

public class SimpleMath {

	public static double add(double x, double y) {
		return x + y;
	}
	
	static void doMath() {
		double x = SimpleMath.add(3, 4);
		System.out.println(x);
	}
	
	static void generateRandomNumber4Dice() {
		Random rand = new Random();
		for (int j = 0; j < 20; j++) {
			int i = rand.nextInt(6) + 1; // build dice, [0, 6]==> [1, 6]
			System.out.print(i + ", ");		
		}	
	}
	
	static void throw2Dice() { // build real game, get name from players, take turn until user ternimates game
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		System.out.println("John's turn: ");
		input.nextLine();
		int dice1 = rand.nextInt(6)+1;
		int dice2 = rand.nextInt(6)+1;
		System.out.println(dice1 + ", " + dice2 + "=" + (dice1 + dice2));
		
		System.out.println("Connor's turn: ");
		input.nextLine();
		int dice3 = rand.nextInt(6)+1;
		int dice4 = rand.nextInt(6)+1;
		System.out.println(dice1 + ", " + dice2 + "=" + (dice1 + dice2));
		
		int john = dice1 + dice2;
		int connor = dice3 + dice4;
		if(john > connor) {
			System.out.println("John win.");
		}
		else if (john < connor) {
			System.out.println("Connor win.");
		}
			input.close();
			System.out.println("Game tied up");
		
	}
	
	public static void main(String[] args) {
		// the main method provides place for you to test your code above
//		doMath();
//		generateRandomNumber4Dice();
		throw2Dice();
			
		}


}
