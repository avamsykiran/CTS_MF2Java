package com.cts.gcd.service;

import java.util.Comparator;

import com.cts.gcd.model.Employee;

public class EmpJoinDateAndBasicComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		int result = o1.getHireDate().compareTo(o2.getHireDate());
		
		if(result==0) {
			result = o1.getBasic()==o2.getBasic()?0:o1.getBasic()>o2.getBasic()?1:-1;
		}
		
		return result;
	}

}
