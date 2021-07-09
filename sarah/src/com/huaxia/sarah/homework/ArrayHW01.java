package com.huaxia.sarah.homework;

import java.util.Arrays;

public class ArrayHW01 {

	public static void main(String[] args) {
		int[] my_array1 = {
	            1789, 2035, 1899, 1456, 2013, 
	            1458, 2458, 1254, 1472, 2365, 
	            1456, 2165, 1457, 2456};
		System.out.printf("Original numeric array: %s\n", Arrays.toString(my_array1));
		Arrays.sort(my_array1);
		System.out.printf("Modified arr[] : %s", Arrays.toString(my_array1));
		
	    String[] my_array2 = {
	            "Java",
	            
	            "Python",
	            "PHP",
	            "C#",
	            "C Programming",
	            "C++"
	        };        

	}

}
