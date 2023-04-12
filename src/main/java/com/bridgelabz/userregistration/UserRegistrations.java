package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public static void main(String[] args) {

		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		System.out.println("Enter the email: ");
		Scanner sc = new Scanner(System.in);
		String email = sc.nextLine();

		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(email);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern Match");
		} else {
			System.out.println("Pattern not Match");
		}
		sc.close();
	}
}