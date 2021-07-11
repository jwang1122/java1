package com.huaxia.hongkai.arrayAndArrayList;

/**
 * * Write a Java program to retrieve an element (at a specified index) from a given array list. 

for given list:

[Red, Green, Orange, White, Black]

Expected output:

```
First element: Red
Third element: Orange
```
 */

import java.util.ArrayList;

public class ArrayListHW04 {
	
	public static String findItem(ArrayList<String> arrayList, int index) {
		return arrayList.get(index);
	}
	
	public static void main(String[] args) {
		ArrayList<String> myArrayList1 = new ArrayList<>();
		ArrayListHW01.setup(myArrayList1);
		String str1 = String.format("First element: %s", findItem(myArrayList1, 0));
		String str2 = String.format("Third element: %s", findItem(myArrayList1, 2));
		System.out.println(str1);
		System.out.println(str2);
	}

}
