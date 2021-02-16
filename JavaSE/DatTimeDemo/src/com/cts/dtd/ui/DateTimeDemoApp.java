package com.cts.dtd.ui;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeDemoApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate today = LocalDate.now();
		System.out.println(today.format(format));
		
		System.out.print("DOB (\"dd-MMM-yyyy\") please: ");
		String dobStr = scan.next();
		
		LocalDate dob = LocalDate.parse(dobStr, format);
		
		Period p = Period.between(dob, today);
		System.out.println("You are "+p.getYears()+" years of age");
		
		LocalDate indDay = LocalDate.of(1947, Month.AUGUST, 15);
		System.out.println(indDay.format(format));
		
		if(indDay.isBefore(dob)) {
			System.out.println("you are born after independenc");
		}else {
			System.out.println("you are born before independenc");
		}
		
		int ageOfRetirement = 62;
		
		LocalDate retirementDate = dob.plusYears(ageOfRetirement);
		System.out.println("You will retire by: "+retirementDate.format(format));
		
		scan.close();
	}

}
