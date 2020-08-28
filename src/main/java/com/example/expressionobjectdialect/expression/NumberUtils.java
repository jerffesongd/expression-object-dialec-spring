package com.example.expressionobjectdialect.expression;


public final class NumberUtils {


	public String isEven(Integer number) {
		
		if (number % 2 == 0) {
			return number +" is even";
		} else {
			return number + " is not even";
		}
		
	}
	
}
