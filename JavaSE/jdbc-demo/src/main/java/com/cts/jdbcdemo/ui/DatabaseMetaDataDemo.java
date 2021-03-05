package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseMetaDataDemo {

	public static void main(String[] args) {
		  
		try(Connection con = DriverManager
                  .getConnection("jdbc:mysql://localhost:3306/empdb","root","root");){
			
			DatabaseMetaData md = con.getMetaData();
			
			System.out.println(md.getDatabaseProductName());
			System.out.println(md.getDatabaseProductVersion());
			System.out.println(md.getDriverName());
			System.out.println(md.getDriverVersion());
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
