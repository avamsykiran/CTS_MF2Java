package com.cts.ed.exception;

public class InvalidDepositeAmountException extends Exception{

	public InvalidDepositeAmountException(double amount) {
		super("Invalid Deposite Amount: "+amount+". Deposite Amount must be a non negative and a non-zero number");		
	}
}
