package com.huaxia.connortan.homeworks;

public class LoopHW11 {

	public static void main(String[] args) {
		System.out.println();
//			int i =200; 
		int[] array1 = { 12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		for (int i = 0; i < array1.length; i++) {
			int element = array1[i];
			if (element % 5 == 0) {
				System.out.println(element);

			}

		}
	}
}
