package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW08 
{
	public static double findFutureInvestmentValue(double investmentAmount, double rateOfInterest, int years) 
	{
		return investmentAmount * Math.pow(1 + rateOfInterest/12, years * 12);
	}

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input the investment amount: ");
		double investmentAmount = in.nextDouble();
		System.out.println("Input the rate of interest: ");
		double rateOfInterest = in.nextDouble();
		System.out.println("Input number of years: ");
		int years = in.nextInt();
		
		rateOfInterest = rateOfInterest * 0.01;
		
		System.out.println("Years    FutureValue");
		for(int i = 1; i <= years; i++) 
		{
			if(i >= 10) 
			{
				System.out.printf("%d       %.2f\n", i, findFutureInvestmentValue(investmentAmount, rateOfInterest, i));
			}
			else if(i < 10) 
			{
				System.out.printf("%d        %.2f\n", i, findFutureInvestmentValue(investmentAmount, rateOfInterest, i));
			}
		}
		in.close();
	}

}
