package com.cts.ecrud.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cts.ecrud.dao.EmployeeDao;
import com.cts.ecrud.dao.EmployeeDaoFileSystemImpl;
import com.cts.ecrud.dao.EmployeeDaoJdbcImpl;
import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao empDao = null;

	public EmployeeServiceImpl() {
		
	}
	
	public EmployeeServiceImpl(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	private boolean isValidEmpId(int empId) {
		return empId > 0;
	}

	private boolean isDuplicateEmpId(int empId) throws EmployeeProcessingException {
		return empDao.existsByEmpId(empId);
	}

	private boolean isValidEmpName(String name) {
		return name != null && !name.isEmpty() && name.length() >= 5;
	}

	private boolean isValidBasic(double basic) {
		return basic > 0;
	}

	private boolean isValidHireDate(LocalDate hiredate) {
		return hiredate != null && (hiredate.isBefore(LocalDate.now()) || hiredate.equals(LocalDate.now()));
	}

	@Override
	public boolean isValid(Employee emp) throws EmployeeProcessingException {
		List<String> errMsg = new ArrayList<String>();

		if (emp == null) {
			errMsg.add("No employee details received");
		} else {
			if (!isValidEmpId(emp.getEmpId())) {
				errMsg.add("Employee Id can not be negative!");
			}
			if (!isValidEmpName(emp.getName())) {
				errMsg.add("Employee Name is mandate and should be of atleast 5 chars");
			}
			if (!isValidBasic(emp.getBasic())) {
				errMsg.add("Basic is mandate and should be a non-negative value");
			}
			if (!isValidHireDate(emp.getHireDate())) {
				errMsg.add("HireDate is mandate and should be a past or current date .");
			}
		}

		if (!errMsg.isEmpty()) {
			throw new EmployeeProcessingException(errMsg.toString());
		}

		return errMsg.isEmpty();
	}

	private void computeSalaryFields(Employee emp) {
		emp.setHra(emp.getBasic() * 0.10);
		emp.setTa(emp.getBasic() * 0.20);
		emp.setNetpay(emp.getBasic() + emp.getHra() + emp.getTa());
	}

	@Override
	public List<Employee> getAll() throws EmployeeProcessingException {
		return empDao.getAll();
	}

	@Override
	public Employee getById(int id) throws EmployeeProcessingException {
		return empDao.getById(id);
	}

	@Override
	public Employee add(Employee emp) throws EmployeeProcessingException {
		if (isValid(emp)) {
			if (!isDuplicateEmpId(emp.getEmpId())) {
				computeSalaryFields(emp);
				empDao.add(emp);
			} else {
				throw new EmployeeProcessingException("The empId already exists");
			}
		}
		return emp;
	}

	@Override
	public Employee modify(Employee emp) throws EmployeeProcessingException {
		if (isValid(emp)) {
			computeSalaryFields(emp);
			empDao.modify(emp);
		}
		return emp;
	}

	@Override
	public void delete(int id) throws EmployeeProcessingException {
		empDao.delete(id);
	}

}
