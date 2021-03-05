package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DMLDemo {

	public static void main(String[] args) {

		final String qry = "insert into depts(deptno,dname) values(?,?)";

		try (Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
				PreparedStatement pst = con.prepareStatement(qry);) {

			System.out.print("DeptNo? ");
			int deptno = scan.nextInt();
			System.out.print("DeptName? ");
			String dname = scan.next();
			
			pst.setInt(1, deptno);
			pst.setString(2, dname);
			
			int count =  pst.executeUpdate();
			System.out.println(count + " record(s) inserted");
			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}
