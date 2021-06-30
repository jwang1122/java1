package com.huaxia.sarah.homework;

// public class name must match with file name
public class LoopHW1 {

	public static void main(String[] args) {
		System.out.println("even number:");
		for(int i = 1; i <= 10; i++) { // for loop code block
			if(i%2==0) {
				System.out.println(i);
			}
			
		}
		
		System.out.println();

		System.out.println("odd number:");
		for(int i = 1; i <= 10; i++) { // for loop code block
			if(i % 2 != 0) {
				System.out.println(i);
			}
			
		}
	}

}

// you can define many other class within one file as long as it is not public
class MyClass{
	
}