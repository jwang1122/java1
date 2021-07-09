package com.huaxia.laura.homeworks;

import java.util.ArrayList;

public class ArrayListHW03 {

	public static void main(String[] args) 
	{
		ArrayList colors = new ArrayList();
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");
		System.out.println(colors);
		colors.add(0, "Yellow");
		System.out.println(colors);
	}

}
