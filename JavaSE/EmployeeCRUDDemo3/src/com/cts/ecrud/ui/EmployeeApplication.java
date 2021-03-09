package com.cts.ecrud.ui;

import java.awt.Choice;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.cts.ecrud.dao.EmployeeDaoFileSystemImpl;
import com.cts.ecrud.dao.EmployeeDaoJdbcImpl;
import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;
import com.cts.ecrud.service.EmployeeService;
import com.cts.ecrud.service.EmployeeServiceImpl;

public class EmployeeApplication {

	static Scanner kbin;
	static EmployeeService empService=null;

	public static void main(String[] args) {

		kbin = new Scanner(System.in);

		MenuOption menu = null;
		
		//empService=new EmployeeServiceImpl(new EmployeeDaoFileSystemImpl());
		//empService=new EmployeeServiceImpl(new EmployeeDaoJdbcImpl());
		
		empService=new EmployeeServiceImpl();
		//((EmployeeServiceImpl)empService).setEmpDao(new EmployeeDaoFileSystemImpl());
		((EmployeeServiceImpl)empService).setEmpDao(new EmployeeDaoJdbcImpl());
		
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
					addEmployee();
					break;
				case DELETE:
					deleteEmployee();
					break;
				case LIST:
					listAllEmployees();
					break;
				case SEARCH:
					searchEmployee();
					break;
				case QUIT:
					System.out.println("Application Terminates..!");
					break;
				}
			}
		}

	}

	private static void searchEmployee() {
		System.out.print("EmpId? ");
		int empId = kbin.nextInt();
		
		try {
			Employee emp = empService.getById(empId);
			if(emp==null) {
				System.out.println("Employee not found!");
			}else {
				System.out.println(emp);	
			}
			
		} catch (EmployeeProcessingException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void listAllEmployees() {
		try {
			List<Employee> emps = empService.getAll();
			
			if(emps==null || emps.isEmpty()) {
				System.out.println("No records available.");
			}else {
				emps.stream().forEach(System.out::println);
			}
		} catch (EmployeeProcessingException e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void deleteEmployee() {
		System.out.print("EmpId? ");
		int empId = kbin.nextInt();
		
		try {
			empService.delete(empId);
			System.out.println("Record deleted!");
		} catch (EmployeeProcessingException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void addEmployee() {
		Employee emp = new Employee();
		System.out.print("EmpId? ");
		emp.setEmpId(kbin.nextInt());
		System.out.print("Name? ");
		emp.setName(kbin.next());
		System.out.print("Basic? ");
		emp.setBasic(kbin.nextDouble());
		System.out.print("HireDate(yyyy-MM-dd)? ");
		emp.setHireDate(LocalDate.parse(kbin.next()));
		
		try {
			empService.add(emp);
			System.out.println("Employee added.");
		} catch (EmployeeProcessingException e) {
			System.out.println(e.getMessage());
		}
	}
}
