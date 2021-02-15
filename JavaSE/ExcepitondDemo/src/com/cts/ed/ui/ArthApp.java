package com.cts.ed.ui;

import java.util.Scanner;

public class ArthApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n1=0;		
		while(!scan.hasNextInt()) {			
			System.out.println("Expected a non-decimal number");
			scan.next();
		}
		n1 = scan.nextInt();
		System.out.print("Enter another number: ");
		int n2=0;
		
		while(!scan.hasNextInt()) {			
			System.out.println("Expected a non-decimal number");
			scan.next();
		}
		n2 = scan.nextInt();
		
		if(n2==0) {
			System.out.println("Zero is not an expcted input for divisor");
		}else {
			System.out.println("Qut: " +(n1/n2));
		}
		
		System.out.println("Application Terminated");
	}

}
