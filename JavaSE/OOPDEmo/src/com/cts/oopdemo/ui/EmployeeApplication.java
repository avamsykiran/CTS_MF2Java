package com.cts.oopdemo.ui;

import com.cts.oopdemo.model.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		Employee e1;			//declaration
		e1= new Employee();		//allocation
		
		e1.setEmpId(101);			//assignments
		e1.setFullName("Vamsy");
		e1.setBasic(45200.0);
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setFullName("Kiran");
		e2.setBasic(45200.0);
		
	}

}
