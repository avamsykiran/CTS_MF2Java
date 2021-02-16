package com.cts.ed.exception;

public class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(double amount,double bal) {
		super("Can not withdraw "+amount+" from balance: "+bal);		
	}
}