package pkg;

import java.sql.Statement;
import java.util.Scanner;

import pkg.operations.Read;
import pkg.services.Services;

public class OperationsDriver {

	static Scanner sc = new Scanner(System.in);
	public static void runOperations() throws InterruptedException{
		/*
		 * SETTING UP : 1. Driver 2. Connection || Returns : Statement type object
		 */
		Statement stmt = Services.setUp();

		Thread.sleep(1500);
		System.out.println("++++++++ Employee Database +++++++++");

		System.out.println("Choose which operation you want to do :");
		System.out.println("1. Insertion\n2. Updation\n3. Deletion\n4. Read");

		int operationChoice = sc.nextInt();
		System.out.println("You chose "+operationChoice);
		// INSERTION
		if (operationChoice == 1) {
			Operations.runInsertion(stmt,sc);
		}
		// UPDATION
		else if (operationChoice == 2) {
			Operations.runUpdation(stmt,sc);
		}
		// DELETION
		else if (operationChoice == 3) {
			Operations.runDeletion(stmt,sc);
		}
		else if (operationChoice == 4) {
			Read.getAllEmployees();
		}
		else {
			System.out.println("You have entered the wrong choice!");
		}
		Services.runAnotherOperation(sc);
		sc.close();
	}
}
