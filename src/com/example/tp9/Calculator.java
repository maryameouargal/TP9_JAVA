package com.example.tp9;

public class Calculator {
//	we should add methods to calculate and operate 
	public double add(double a, double b) {
//		the operation here is addition 
		return a + b;
	}
//  the method to divide 
	
	public double divide(double a, double b) {
		if (b == 0.0) {
			throw new IllegalArgumentException("you cannot divide by zero");
		}
		return a / b;
	}

}
