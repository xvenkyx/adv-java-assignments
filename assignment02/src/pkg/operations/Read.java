package pkg.operations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import pkg.services.Services;

public class Read {

	public static void getAllEmployees() {
		System.out.println("++++++++++ EMPLOYEES ++++++++++");
		Statement stmt = Services.setUp();
		String query = "SELECT * FROM emp";
		int count = 0;
		try {
			ResultSet result = stmt.executeQuery(query);
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				String email = result.getString("email");
				System.out.println(id+". "+name+" ("+email+")");
				count++;
			}
			System.out.println("Total employees = "+ count);
			System.out.println("+++++++++++++++++++++++++++++++");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
