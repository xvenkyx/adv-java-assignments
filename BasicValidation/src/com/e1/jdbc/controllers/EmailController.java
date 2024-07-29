package com.e1.jdbc.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.e1.jdbc.services.Services;

public class EmailController {

	public static boolean validateEmail(String email) {
		Connection conn = Services.establishConnection();
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT * FROM student WHERE email=?");
			statement.setString(1, email);
			ResultSet result = statement.executeQuery();
			return result.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
