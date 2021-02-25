package com.cts.iod.ui;

import java.io.File;
import java.util.Scanner;

public class FileListingApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter a path: ");
		String path = scan.next();
		
		File fileObject = new File(path);
		
		if(!fileObject.exists()) {
			System.out.println("No Such File/Folder Found");
		}else if(fileObject.isFile()) {
			System.out.println("The path given points to a file of size " + fileObject.length()+" bytes");
		}else {
			System.out.println("It is a folder. it contians the below");
			System.out.println("Type\tSize\tReadable\tWritable\tFile Name");
			System.out.println("------------------------------------------------------------------------------");
			
			File[] subFiles = fileObject.listFiles();
			
			for(File f : subFiles) {
				System.out.println(						
						(f.isDirectory()?"DIR":"FIL") + "\t" +
						(f.isFile()?String.valueOf(f.length()):"NA") + "\t" + 
						(f.canRead()?"YES":"NO") + "\t" +
						(f.canWrite()?"YES":"NO") + "\t" +
						f.getName()
						);
			}
		}
		
		scan.close();

	}

}
