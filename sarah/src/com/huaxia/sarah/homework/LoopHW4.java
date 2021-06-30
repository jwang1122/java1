package com.huaxia.sarah.homework;

public class LoopHW4 {

	public static void main(String[] args) {
		for (int i = 0; i <= 4; i++) {
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}	
			
		for (int y = 3; y >= 0; y--){
			for (int x = 0; x <= y; x++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	}
}

