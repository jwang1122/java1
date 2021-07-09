package com.huaxia.hongkai.arrayAndArrayList;

/**
 * * Write a Java program to test if an array contains a specific value.

for example:

```java
          int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2265, 1457, 2456};

        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));

```

Expected output:

true
false

or:

The array contains 2013.
The array does not contain 2015.


 * @author Hongkai Z
 *
 */

public class ArrayHW05 {

/**
	//Method #1
	private static boolean contains(int[] my_array1, int matchItem) {
		boolean containsItem = false;
		for (int arrayItem : my_array1) {
			if (arrayItem == matchItem) {
				containsItem = true;
				break;
			}
		}
		return containsItem;
	}
 */	

	//Method #2
	private static String contains(int[] my_array1, int matchItem) {
		boolean containsItem = false;
		for (int arrayItem : my_array1) {
			if (arrayItem == matchItem) {
				containsItem = true;
				break;
			}
		}
		String str1 = "The array contains %d.";
		if (containsItem == false) {
			str1 = "The array does not contain %d.";
		}
		String str2 = String.format(str1, matchItem);
		return str2;
	}

	public static void main(String[] args) {
		int[] my_array1 = {
			1789, 2035, 1899, 1456, 2013, 
			1458, 2458, 1254, 1472, 2365, 
			1456, 2265, 1457, 2456};
        System.out.println(contains(my_array1, 2013));
        System.out.println(contains(my_array1, 2015));

	}

}
