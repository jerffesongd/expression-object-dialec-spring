package com.example.expressionobjectdialect.expression;


public final class NumberUtils {


	public boolean isEven(Integer number) {
		
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}

	public boolean arePairs(Integer number1, Integer number2) {
		
		if (number1 % 2 == 0 && number2 % 2 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	
}
