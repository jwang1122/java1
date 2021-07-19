package com.huaxia.sarah;

import javax.sound.midi.InvalidMidiDataException;

public class Exception {
	double circleArea(double r) throws InvalidMidiDataException{ // rethrow the Exception
//		String s = null;
//		s.substring(1,4);
		if(r<0) {
			throw new InvalidMidiDataException("Radius of circle cannot be negative.");
		}
		return Math.PI * r * r;
	}

	public static void main(String[] args) {
		Exception obj = new Exception();
		double r = -2;
		try {
			double area = obj.circleArea(r); // good code
			System.out.println(area); // other code
		}catch(java.lang.Exception ex) {
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
