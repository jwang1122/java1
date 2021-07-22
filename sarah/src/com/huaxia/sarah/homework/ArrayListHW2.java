package com.huaxia.sarah.homework;

import java.util.ArrayList;

public class ArrayListHW2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		for(int i = 0; i < list.size(); i ++) {
			System.out.println(list.get(i));
		}

	}

}
