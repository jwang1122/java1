package com.huaxia.sarah;
/**
 * Class <b>Object<b> is root of class hierarchy
 * Every class has Object as superclass.
 * All objects, including array, implement objects in this class
 * 
 * @author GLiang
 *
 */
public class SuperClass1 extends Object { // Every class by default extends from Object class
	protected String name = "John"; //make name available on within this class, initial it with empty String.
	
//	SuperClass1(){ // default scope which is package level constructor
//		
//	}
	
	public SuperClass1(String newName){ // can be used everywhere
		this.name = newName;
	}
	
	public SuperClass1(){ // modifier such as public, private, static... does NOT count as signature
		
	}
	
//	private SuperClass1(){ // deflaut scope which package level, for singleton design pattern
//		
//		
//	}
	
	public String getName() { // getter
		return name;
	}
	
	public void setName(String name) { // setter
		this.name = name;
	}
	
	// private modifier make this method can only be used inside this class
	protected double add(double x, double y) { 
		return x + y;
	}
	
	//it is recommended that all subclasses override this method
	@Override // override decorator
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SuperClass1 sc1 = new SuperClass1("John"); //  we can use default constructor from Objects class
		System.out.println(sc1);
		SuperClass1 sc2 = new SuperClass1("Laura");
		sc2.setName("Laura");
		System.out.println(sc2);
		double z = sc2.add(2.3, 1.5);
		System.out.println(z);
		System.out.println("END");

	}

}
