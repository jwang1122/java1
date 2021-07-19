package com.huaxia.hongkai.method;

/**
 * * Write a Java method to compute the average of three numbers.

```
Input the first number: 25
Input the second number: 45
Input the third number: 65
```

Expected Output:

The average value is 45.0
 * @author Hongkai Z
 *
 */

public class MethodHW02 {

	public static double averageArray(double[] intArray) {
		double number = 0;
		double amount = intArray.length;
		for (double integer : intArray) {
			number += integer;
		}
		number /= amount;
		return number;
	}

	public static void main(String[] args) {
		double[] integerArray = { 25, 45, 65 };
		double average = averageArray(integerArray);
		String str = String.format("The average value is %.1f", average);
		System.out.println(str);

	}

}
