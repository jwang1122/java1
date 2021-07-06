package com.huaxia.test;

import com.huaxia.hongkai.Method; //Use the class in other package needs import

/**
 * Running class with different package of @see(Method) class, so we need import
 * 
 * different package can only call public method
 * 
 * @author Hongkai Z
 *
 */
public class TestMethod {

	public static void main(String[] args) {
		double rst = Method.add(4, 8);
		System.out.println(rst);
		
		Method obj = new Method();
		rst = obj.add(2.3, 6.98);

	}

}
