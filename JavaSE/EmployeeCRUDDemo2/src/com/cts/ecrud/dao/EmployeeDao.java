package com.cts.ecrud.dao;

import java.util.List;

import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;

public interface EmployeeDao {
	List<Employee> getAll() throws EmployeeProcessingException;
	Employee getById(int id) throws EmployeeProcessingException;
	Employee add(Employee emp) throws EmployeeProcessingException;
	Employee modify(Employee emp) throws EmployeeProcessingException;
	void delete(int id) throws EmployeeProcessingException;
	boolean existsByEmpId(int id) throws EmployeeProcessingException;
}
