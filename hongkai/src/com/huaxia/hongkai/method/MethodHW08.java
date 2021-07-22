package com.huaxia.hongkai.method;

/**
 * *  Write a Java method to compute the future investment value at a given interest rate for a specified number of years.

$$future=investmentAmount \cdot (1+mothlyInterstRate)^{years \cdot 12}$$

Sample data (Monthly compounded) and Output:

Input the investment amount: 1000

Input the rate of interest: 10

Input number of years: 5

Expected Output:

```
Years    FutureValue                                     
1            1104.71                                     
2            1220.39                                     
3            1348.18                                     
4            1489.35                                     
5            1645.31
```
 * @author Hongkai Z
 *
 */

public class MethodHW08 {
	
	static double calculateInterest(double startAmount, double interestPercent, int years) {
		return startAmount * Math.pow(1 + interestPercent, years);
	}
	
	public static void main(String[] args) {
		System.out.println("Years    FutureValue");
		double startAmount = 1000;
		double interestDecimal = 0.10;
		int years = 5;
		for (int i = 1; i <= years; i++) {
			double line = calculateInterest(startAmount, interestDecimal, i);
			System.out.printf("%d            %.2f\n", i, line);
		}
		
		
	}

}
