package pkg.operations;

import java.util.Scanner;

import pkg.Employee;
import pkg.services.Services;

public class Updation {

	private static Employee emp;

	public static String generateUpdationQuery(Scanner sc) {
		System.out.println("Provide detail for Updation :\nID : ");
		int id = sc.nextInt();
		if(Services.validateId(id)) {
			emp = Services.findEmployeeById(id);
			System.out.println("What do you want to update ?\n1. Name\n2. Email\n3. Password");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Enter the name : ");
				String name = sc.next();
				String query = "UPDATE emp SET name = '"+name+"' WHERE (id = "+emp.getId()+")";
				return query;
			}
			else if (choice == 2) {
				System.out.println("Enter the email : ");
				String email = sc.next();
				String query = "UPDATE emp SET email = '"+email+"' WHERE (id = "+emp.getId()+")";
				return query;
			}
			else if (choice == 3) {
				System.out.println("Enter the password : ");
				String password = sc.next();
				String query = "UPDATE emp SET password = '"+password+"' WHERE (id = "+emp.getId()+")";
				return query;
			} else {
				System.out.println("Invalid input");
			}
		}
		return null;
	}
}
