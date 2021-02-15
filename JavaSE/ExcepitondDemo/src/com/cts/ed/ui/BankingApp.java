package com.cts.ed.ui;

import java.util.Scanner;

import com.cts.ed.exception.InvalidDepositeAmountException;
import com.cts.ed.model.BankAccount;
import com.cts.ed.service.BankAccountService;

public class BankingApp {

	public static void main(String[] args) {
		
		BankAccount acc = new BankAccount("SB001",4500.0);
		BankAccountService bService = new BankAccountService();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter amount to deposite: ");
		double amt = scan.nextDouble();
		 
		try {
			double updatedBal = bService.deposite(acc, amt);
			System.out.println(updatedBal);
		} catch (InvalidDepositeAmountException exp) {
			System.out.println(exp.getMessage());
		}
		
		scan.close();

	}

}
