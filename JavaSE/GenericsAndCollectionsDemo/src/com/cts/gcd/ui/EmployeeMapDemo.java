package com.cts.gcd.ui;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.cts.gcd.model.Employee;
import com.cts.gcd.service.EmpJoinDateComparator;

public class EmployeeMapDemo {

	public static void main(String[] args) {

		Map<Integer,Employee> emps = new TreeMap<>();
		
		emps.put(101,new Employee(101, "Vamsy", 59862.0, LocalDate.now(),false));		
		emps.put(110,new Employee(110, "Komal", 55862.0, LocalDate.now().minusMonths(1),false));
		emps.put(105,new Employee(105, "Zubar", 49862.0, LocalDate.now().minusMonths(2),false));
		emps.put(111,new Employee(111, "Praksah", 39862.0, LocalDate.now().minusMonths(1),false));
		emps.put(115,new Employee(115, "Amit", 29862.0, LocalDate.now().minusDays(1),false));
		emps.put(141,new Employee(141, "Arun", 59662.0, LocalDate.now().minusDays(10),false));
		emps.put(121,new Employee(121, "Vasu", 34862.0, LocalDate.now().minusDays(5),false));
		
		Set<Integer> empIds = emps.keySet();
		
		for(Integer empid : empIds) {
			System.out.println(emps.get(empid));
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("EmpId: ");
		int eid = scan.nextInt();
		
		if(emps.containsKey(eid)) {
			System.out.println(emps.get(eid));
		}else {
			System.out.println("NOT FOUND");
		}
		
		
		Map<String,Set<Employee>> empDeptWise = new TreeMap<>();
		
		empDeptWise.put("OPERATIONS",new TreeSet<Employee>());
		empDeptWise.put("DEV",new TreeSet<Employee>());
		empDeptWise.put("PROD",new TreeSet<Employee>());
		
		empDeptWise.get("OPERATIONS").add(new Employee(101, "Vamsy", 59862.0, LocalDate.now(),false));		
		empDeptWise.get("OPERATIONS").add(new Employee(110, "Komal", 55862.0, LocalDate.now().minusMonths(1),false));
		empDeptWise.get("OPERATIONS").add(new Employee(105, "Zubar", 49862.0, LocalDate.now().minusMonths(2),false));
		empDeptWise.get("DEV").add(new Employee(111, "Praksah", 39862.0, LocalDate.now().minusMonths(1),false));
		empDeptWise.get("DEV").add(new Employee(115, "Amit", 29862.0, LocalDate.now().minusDays(1),false));
		empDeptWise.get("PROD").add(new Employee(141, "Arun", 59662.0, LocalDate.now().minusDays(10),false));
		empDeptWise.get("PROD").add(new Employee(121, "Vasu", 34862.0, LocalDate.now().minusDays(5),false));
		
	}

}
