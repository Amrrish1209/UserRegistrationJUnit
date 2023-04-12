package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public static void main(String[] args) {

		String passwordRegex = ".{8,}";
		System.out.println("Enter the password: ");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();

		Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = pattern.matcher(password);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern Match");
		} else {
			System.out.println("Pattern not Match");
		}

		sc.close();
	}
}