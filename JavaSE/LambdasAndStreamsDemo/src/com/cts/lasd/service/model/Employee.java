package com.cts.lasd.service.model;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String name;
	private double basic;
	private LocalDate hireDate;
	private boolean usingOfficeCommute;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, double basic, LocalDate hireDate, boolean usingOfficeCommute) {
		super();
		this.empId = empId;
		this.name = name;
		this.basic = basic;
		this.hireDate = hireDate;
		this.usingOfficeCommute = usingOfficeCommute;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public boolean isUsingOfficeCommute() {
		return usingOfficeCommute;
	}

	public void setUsingOfficeCommute(boolean usingOfficeCommute) {
		this.usingOfficeCommute = usingOfficeCommute;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", basic=" + basic + ", hireDate=" + hireDate
				+ ", usingOfficeCommute=" + usingOfficeCommute + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basic);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + empId;
		result = prime * result + ((hireDate == null) ? 0 : hireDate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (usingOfficeCommute ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (Double.doubleToLongBits(basic) != Double.doubleToLongBits(other.basic))
			return false;
		if (empId != other.empId)
			return false;
		if (hireDate == null) {
			if (other.hireDate != null)
				return false;
		} else if (!hireDate.equals(other.hireDate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (usingOfficeCommute != other.usingOfficeCommute)
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {		
		return this.empId==o.empId?0:this.empId>o.empId?1:-1;
	}
	
	
}
