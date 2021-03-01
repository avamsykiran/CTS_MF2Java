package com.cts.ecrud.service;

import java.util.List;

import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;

public interface EmployeeService {
	boolean isValid(Employee emp) throws EmployeeProcessingException;
	List<Employee> getAll() throws EmployeeProcessingException;
	Employee getById(int id) throws EmployeeProcessingException;
	Employee add(Employee emp) throws EmployeeProcessingException;
	Employee modify(Employee emp) throws EmployeeProcessingException;
	void delete(int id) throws EmployeeProcessingException;
}