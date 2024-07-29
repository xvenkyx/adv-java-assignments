package pkg.operations;

import java.util.Scanner;

import pkg.Employee;

public class Insertion {

	private static Employee generateEmployee(Scanner sc) {
		// Scanner s = new Scanner(System.in);
		System.out.println("+++++ Enter Employee Details +++++");
		System.out.println("ID : ");
		int id = sc.nextInt();
		System.out.println("NAME : ");
		String name = sc.next();
		System.out.println("EMAIL : ");
		String email = sc.next();
		System.out.println("PASSWORD : ");
		String password = sc.next();
		Employee employee = new Employee(id, name, email, password);
		return employee;
	}

	public static String generateInsertionQuery(Scanner sc){
		Employee emp = generateEmployee(sc);
		String query = "INSERT INTO emp VALUES ("+emp.getId()+",'"+emp.getName()+"','"+emp.getEmail()+"','"+emp.getPassword()+"')";
		System.out.println("Inserting details for "+emp.getName());
		return query;
	}
}
