package com.cts.iod.ui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.cts.iod.model.Employee;

public class ReadingEmployeeList {
	
	public static void main(String ...a) {
		
		final String DATA_FILE_NAME="./emps.data";

		try(ObjectInputStream fin = new ObjectInputStream(new FileInputStream(DATA_FILE_NAME))){
			
			List<Employee> data = (List<Employee>) fin.readObject();
			
			data.stream().forEach(System.out::println);
						
		} catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

}
