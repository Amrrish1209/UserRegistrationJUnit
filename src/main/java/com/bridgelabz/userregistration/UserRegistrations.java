package com.bridgelabz.userregistration;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrations {

	private static final String NAME_PATTERN = "^[A-Z][a-zA-Z]{2,}$";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})*$";
	private static final String MOBILE_PATTERN = "^\\d{2} [1-9]\\d{9}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";

	public Predicate<String> validateFirstName = firstName -> Pattern.compile(NAME_PATTERN).matcher(firstName).matches();
	public Predicate<String> validateLastName = lastName -> Pattern.compile(NAME_PATTERN).matcher(lastName).matches();
	public Predicate<String> validateEmail = email -> Pattern.compile(EMAIL_PATTERN).matcher(email).matches();
	public Predicate<String> validateMobile = mobile -> Pattern.compile(MOBILE_PATTERN).matcher(mobile).matches();
	public Predicate<String> validatePassword = password -> Pattern.compile(PASSWORD_PATTERN).matcher(password).matches();
}
