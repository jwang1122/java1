package com.huaxia.connortan.homeworks;

/**
 * Class Object is the root of the class hierarchy.
 * Every class has Object as a superclass.
 * All objects, including arrays, implement the methods of this class.
 * 
 * 
 * @author cyxt2
 *
 */
public class Superclass1 extends Object { // very class by default extends from Object class
	private String name = "John"; // make name available on within this class, initial it with empty String.
	
	
	public String getName() { // getter
		return name;
	}


	public void setName(String name) { // setter
		this.name = name;
	}

	// It is recommended that all subclasses override this method.
	@Override
	public String toString() {
		return "Superclass1 [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Superclass1 sc1 = new Superclass1(); // we can use default constructor from Object class
		System.out.println(sc1);
		Superclass1 sc2 = new Superclass1(); // we can use default constructor from Object class
		sc2.setName("Connor");
		System.out.println(sc2);
		System.out.println("END");
	}

	
	}


