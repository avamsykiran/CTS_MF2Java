package com.cts.iod.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TExtFileReading {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("File Name?");
		String fileName = scan.next();
		
		File file = new File(fileName);
		
		try(BufferedReader fin = new BufferedReader(new FileReader(file))){
			System.out.println("The file contents:  ");
			//fin.lines().forEach(System.out::println);
			String line="";
			while((line = fin.readLine())!=null) {
				System.out.println(line);
			}
		}catch(IOException exp) {
			System.out.println(exp.getMessage());
		}
		
	}

}
