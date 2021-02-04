package com.cts.oopdemo.ui;

import com.cts.oopdemo.model.Employee;

public class EmployeeApplication {

	public static void main(String[] args) {
		
		Employee e1;			//declaration
		e1= new Employee();		//allocation
		
		e1.setEmpId(101);			//assignments
		e1.setFullName("Vamsy");
		e1.setBasic(45200.0);
		
		System.out.println(e1.getEmpId() + "\t" + e1.getFullName()+"\t"+e1.getBasic());
		
		
		Employee e2 = new Employee();
		e2.setEmpId(102);
		e2.setFullName("Kiran");
		e2.setBasic(45200.0);
		
		System.out.println(e2.getEmpId() + "\t" + e2.getFullName()+"\t"+e2.getBasic());
		
		Employee e3 = new Employee(103,"Srinu",528000.0); //object initialization.
		System.out.println(e3.getEmpId() + "\t" + e3.getFullName()+"\t"+e3.getBasic());
		
		
		Employee e4 = new Employee(e2);
		
		//e4=e2; is not goind to create a copy of e2
		
		/*
		 * e4.setEmpId(e2.getEmpId()); e4.setFullName(e2.getFullName());
		 * e4.setBasic(e2.getBasic());
		 */		
		System.out.println(e4.getEmpId() + "\t" + e4.getFullName()+"\t"+e4.getBasic());
	}

}
