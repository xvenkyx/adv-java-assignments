package com.e1.jdbc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.e1.jdbc.Login;

public class Services {

	public static Connection establishConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/first_jdbc","root","root");	
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static void reRun(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("Try Again ? [yes/no]");
		if(sc.nextLine().equalsIgnoreCase("yes"))
			Login.run();			
	}
}
