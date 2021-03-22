package com.cts.ecrud.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import org.apache.log4j.Logger;

import com.cts.ecrud.exception.EmployeeProcessingException;
import com.cts.ecrud.model.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao{

	final String GET_ALL_QRY=
			"SELECT empid,ename,basic,hra,ta,netpay,hiredate,using_office_comute FROM emps";
	final String GET_BY_ID_QRY=
			"SELECT empid,ename,basic,hra,ta,netpay,hiredate,using_office_comute FROM emps WHERE empid=?";
	final String ADD_EMP_QRY=
			"INSERT INTO emps(empid,ename,basic,hra,ta,netpay,hiredate,using_office_comute) values(?,?,?,?,?,?,?,?)";
	final String MODIFY_EMP_QRY=
			"UPDATE TABLE emps SET ename=?,basic=?,hra=?,ta=?,netpay=?,hiredate=?,using_office_comute=? WHERE empid=?";
	final String DELETE_EMP_QRY=
			"DELETE FROM emps WHERE empid=?";
	final String EXISTS_BY_ID_QRY=
			"SELECt COUNT(*) FROM emps WHERE empid=?";
	
	Logger daoLogger;
	
	public EmployeeDaoJdbcImpl() {
		daoLogger = Logger.getLogger(EmployeeDaoJdbcImpl.class.getName());
	}
	
	private Employee mapRow(ResultSet rs) throws SQLException {
		daoLogger.debug("Record is being mapped");
		return new Employee(rs.getInt(1), rs.getString(2), rs.getDouble(3),
				rs.getDouble(4),rs.getDouble(5), rs.getDouble(6), 
				rs.getDate(7).toLocalDate(), rs.getBoolean(8));
	}
		
	@Override
	public List<Employee> getAll() throws EmployeeProcessingException {
		List<Employee> emps = new ArrayList<Employee>();
		
		try(
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(GET_ALL_QRY);				
				){
			daoLogger.info("Item are being retrived");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				emps.add(mapRow(rs));
			}
			daoLogger.info("Item are retrived successfully");
		} catch (SQLException e) {
			daoLogger.error(e);
			throw new EmployeeProcessingException(e.getMessage());
		}
		
		return emps;
	}

	@Override
	public Employee getById(int id) throws EmployeeProcessingException {
		Employee emp = null;
		try(
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(GET_BY_ID_QRY);				
				){
			
			daoLogger.info("An employee with id being retrive");
			pst.setInt(1, id);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				emp = mapRow(rs);
			}
			daoLogger.info("An employee retrived " + emp);
		} catch (SQLException e) {
			daoLogger.error(e);
			throw new EmployeeProcessingException(e.getMessage());
		}
		
		return emp;
	}

	@Override
	public Employee add(Employee emp) throws EmployeeProcessingException {
		if(emp!=null) {
			try(
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement pst = con.prepareStatement(ADD_EMP_QRY);				
					){
								

				pst.setInt(1, emp.getEmpId());
				pst.setString(2,emp.getName());
				pst.setDouble(3, emp.getBasic());
				pst.setDouble(4, emp.getHra());
				pst.setDouble(5, emp.getTa());
				pst.setDouble(6, emp.getNetpay());
				pst.setDate(7, Date.valueOf(emp.getHireDate()));
				pst.setBoolean(8, emp.isUsingOfficeCommute());
				
				pst.executeUpdate();
				
			} catch (SQLException e) {
				daoLogger.error(e);
				throw new EmployeeProcessingException(e.getMessage());
			}	
		}
		return emp;
	}

	@Override
	public Employee modify(Employee emp) throws EmployeeProcessingException {
		if(emp!=null) {
			try(
					Connection con = ConnectionFactory.getConnection();
					PreparedStatement pst = con.prepareStatement(MODIFY_EMP_QRY);				
					){
				pst.setString(1,emp.getName());
				pst.setDouble(2, emp.getBasic());
				pst.setDouble(3, emp.getHra());
				pst.setDouble(4, emp.getTa());
				pst.setDouble(5, emp.getNetpay());
				pst.setDate(6, Date.valueOf(emp.getHireDate()));
				pst.setBoolean(7, emp.isUsingOfficeCommute());
				pst.setInt(8, emp.getEmpId());
				
				pst.executeUpdate();
				
			} catch (SQLException e) {
				daoLogger.error(e);
				throw new EmployeeProcessingException(e.getMessage());
			}	
		}
		return emp;
	}

	@Override
	public void delete(int id) throws EmployeeProcessingException {
		try(
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(DELETE_EMP_QRY);				
				){
			
			pst.setInt(1, id);			
			pst.executeUpdate();
			
		} catch (SQLException e) {
			daoLogger.error(e);
			throw new EmployeeProcessingException(e.getMessage());
		}	
	}

	@Override
	public boolean existsByEmpId(int id) throws EmployeeProcessingException {
		boolean isFound=false;
		try(
				Connection con = ConnectionFactory.getConnection();
				PreparedStatement pst = con.prepareStatement(EXISTS_BY_ID_QRY);				
				){
			
			pst.setInt(1, id);			
			
			ResultSet rs = pst.executeQuery();
			
			isFound = rs.next() && rs.getInt(1)>0;
			
		} catch (SQLException e) {
			daoLogger.error(e);
			throw new EmployeeProcessingException(e.getMessage());
		}	
		return isFound;
	}

}
