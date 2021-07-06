package com.huaxia.hongkai;

/**
 * Running class within the same package of @see(Method) class, so we don't need import
 * @author Hongkai Z
 *
 */

public class TestMethod {

	public static void main(String[] args) {
		Method obj = new Method();
		double rst = Method.add(5, 5);
		System.out.println(rst); // use class name call the method

		rst = obj.add(3.4, 6.5);
		System.out.println(rst); // use class name call the method
		

	}

}
