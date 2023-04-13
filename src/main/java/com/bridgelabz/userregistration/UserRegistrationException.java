package com.bridgelabz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationException extends Exception {

	enum ExceptionType {
		INVALID_FIRST_NAME, INVALID_LAST_NAME, INVALID_EMAIL, INVALID_MOBILE_NUMBER, INVALID_PASSWORD
	}

	ExceptionType type;

	public UserRegistrationException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}