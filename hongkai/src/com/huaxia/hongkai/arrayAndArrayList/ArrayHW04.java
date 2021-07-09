package com.huaxia.hongkai.arrayAndArrayList;

/**
 * Write a Java program to calculate the average value of array elements.

for example

```java
       int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};

```

Expected output:

Average value of the array elements is : 7.0
 * @author Hongkai Z
 *
 */

public class ArrayHW04 {

	// method for calculating average of items in int[] array list
	public static int arrayItemAverage(int[] arrayInt) {
		int methodReturn = 0;
		for (int arrayIntIndex:arrayInt) {
			methodReturn += arrayIntIndex;
		}
		methodReturn /= arrayInt.length;
		return methodReturn;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
		int average = arrayItemAverage(numbers);
		System.out.printf("Average value of the array elements is : %d", average);
	}

}
