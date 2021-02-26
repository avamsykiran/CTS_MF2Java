package com.cts.ecrud.ui;

import java.awt.Choice;
import java.util.Scanner;

public class EmployeeApplication {

	static Scanner kbin;

	public static void main(String[] args) {

		kbin = new Scanner(System.in);

		MenuOption menu = null;

		while (menu != MenuOption.QUIT) {
			System.out.println("Choice\tOperation");
			for (MenuOption opt : MenuOption.values()) {
				System.out.println(opt.ordinal() + "\t" + opt);
			}
			System.out.print("Choice> ");
			int choice = kbin.nextInt();
			if (choice < 0 || choice >= MenuOption.values().length) {
				System.out.println("Invalid Choice!");
			} else {
				menu = MenuOption.values()[choice];

				switch (menu) {
				case ADD:
					break;
				case DELETE:
					break;
				case LIST:
					break;
				case SEARCH:
					break;
				case QUIT:
					System.out.println("Application Terminates..!");
					break;
				}
			}
		}

	}

}
