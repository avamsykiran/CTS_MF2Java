package com.cts.ecrud.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;

public class EmployeeDaoFileSystemImpl implements EmployeeDao{
	
	public static final String DATA_FILE_NAME = "./emps.data";
	
	private Map<Integer, Employee> emps;
	
	private void readData() throws EmployeeProcessingException {
		emps= new TreeMap<Integer, Employee>();
		
		File file = new File(DATA_FILE_NAME);
		if(file.exists()) {
			try(ObjectInputStream fin = new ObjectInputStream(new FileInputStream(file))){
				emps = (Map<Integer, Employee>)fin.readObject();
			} catch (IOException | ClassNotFoundException e) {
				//log the technical exception
				throw new EmployeeProcessingException("Unable to get data");
			}
		}
	}
	
	private void writeData() throws EmployeeProcessingException {
		try(ObjectOutputStream fout = new ObjectOutputStream(new FileOutputStream(DATA_FILE_NAME))){
			fout.writeObject(emps);
		} catch (IOException e) {
			//log the technical exception
			throw new EmployeeProcessingException("Unable to save data");
		}
	}

	@Override
	public List<Employee> getAll() throws EmployeeProcessingException {
		if(emps==null) {
			readData();
		}
		return emps.values().stream().collect(Collectors.toList());
	}

	@Override
	public Employee getById(int id) throws EmployeeProcessingException {
		if(emps==null) {
			readData();
		}
		return emps.get(id);
	}

	@Override
	public Employee add(Employee emp) throws EmployeeProcessingException {
		if(emps==null) {
			readData();
		}
		emps.put(emp.getEmpId(), emp);
		writeData();
		return emp;
	}

	@Override
	public Employee modify(Employee emp) throws EmployeeProcessingException {
		if(emps==null) {
			readData();
		}
		emps.replace(emp.getEmpId(), emp);
		writeData();
		return emp;
	}

	@Override
	public void delete(int id) throws EmployeeProcessingException {
		if(emps==null) {
			readData();
		}
		emps.remove(id);
		writeData();
	}

	@Override
	public boolean existsByEmpId(int id) throws EmployeeProcessingException {
		return emps.containsKey(id);
	}

}
