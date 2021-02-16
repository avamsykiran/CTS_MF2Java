package com.cts.ed.exception;

public class InvalidWithdrawAmountException extends Exception{

	public InvalidWithdrawAmountException(double amount) {
		super("Invalid Withdraw Amount: "+amount+".The amount must be a non negative and a non-zero number");		
	}
}