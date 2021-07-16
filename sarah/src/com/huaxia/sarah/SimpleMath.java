package com.huaxia.sarah;

import java.util.Random;

import java.util.Scanner;

import javax.sound.midi.InvalidMidiDataException;

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
	
	// none static method
	boolean isPrime(int n) {
		boolean result = true;
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				result = false;
				break;
			}
		}
		return n != 1 && result;
	}
	
	double circleArea(double r) throws InvalidMidiDataException{ // rethrow the Exception
//		String s = null;
//		s.substring(1,4);
		if(r<0) {
			throw new InvalidMidiDataException("Radius of circle cannot be negative.");
		}
		return Math.PI * r * r;
	}
	public static void main(String[] args) {
		// the main method provides place for you to test your code above
//		doMath();
//		generateRandomNumber4Dice();
//		throw2Dice();
		SimpleMath obj = new SimpleMath();
//		int n = 6;
//		boolean x = obj.isPrime(n);
//		System.out.printf("Is %d a prime number? %b\n", n, x);
		double r = -2;
		try {
			double area = obj.circleArea(r); // good code
			System.out.println(area); // other code
		}catch(java.lang.Exception ex) { // Exception class defined in same package will have first priority
			System.out.println(ex);
		}
//		}catch(InvalidMidiDataException ex) { // catch-block
//			System.out.println(ex);
//		}catch(NullPointerException np) {
//			System.out.println(np);
//		}
		System.out.println("END");
	}


}
