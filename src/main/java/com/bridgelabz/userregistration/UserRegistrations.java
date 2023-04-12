package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public static void main(String[] args) {

		// ^->beginning of string,[0-9]{2}->exactly two numeric
		// number,[0-9][10]->exactly ten numeric numbers,$->end of string
		String mobileRegex = "^[0-9]{2} [0-9]{10}$";

		System.out.println("Enter the Mobile number: ");
		Scanner sc = new Scanner(System.in);
		String mobileNumber = sc.nextLine();

		Pattern pattern = Pattern.compile(mobileRegex);
		Matcher matcher = pattern.matcher(mobileNumber);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Valid mobile number");
		} else {
			System.out.println("Invalid mobile number");
		}
		sc.close();
	}
}