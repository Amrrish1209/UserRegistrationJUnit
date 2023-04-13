package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrations {

	public boolean validateFirstName(String firstName) throws UserRegistrationException {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME,
					"Invalid first name");
		}
	}

	public boolean validateLastName(String lastName) throws UserRegistrationException {
		String regex = "^[A-Z][a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_LAST_NAME,
					"Invalid last name");
		}
	}

	public boolean validateEmail(String email) throws UserRegistrationException {
		String regex = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})*$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_EMAIL,
					"Invalid email address");
		}
	}

	public boolean validateMobile(String mobile) throws UserRegistrationException {
		String regex = "^\\d{2} [1-9]\\d{9}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(mobile);
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER,
					"Invalid mobile number");
		}
	}

	public boolean validatePassword(String password) throws UserRegistrationException {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			return true;
		} else {
			throw new UserRegistrationException(UserRegistrationException.ExceptionType.INVALID_PASSWORD,
					"Invalid password");
		}
	}
}
