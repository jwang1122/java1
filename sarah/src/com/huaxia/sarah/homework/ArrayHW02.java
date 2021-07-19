package com.huaxia.sarah.homework;

public class ArrayHW02 {

	public static void main(String[] args) {
		int my_array[] = { 12, 21, 43, 84, 35, 67, 27, 18, 92, 10 };
		int sum = 0;
		for(int num : my_array) {
			sum = sum + num;
		}
		System.out.printf("The sum is %d", sum);

	}

}
