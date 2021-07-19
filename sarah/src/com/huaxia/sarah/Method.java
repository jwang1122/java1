package com.huaxia.sarah;

/**
 * Method signature
 * 1. method name
 * 2. number of argument
 * 3. type of argument
 * 
 * the method in calss is defined what the object of the class can do
 * 
 * Method overloading: same method name with different signature
 * 
 * private scope is called encapsulation: avoid calling from outside unexpectedly.
 */
public class Method {
	
	// this is default scope method which can only be used within same package
//	static int add(int x, int y) { // create a static method so I can call it directly in main()
//		return x + y;
//	}
	
	//public modifier determine scope of this method add()
	private static int add(int x, int y) { // create a static method so I can call it directly in main()
		return x + y;
	}
	
	public static double add(double x, double y) { // different signature of add() method, so-called method overloading
		return x + y;
	}

	public static void main(String[] args) {
		double result = add(4, 5); // assign small value to a big contains in the memory
		System.out.println(result);
		
//		Method obj = new Method();
		result = Method.add(1.2, 3.4); // create instance and call non-static method
		System.out.println(result);
		
	}

}
