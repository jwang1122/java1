package com.huaxia.hongkai.method;

/**
 * * Write a Java method to find the smallest number among three numbers. 

```
Input the first number: 25
Input the Second number: 37
Input the third number: 29
```

Expected Output:

The smallest value is 25.0
 * @author Hongkai Z
 *
 */

public class MethodHW01 {

	public static int findSmallerNumber(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
	}

	public static int comparisonComplex(int[] intArray) {
		int smallestNum = intArray[0];
		for (int integer : intArray) {
			smallestNum = findSmallerNumber(smallestNum, integer);
		}
		return smallestNum;
	}

	public static void main(String[] args) {
		int[] integerArray = { 25, 37, 29 };
		int smallNum = comparisonComplex(integerArray);
		String str = String.format("The smallest value is %d", smallNum);
		System.out.println(str);

	}

}
