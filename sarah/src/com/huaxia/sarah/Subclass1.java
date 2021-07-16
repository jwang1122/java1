package com.huaxia.sarah;

public class Subclass1 extends SuperClass1 {

	public Subclass1(String newName) {
		this.name = newName;
		
	}

	public static void main(String[] args) {
		Subclass1 sb = new Subclass1("John");
		System.out.println(sb);
		double z = sb.add(3.2, 6.3);
		System.out.println(z);

	}

}
