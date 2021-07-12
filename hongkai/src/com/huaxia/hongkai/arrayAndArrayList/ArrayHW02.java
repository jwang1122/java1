package com.huaxia.hongkai.arrayAndArrayList;

/**
 * Write a Java program to sum values of an array.

for example:

```java
   int my_array[] = { 12, 21, 43, 84, 35, 67, 27, 18, 92, 10 };
```

Expected output:

The sum is 409

 * @author Hongkai Z
 *
 */

public class ArrayHW02 {
	
	public static int addIntArrayValues(int[] arrayList) {
		int j = 0;
		for (int i = 0; i < arrayList.length; i++) {
			j += arrayList[i];
		}
		return j;
	}

	public static void main(String[] args) {
		int my_array[] = { 12, 21, 43, 84, 35, 67, 27, 18, 92, 10 };
		int totalSum = addIntArrayValues(my_array);
		System.out.println(totalSum);
	}

}
