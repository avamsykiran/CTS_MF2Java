package com.cts.iod.ui;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cts.iod.model.Employee;

public class WriteEmployeeList {

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
		
		final String DATA_FILE_NAME="./emps.data";
		
		try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(DATA_FILE_NAME))){
			
			fout.writeObject(emps);
			System.out.println("Emps data written");
		}catch(IOException  exp) {
			System.out.println(exp.getMessage());
		}
	}

}
