package com.huaxia.sarah.homework;

public class LoopHW11 {

	public static void main(String[] args) {
		Integer[] arrayOne = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		for(int i = 0; i < arrayOne.length; i++) {
			if(arrayOne[i]%5 == 0) {
				if(arrayOne[i]>150) {
					break;
				}
				System.out.println(arrayOne[i]);				
			}

		}
	}

}
