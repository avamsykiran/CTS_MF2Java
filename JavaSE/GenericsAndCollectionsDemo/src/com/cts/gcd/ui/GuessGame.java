package com.cts.gcd.ui;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		String concern = "";		
		boolean shallContinue=true;
		final int MAX_CHANCES=10;
		
		while(shallContinue) {
			
			int secret = random.nextInt(100);			
			int chances = 0;
			
			while(chances<=MAX_CHANCES) {
				System.out.print("GUESS> ");
				int guess = scan.nextInt();
				
				chances++;
				
				if(guess==secret) {
					System.out.println("You WON");
					break;
				}else if(guess < secret){
					System.out.println("TOO SMALL");
				}else {
					System.out.println("TOO BIG");
				}
				System.out.println("You are left with "+(MAX_CHANCES-chances)+" chances");
			}
			
			if(chances==MAX_CHANCES) {
				System.out.println("YOU LOST! The answer is: " + secret);
			}
			
			System.out.print("Do you wish to continue(y/n): ");
			concern = scan.next();
			shallContinue = concern.toLowerCase().equals("y");
		}
		
		System.out.println("Game Over");
	}
}
