package com.huaxia.hongkai.arrayAndArrayList;

/**
 * Write a Java program to find the index of an array element.
 * 
 * @author Hongkai Z
 *
 */

public class ArrayHW06 {

	private static int findArrayItemIndex(int[] array, int matchItem) {
		int returnArrayIndex = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == matchItem) {
				returnArrayIndex = i;
				break;
			}
		}
		return returnArrayIndex;
	}
	
	private static void printIndex(int itemAtIndex, int index) {
		String str1 = "The item %d in the array list is at index %d"; 
		System.out.printf(str1, itemAtIndex, index);
	}

	public static void main(String[] args) {
		int[] my_array1 = { 1789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2265, 1457, 2456 };
		int i = findArrayItemIndex(my_array1, 2013);
		printIndex(2013, i);


	}

}
