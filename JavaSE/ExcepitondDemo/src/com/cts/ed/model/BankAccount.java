package com.cts.ed.model;

public class BankAccount {
	
	private String accountNumber;
	private double currentBal;
	
	public BankAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public BankAccount(String accountNumber, double currentBal) {
		super();
		this.accountNumber = accountNumber;
		this.currentBal = currentBal;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getCurrentBal() {
		return currentBal;
	}

	public void setCurrentBal(double currentBal) {
		this.currentBal = currentBal;
	}

}
