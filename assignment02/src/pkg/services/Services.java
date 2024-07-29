package pkg.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pkg.Employee;
import pkg.OperationsDriver;

public class Services {

	public static boolean validateId(int id) {
		Statement stmt = Services.setUp();
		String query = "SELECT * FROM emp WHERE id=" + id;
		try {
			ResultSet result = stmt.executeQuery(query);
			if (result.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static Employee findEmployeeById(int id) {
		Statement stmt = Services.setUp();
		Employee emp = new Employee();
		String query = "SELECT * FROM emp WHERE id=" + id;
		try {
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				emp.setId(id);
				emp.setName(result.getString("name"));
				emp.setEmail(result.getString("email"));
				emp.setPassword(result.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}

	public static Statement setUp() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment02", "root", "root");
			return conn.createStatement();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void runAnotherOperation(Scanner sc) throws InterruptedException {
		System.out.println("Want to run another operation ?");
		String ch = sc.next();
		if (ch.equals("yes")) {
			OperationsDriver.runOperations();
		} else if (ch.equals("no")) {
			System.out.println("Thank you");
//			sc.close();
		}
//		sc.close();
	}
}
