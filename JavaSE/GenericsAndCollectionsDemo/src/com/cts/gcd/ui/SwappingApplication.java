package com.cts.gcd.ui;

import java.time.LocalDate;

import com.cts.gcd.model.Employee;
import com.cts.gcd.service.Swapper;

public class SwappingApplication {

	public static void main(String ...args) {
		
		String s1 = "Hello";
		String s2="Hai";
		//Swapper<String> swapStr = new Swapper<>();
		//swapStr.swap(s1, s2);
		Swapper.<String>swap(s1, s2);
		
		Employee emp1 = new Employee(101,"Vamsy", 2654.0,LocalDate.now(), false);
		Employee emp2 = new Employee(102,"Vinay", 2254.0,LocalDate.now(), true);
		//Swapper<Employee> swapEmp = new Swapper<>();
		//swapEmp.swap(emp1, emp2);
		Swapper.<Employee>swap(emp1, emp2);
		
		int a=90;
		int b=40;
		//Swapper<Integer> swapInt = new Swapper<>();
		//swapInt.swap(a,b);
		Swapper.<Integer>swap(a, b);
	}
}
