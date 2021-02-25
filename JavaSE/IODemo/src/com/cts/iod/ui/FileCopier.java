package com.cts.iod.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileCopier {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Source File Name?");
		String srcFileName = scan.next();
		
		System.out.print("Target File Name?");
		String trgFileName = scan.next();
		
		File srcFile = new File(srcFileName);
		File trgFile = new File(trgFileName);
		
		try(
				FileInputStream srcIn = new FileInputStream(srcFile);
				FileOutputStream trgOut = new FileOutputStream(trgFile);
				
				){
			
			int fileSize = srcIn.available();
			
			byte[] data = new byte[fileSize];
			srcIn.read(data);
			trgOut.write(data);
			
			System.out.println("Files copied!");
		}catch(IOException exp) {
			System.out.println(exp.getMessage());
		}
		
	}

}
