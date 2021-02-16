package com.cts.ed.service;

import com.cts.ed.exception.InsufficientBalanceException;
import com.cts.ed.exception.InvalidDepositeAmountException;
import com.cts.ed.exception.InvalidWithdrawAmountException;
import com.cts.ed.model.BankAccount;

public class BankAccountService {
	
	public static final double MIN_BAL=500;

	public double deposite(BankAccount account,double amount) throws InvalidDepositeAmountException{
		
		if(amount<=0) {
			throw new InvalidDepositeAmountException(amount);
		}
		
		account.setCurrentBal(account.getCurrentBal()+amount);
		return account.getCurrentBal();
	}
	
	public double withdraw(BankAccount account,double amount) throws InvalidWithdrawAmountException, InsufficientBalanceException {
						
		if(amount<=0) {
			throw new InvalidWithdrawAmountException(amount);
		}
		
		double currentBal = account.getCurrentBal();
		
		if(currentBal-amount<MIN_BAL) {
			throw new InsufficientBalanceException(amount, currentBal);
		}
		
		account.setCurrentBal(currentBal-amount);
		
		return account.getCurrentBal();
	}
}
