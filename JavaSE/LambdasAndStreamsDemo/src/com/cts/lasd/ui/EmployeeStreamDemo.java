package com.cts.lasd.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.cts.lasd.service.model.Employee;

public class EmployeeStreamDemo {

	public static void main(String[] args) {

		List<Employee> emps = new ArrayList<>();
		
		emps.add(new Employee(101, "Vamsy", 59862.0, LocalDate.now(),false));		
		emps.add(new Employee(110, "Komal", 55862.0, LocalDate.now().minusMonths(1),false));
		emps.add(new Employee(105, "Zubar", 49862.0, LocalDate.now().minusMonths(2),false));
		emps.add(new Employee(111, "Praksah", 39862.0, LocalDate.now().minusMonths(1),false));
		emps.add(new Employee(115, "Amit", 29862.0, LocalDate.now().minusDays(1),false));
		emps.add(new Employee(141, "Arun", 59662.0, LocalDate.now().minusDays(10),false));
		emps.add(new Employee(121, "Vasu", 34862.0, LocalDate.now().minusDays(5),false));
		emps.add(new Employee(101, "Vamsy", 59862.0, LocalDate.now(),false));
						
		emps.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------");
		emps.stream().forEach((e) -> { e.setBasic(e.getBasic()+10000); });
		emps.stream().forEach(System.out::println);
		System.out.println("-----------------------------------------------");
		
//		Optional<Employee> empContainer = emps.stream()
//				.reduce((e1,e2) -> (e1.getHireDate().isBefore(e2.getHireDate())?e1:e2));
//		System.out.println(empContainer.get());
		
		Employee senior = emps.stream()
				.reduce((e1,e2) -> (e1.getHireDate().isBefore(e2.getHireDate())?e1:e2)).orElse(null);
		System.out.println(senior);
		
		System.out.println("-----------------------------------------------");
		emps.stream()
		.filter((e) -> (e.getName().indexOf('s')>-1 || e.getName().startsWith("S")))
		.forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
		
		List<Employee> emps2 = 
				emps.stream()
				.filter((e) -> (e.getBasic()<50000.0))
				.collect(Collectors.toList());
		System.out.println(emps2);
		System.out.println("-----------------------------------------------");
		
		List<String> namesOnly = emps.stream().map((e) -> e.getName()).collect(Collectors.toList());
		System.out.println(namesOnly);
		
	}

}
