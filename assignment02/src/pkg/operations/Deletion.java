package pkg.operations;

import java.util.Scanner;

import pkg.Employee;
import pkg.services.Services;

public class Deletion {
	private static Employee emp;

	public static String generateDeletionQuery(Scanner sc) {
		String query = "";
		System.out.println("Privide detail for Deletion :");
		System.out.println("ID :");
		int id = sc.nextInt();
		if (Services.validateId(id)) {
			emp = Services.findEmployeeById(id);
			query = "DELETE FROM emp WHERE id=" + emp.getId();
		}
		return query;
	}
}
