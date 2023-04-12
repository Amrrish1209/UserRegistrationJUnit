package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public static void main(String[] args) {

		// ^->beginning of the string,A-Z->first character should be upper
		// case,a-zA-Z->any alphabetical character,{2,}->max of 3 character,$->end of
		// the string
		String firstNameRegex = "^[A-Z][a-zA-Z]{2,}$";
		System.out.println("Enter the FirstName: ");
		Scanner sc = new Scanner(System.in);
		String firstName = sc.nextLine();

		Pattern pattern = Pattern.compile(firstNameRegex);
		Matcher matcher = pattern.matcher(firstName);
		boolean result = matcher.matches();

		if (result) {
			System.out.println("Pattern Match");
		} else {
			System.out.println("Pattern not Match");
		}
		sc.close();
	}
}
