package com.huaxia.hongkai.arrayAndArrayList;

import java.util.ArrayList;

/**
 * * Write a Java program to create a new array list, add some colors (string) and print out the collection.

Expected output:

[Red, Green, Orange, White, Black]
 * @author Hongkai Z
 *
 */

public class ArrayListHW01 {

	public static void addItem(ArrayList<String> arrayList, String item) {
		arrayList.add(item);
	}
	
	public static void setup(ArrayList<String> arrayList) {
		addItem(arrayList, "Red");
		addItem(arrayList, "Green");
		addItem(arrayList, "Orange");
		addItem(arrayList, "White");
		addItem(arrayList, "Black");
	}

	public static void main(String[] args) {
		ArrayList<String> myArrayList1 = new ArrayList<>();
		setup(myArrayList1);
		System.out.println(myArrayList1);

	}

}
