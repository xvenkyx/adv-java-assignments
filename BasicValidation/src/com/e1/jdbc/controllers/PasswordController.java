package com.e1.jdbc.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.e1.jdbc.services.Services;

public class PasswordController {

	public static boolean validatePassword(String email, String password) {
		Connection conn = Services.establishConnection();
		try {
			PreparedStatement statement = conn.prepareStatement("SELECT password FROM student WHERE email=?");
			statement.setString(1, email);
			ResultSet result = statement.executeQuery();
			result.next();
			if(result.getString("password").equals(password))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
