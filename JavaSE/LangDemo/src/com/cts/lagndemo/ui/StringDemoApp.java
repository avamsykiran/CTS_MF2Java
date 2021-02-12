package com.cts.lagndemo.ui;

import java.util.Scanner;

public class StringDemoApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String s = scan.next();
		
		/*
		 * StringBuilder sb = new StringBuilder();
		 * 
		 * for(int i=s.length()-1;i>=0;i--) { sb.append(s.charAt(i)); }
		 * String rev=new String(sb); //sb.toString();
		 */
		
		String rev=(new StringBuilder(s)).reverse().toString();
		
		System.out.println(rev);
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("Its a Pallendrome");
		}else {
			System.out.println("Its not a Pallendrome");
		}
		
		scan.close();
	}

}
