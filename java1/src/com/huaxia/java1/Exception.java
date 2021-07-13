package com.huaxia.java1;

import javax.sound.midi.InvalidMidiDataException;

public class Exception {
	double circleArea(double r) throws InvalidMidiDataException { // re-throw the Exception
//		String s = null;
//		s.substring(1,4);
		if (r < 0) {
			throw new InvalidMidiDataException("Radius of circle cannot be negative. r=" + r);
		}
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		Exception obj = new Exception();
		double r = -2;
		try { // try-block
			double area = obj.circleArea(r); // good code
			System.out.println(area);        // other code
		}catch (java.lang.Exception ex) { // use class full path to avoid class name collision
			System.out.println(ex);
		}
//		}catch(InvalidMidiDataException ex) { // catch-block
//			System.out.println(ex);
//		}catch(NullPointerException np) {
//			System.out.println(np);
//		}
		System.out.println("END");
	}

}
