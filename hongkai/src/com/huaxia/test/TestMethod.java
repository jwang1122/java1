package com.huaxia.test;

import com.huaxia.hongkai.Method; // Use the class in other package need import

/**
 * Running class with different package of @see(Method) class, so we need import
 * 
 * different package can only call the public method.
 * 
 * @author John
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		double rst = Method.add(4, 8);
		System.out.println(rst);

		Method obj = new Method();
		rst = obj.add(3.2, 6.98);
		System.out.println(rst);
	}

}
