package com.huaxia.java1;

/**
 * Running class within the same package of @see(Method) class, so we don't need import
 * 
 * @author John
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		double rst = Method.add(5, 5);// use class name call the method
		System.out.println(rst);
		
		Method obj = new Method();
		rst = obj.add(3.4, 6.5);
		System.out.println(rst);
	}

}
