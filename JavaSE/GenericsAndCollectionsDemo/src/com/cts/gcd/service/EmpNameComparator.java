package com.cts.gcd.service;

import java.util.Comparator;

import com.cts.gcd.model.Employee;

public class EmpNameComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
