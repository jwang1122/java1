package com.huaxia.sarah;

import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		// for loop syntax
		for (int i = 2; i<=10; i+=2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		// for loop with negative step
		int i = 10;
		for (; i>0; i--) { //initialize looping variable; condition on looping variable; command 
			System.out.print(i + ", ");
//			if (i==10) break;
		}
		System.out.println("\nAfter the for loop, i = "+i);
		
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for(String car: cars) { // for each loop
			System.out.println(car);
		}
		
		//while loop
		i = 1;
		while(i<=10) {
			System.out.print(i++ + ", ");
		}
		System.out.println();
		
		Scanner input = new Scanner(System.in); // new Scanner() create a new instance of Scanner class as a factor
		i = 0;
		while(true) { // infinite loop
			System.out.print(++i + ": Do you want to continue? (y/n) ");
			String answer = input.nextLine();
			if(answer.equals("n")) {
				break;
			}
		}
		input.close();
		System.out.println("Bye...");
		
		// while loop with continue
		i = 0;
		int sum = 0;
		while(i < 10) {
			if(i >= 4 && i<7) {
//				i++;
				sum += i;
//				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println(sum);
		
		// do-while loop
		i = 0;
		do {
			System.out.println("do=while block: " + i++); // this block will be executed at least once
		}while(i<5);
	}

}
