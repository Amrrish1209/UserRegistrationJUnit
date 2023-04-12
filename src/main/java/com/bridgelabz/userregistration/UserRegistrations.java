package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter password: ");
		String password = scanner.nextLine();

		String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Password is valid.");
		} else {
			System.out.println("Password is not valid.");
			System.out.println(
					"Password must contain minimum 8 characters, at least 1 uppercase letter, and at least 1 numeric digit.");
		}

		scanner.close();
	}
}