package com.huaxia.hongkai;

/**
 * Class <b>Object</b> is the root of the class hierarchy. Every class has
 * Object as a superclass. All objects, including arrays, implement the methods
 * of this class.
 * 
 * 
 * @author John
 *
 */
public class Superclass1 { // Every class by default extends from Object class
	protected String name = "John"; // make name available on within this class, initial it with empty Sting.

//	Superclass1(){ //default scope which is package level constructor
//		
//	}

	public Superclass1(String newName) { // can be used everywhere
		this.name = newName;
	}

	public Superclass1() { // modifier such as public, static, private, ... do NOT count as method signature
		// TODO Auto-generated constructor stub
	}

//	private Superclass1(){ // can only be used in this class, for singleton design pattern
//		
//	}

	public String getName() {// getter
		return name;
	}

	public void setName(String name) {// setter
		this.name = name;
	}

	// private modifier make this method can only be used inside this class
	protected double add(double x, double y) { 
		return x + y;
	}
	
	// It is recommended that all subclasses override this method.
	@Override // override decorator
	public String toString() {
		return name;
	}

	public static void main(String[] args) {
		Superclass1 sc1 = new Superclass1("John"); // we can use default constructor from Object class
		System.out.println(sc1);
		Superclass1 sc2 = new Superclass1("Laura");
		System.out.println(sc2);
		double z = sc2.add(2.3, 1.5);
		System.out.println(z);
		System.out.println("END");
	}

}