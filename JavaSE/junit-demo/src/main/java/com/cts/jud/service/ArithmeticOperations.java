package com.cts.jud.service;

import com.cts.jud.exception.InvalidDivisorException;

public class ArithmeticOperations {

	public int sum(int a,int b) {
		return a+b;
	}
	
	public int product(int a,int b) {
		return a*b;
	}
	
	public int qut(int a,int b) throws InvalidDivisorException {
		if(b==0) {
			throw new InvalidDivisorException(b + " is not a valid divisor");
		}
		return a/b;
	}
}
