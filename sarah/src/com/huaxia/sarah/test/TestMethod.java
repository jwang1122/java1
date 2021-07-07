package com.huaxia.sarah.test;

/**
 * Running class within the same package of @see(Method) class
 * 
 * different package can only call the public method
 * 
 * @author GLiang
 *
 */
import com.huaxia.sarah.Method;

public class TestMethod {

	public static void main(String[] args) {
		double rst = Method.add(4, 8);
		System.out.println(rst);

		Method obj = new Method();
		rst = obj.add(3.2,6.98);
		System.out.println(rst);		
		
	}

}
