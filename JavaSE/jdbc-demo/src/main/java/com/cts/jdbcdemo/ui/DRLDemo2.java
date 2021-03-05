package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DRLDemo2 {

	public static void main(String[] args) {

		final String qry = "SELECT deptno,dname from depts where deptno=?";

		try (Scanner scan = new Scanner(System.in);
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb", "root", "root");
				PreparedStatement pst = con.prepareStatement(qry);) {

			System.out.print("DeptNo? ");
			int deptno = scan.nextInt();
			
			pst.setInt(1, deptno);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
			}else {
				System.out.println("No such department");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}
