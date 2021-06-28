package com.huaxia.john.homeworks;

public class LoopHW1 {

	public static void main(String[] args) {
		System.out.println("even number:");
		for (int i=1; i<=10; i++) {
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println();
		System.out.println("odd number:");
		for (int i=1; i<=10; i++) {
			if(i%2==1)
				System.out.println(i);
		}
	}

}
