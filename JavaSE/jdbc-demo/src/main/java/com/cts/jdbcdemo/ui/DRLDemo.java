package com.cts.jdbcdemo.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DRLDemo {

	public static void main(String ...a) {
		
		final String qry = "SELECT deptno,dname from depts";
		
		try(Connection con = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
			PreparedStatement pst = con.prepareStatement(qry);
				){
			
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(
						rs.getInt(1) + "\t" + rs.getString(2)
						);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
