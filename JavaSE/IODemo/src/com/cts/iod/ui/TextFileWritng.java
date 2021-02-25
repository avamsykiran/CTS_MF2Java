package com.cts.iod.ui;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWritng {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("File Name?");
		String fileName = scan.next();
		
		File file = new File(fileName);
		
		try(PrintWriter fout = new PrintWriter(new FileOutputStream(file,true),true)){
			System.out.println("Enter text to save and '*STOP*' to stop!");
			
			String line = "";
			
			do {
				line = scan.nextLine();
				fout.println(line);
			}while(!"*STOP*".equalsIgnoreCase(line));
			
			System.out.println("Data is saved!");
			
		}catch(IOException exp) {
			System.out.println(exp.getMessage());
		}
		
	}

}
