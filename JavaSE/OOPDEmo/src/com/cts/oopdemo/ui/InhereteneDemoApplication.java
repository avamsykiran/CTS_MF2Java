package com.cts.oopdemo.ui;

import com.cts.oopdemo.model.Director;
import com.cts.oopdemo.model.Employee;
import com.cts.oopdemo.model.Manager;

public class InhereteneDemoApplication {

	public static void main(String[] args) {

		Employee emp = new Employee(101,"Vamsy",2530.0);
		Manager mangr = new Manager(102,"Kiran",3530.0,552.0);
		Director director = new Director(103,"Gaurav",9560.0,952.0,0.25);
				
		System.out.println(emp);
		System.out.println(mangr);
		System.out.println(director);
	}

}
