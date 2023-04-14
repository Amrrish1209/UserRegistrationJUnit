package com.bridgelabz.userregistration;

public class UserRegistrations {

	public boolean validate(String email) {
		String emailRegex = "^[\\w.-]+@[\\w.-]+\\.[A-Za-z]{2,}$";
		return email.matches(emailRegex) || email.matches("^[\\w.-]+@[\\w-]+\\.[A-Za-z]{2,}(\\+[\\w]*)?$");
	}

}