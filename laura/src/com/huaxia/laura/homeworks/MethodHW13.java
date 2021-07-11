package com.huaxia.laura.homeworks;

import java.util.Scanner;

public class MethodHW13 
{
	public static double findTriangleArea(double a, double b, double c) 
	{
		double s = (a + b + c)/2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	} 
	
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Input Side 1: ");
		double a = in.nextDouble();
		System.out.println("Input Side 2: ");
		double b = in.nextDouble();
		System.out.println("Input Side 3: ");
		double c = in.nextDouble();
		System.out.printf("\nThe area of the triangle is %.3f", findTriangleArea(a, b, c));
		in.close();
	}
}
