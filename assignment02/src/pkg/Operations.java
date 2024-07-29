package pkg;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import pkg.operations.Deletion;
import pkg.operations.Insertion;
import pkg.operations.Read;
import pkg.operations.Updation;

public class Operations {

	public static void runInsertion(Statement stmt, Scanner sc) throws InterruptedException{
		String query = Insertion.generateInsertionQuery(sc);
		try {
			stmt.execute(query);
			System.out.println("Inserted successfully");
		} catch (SQLException e) {
			System.out.println("ID may already exists. \nWant to check the database ? [yes/no]");
			String ch = sc.next();
			if(ch.equals("yes"))
				Read.getAllEmployees();
		}
	}

	public static void runUpdation(Statement stmt, Scanner sc) throws InterruptedException {

		String query = Updation.generateUpdationQuery(sc);
		try {
			stmt.execute(query);
			System.out.println("Updated");
		} catch (SQLException e) {
			System.out.println("ID may not exist. \nWant to check the database ? [yes/no]");
			String ch = sc.next();
			if(ch.equals("yes"))
				Read.getAllEmployees();
		}
		
	}

	public static void runDeletion(Statement stmt, Scanner sc) throws InterruptedException{
		String query = Deletion.generateDeletionQuery(sc);
		try {
			stmt.execute(query);
			System.out.println("Deleted successfully");
		} catch (SQLException e) {
			System.out.println("ID may not exist. \nWant to check the database ? [yes/no]");
			String ch = sc.next();
			if(ch.equals("yes"))
				Read.getAllEmployees();
		}
	}

}
