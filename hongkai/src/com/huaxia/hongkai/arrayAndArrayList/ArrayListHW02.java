package com.huaxia.hongkai.arrayAndArrayList;

import java.util.ArrayList;

/**
 * * Write a Java program to iterate through all elements in a array list.

Expected output:

```
Red
Green
Orange
White
Black
``` 
 * @author Hongkai Z
 *
 */

public class ArrayListHW02 {

	public static void iterateAL(ArrayList<String> arrayList) {
		for (String item : arrayList) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> myArrayList1 = new ArrayList<>();
		ArrayListHW01.setup(myArrayList1);
		iterateAL(myArrayList1);

	}

}
