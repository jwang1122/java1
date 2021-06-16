package com.huaxia.java1;

public class DataType {

	public static void main(String[] args) {
		byte myByte = 127; // 8 bits, -128~127
		char c = 'A';
		short myShort =128;
		int a = 1234542345; // int is data type of integer
		long l = 123454234563242L;
		float x = 129.3F;
		double y = 12.3;
//		x = (float)y; //cast: assign large value to smaller data type
		myByte = (byte)x;
		System.out.println(myByte);
		System.out.println(a + x + y+myByte+myShort+c);//?why output a double?
	}

}
