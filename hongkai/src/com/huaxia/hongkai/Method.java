package com.huaxia.hongkai;

/**
 * Method signature:
 * 1. method name
 * 2. number of arguments
 * 3. type of arguments
 * 
 * Method overloading: same method name with different method signature
 * 
 * @author Hongkai Z
 *
 */
public class Method {
	
	static int add(int x, int y) { // create a static method so I can call it directly in main()
		return x + y;
	}
	
	double add(double x, double y) { // differet signature of add() method, so-called method overloading
		return x + y;
	}
	public static void main(String[] args) { // local test code block
		double result = add(4, 5); // assign small value to a big container in the memory
		System.out.println(result);
		
		Method obj = new Method();
		result = obj.add(1.2, 3.4); // create an instance and call non-static method
		System.out.println(result);

	}

}
