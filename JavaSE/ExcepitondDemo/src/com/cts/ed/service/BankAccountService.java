package com.cts.ed.service;

import com.cts.ed.exception.InvalidDepositeAmountException;
import com.cts.ed.model.BankAccount;

public class BankAccountService {

	public double deposite(BankAccount account,double amount) throws InvalidDepositeAmountException{
		
		if(amount<=0) {
			throw new InvalidDepositeAmountException(amount);
		}
		
		account.setCurrentBal(account.getCurrentBal()+amount);
		return account.getCurrentBal();
	}
	
	public double withdraw(BankAccount account,double amount) {
		
		//check if amount is negative, then raise InvalidWithdrawAmountException
		//check if balance after withdraw is not less than a min bal (say 500), if so raise InsufficientBalanceException. 
		
		account.setCurrentBal(account.getCurrentBal()-amount);
		
		return account.getCurrentBal();
	}
}
