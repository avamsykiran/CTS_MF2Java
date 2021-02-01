package com.cts.fundas;

public class Application01 {

	public static void main(String[] args) {
		System.out.println("Hello World! Welcoem To Java");

		int n1 = 67;
		int n2 = 45;

		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);

		if (n1 > 0)
			System.out.println(n1 + " is a positive number");

		if (n2 > 0 && n2 % 2 == 0) {
			System.out.println(n2 + " is a positive number");
			System.out.println(n2 + " is a even number");
		} else {
			System.out.println(n2 + " is a positive number");
			System.out.println(n2 + " is a odd number");
		}

		if (n1 == n2) {
			System.out.println("both numbers are equal");
		} else if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n1 + " is lesser than " + n2);
		}

		if (n2 >= 0) {
			if (n2 % 2 == 0) {
				System.out.println(n2 + " is a positive even number");
			} else {
				System.out.println(n2 + " is a positive odd number");
			}
		} else {
			if (n2 % 2 == 0) {
				System.out.println(n2 + " is a negative even number");
			} else {
				System.out.println(n2 + " is a negative odd number");
			}
		}

		int day = 3;

		if (day == 1) {
			System.out.println("MonDay");
		} else if (day == 2) {
			System.out.println("Tuesday");
		} else if (day == 3) {
			System.out.println("Wed");
		} else if (day == 4) {
			System.out.println("Thur");
		} else if (day == 5) {
			System.out.println("Fri");
		} else if (day == 6) {
			System.out.println("Sat");
		} else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("No such week day");
		}

		switch (day) {
		case 1:
			System.out.println("MonDay");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thur");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No such week day");
			break;
		}
		
		
		int i=1;
		while(i<=5) {
			System.out.println("VAMSY");
			i++;
		}
		
		while(i<=5) {
			System.out.println("SRINU");
			i++;
		}
		
		do {
			System.out.println("KOMAL");
			i++;
		}while(i<=5);
		
		for(int x=1;x<=5;x++) {
			System.out.println("Srinu");
		}
		
		
		String dayName="Monday";
		
		switch(dayName) {
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
			System.out.println("WORKING DAY");
			break;
		default:
			System.out.println("WEEnEND OFF");
			break;
		}
	}

}
