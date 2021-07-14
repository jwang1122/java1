package com.huaxia.hongkai.arrayAndArrayList;

/**
 * * Write a Java program to update specific array element by given element.

for given list below:

[Red, Green, Orange, White, Black]

replace Orange with Yellow

Expected Output:

[Red, Green, Yellow, White, Black]

 */

import java.util.ArrayList;

public class ArrayListHW05 {

	static int findIndex(ArrayList<String> arrayList, String item) {
		int i = 0;
		for (String iterateItem : arrayList) {
			if (iterateItem == item) {
				return i;
			}
			++i;
		}
		return -1;
	}

	static void replaceItem(ArrayList<String> arrayList, String oldItem, String newItem) {
		int index = findIndex(arrayList, oldItem);
		if (index >= 0) {
			arrayList.set(index, newItem);
		}
	}

	public static void main(String[] args) {
		ArrayList<String> myArrayList1 = new ArrayList<>();
		ArrayListHW01.setup(myArrayList1);
		replaceItem(myArrayList1, "Orange", "Yellow");
		System.out.println(myArrayList1);

	}

}
