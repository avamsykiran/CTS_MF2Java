package com.cts.ed.ui;

import java.util.Scanner;

public class FinallyDemo {

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		
//		try {
//			System.out.println("A number: ");
//			int n = scan.nextInt();
//			if(n%2==0) {
//				System.out.println("OK Thank you!");
//			}else {
//				throw new Exception("Expecting only even");
//			}
//		}catch(Exception exp) {
//			System.out.println(exp.getMessage());
//			return;
//		}finally {
//			System.out.println("this is a finally block");
//			scan.close();
//		}
		
	
		
		try(Scanner scan = new Scanner(System.in);) {
			System.out.println("A number: ");
			int n = scan.nextInt();
			if(n%2==0) {
				System.out.println("OK Thank you!");
			}else {
				throw new Exception("Expecting only even");
			}
		}catch(Exception exp) {
			System.out.println(exp.getMessage());			
		}
		
		System.out.println("App Terminated");
		
	}

}
