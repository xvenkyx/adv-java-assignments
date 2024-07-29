package com.e1.jdbc;

import java.util.Scanner;

import com.e1.jdbc.controllers.EmailController;
import com.e1.jdbc.controllers.PasswordController;
import com.e1.jdbc.services.Services;

public class Login {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email :");
		String email = sc.nextLine();
		if (EmailController.validateEmail(email)) {
			System.out.println("Enter password :");
			String password = sc.nextLine();
			if (PasswordController.validatePassword(email, password))
				System.out.println("Welcome to home page");
			else {
				System.out.println("Invalid password");
				Services.reRun(sc);
			}
			
		} else {
			System.out.println("Invalid email");
			Services.reRun(sc);			
		}
		sc.close();
	}
}
