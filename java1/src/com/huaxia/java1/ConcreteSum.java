package com.huaxia.java1;

public class ConcreteSum extends AbstractSum {

	@Override
	protected int sumOfTwo(int x, int y) {
		result = x + y;
		return (int)result;
	}

	@Override // method overridden
	protected int sumOfThree(int x, int y, int z) {
		result = x + y + z; // result is big container, x+y+z is small value
		return (int)result; // cast for the content in big container to small value
	}

	public static void main(String[] args) {
		ConcreteSum cs = new ConcreteSum();
		cs.sumOfTwo(4, 5);
		cs.display();
		cs.sumOfThree(1, 2, 3);
		cs.display();
		cs.sumOfTwo(2.345, 1.239); // call overloading method in superclass
		cs.display();
	}

}
