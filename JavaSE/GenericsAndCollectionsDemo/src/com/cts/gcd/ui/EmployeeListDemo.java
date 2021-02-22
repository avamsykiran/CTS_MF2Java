package com.cts.gcd.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.cts.gcd.model.Employee;
import com.cts.gcd.service.EmpJoinDateAndBasicComparator;
import com.cts.gcd.service.EmpJoinDateComparator;
import com.cts.gcd.service.EmpNameComparator;

public class EmployeeListDemo {

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
		
		//Collections.sort(emps);
		//Collections.sort(emps,new EmpNameComparator());
		Collections.sort(emps,new EmpJoinDateComparator());
		
		for(Employee e : emps) {
			System.out.println(e);
		}
		
		
	}

}
