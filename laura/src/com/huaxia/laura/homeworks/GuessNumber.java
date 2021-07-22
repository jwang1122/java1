package com.huaxia.laura.homeworks;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber 
{
	static void guessNumber() 
	{
		int runsP1 = 1;
		int runsP2 = 1;
		Random rand = new Random();
		Scanner in = new Scanner(System.in);
		System.out.println("Guess the number!!!");
		boolean playing = true;
		do
		{
			int num1 = rand.nextInt(100) + 1;
			System.out.println(num1);
			while(true) 
			{
				System.out.println("Player 1's Turn");
				System.out.println("Please enter a number between 1-100: ");
				int player1Num = in.nextInt();
				if(num1 == player1Num) 
				{
					System.out.printf("You got it! Took %d guesses.\n", runsP1);
					break;
				}
				if(num1 > player1Num) 
				{
					System.out.println("Your number is too small!");
				}
				if(num1 < player1Num) 
				{
					System.out.println("Your number is too big!");
				}
				runsP1++;
			}
			
			int num2 = rand.nextInt(100) + 1;
			System.out.println(num2);
			while(true) 
			{
				System.out.println("Player 2's Turn");
				System.out.println("Please enter a number between 1-100: ");
				int player1Num = in.nextInt();
				if(num2 == player1Num) 
				{
					System.out.printf("You got it! Took %d guesses.\n", runsP2);
					break;
				}
				if(num2 > player1Num) 
				{
					System.out.println("Your number is too small!");
				}
				if(num2 < player1Num) 
				{
					System.out.println("Your number is too big!");
				}
				runsP2++;
			}
			if(runsP1 > runsP2) 
			{
				System.out.println("Player 2 wins!");
			}
			else if(runsP1 < runsP2) 
			{
				System.out.println("Player 1 wins!"); 
			}
			else 
			{
				System.out.println("Tie...");
			}
			System.out.print("Do you want to play again? (Y/N)");
			in.nextLine();
			String answer = in.nextLine();
			if(answer.equals("N")) 
			{
				playing = false;
			}
		}while(playing);
		System.out.println("GAME OVER");
		in.close();
	}

	public static void main(String[] args) 
	{
		guessNumber();
	}

}
