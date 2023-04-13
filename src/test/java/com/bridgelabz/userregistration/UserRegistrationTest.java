package com.bridgelabz.userregistration;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		try {
			boolean result = validator.validateFirstName("John");
			assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenShort_ShouldThrowException() {
		UserRegistrations validator = new UserRegistrations();
		try {
			validator.validateFirstName("J");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_FIRST_NAME, e.type);
		}
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		try {
			boolean result = validator.validateLastName("Doe");
			assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenLastName_WhenShort_ShouldThrowException() {
		UserRegistrations validator = new UserRegistrations();
		try {
			validator.validateLastName("D");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_LAST_NAME, e.type);
		}
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		try {
			boolean result = validator.validateEmail("john.doe@gmail.com");
			assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenEmail_WhenNotValid_ShouldThrowException() {
		UserRegistrations validator = new UserRegistrations();
		try {
			validator.validateEmail("johndoe.gmail.com");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_EMAIL, e.type);
		}
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		try {
			boolean result = validator.validateMobile("91 9876543210");
			assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenMobileNumber_WhenNotValid_ShouldThrowException() {
		UserRegistrations validator = new UserRegistrations();
		try {
			validator.validateMobile("09876543210");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_MOBILE_NUMBER, e.type);
		}
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		try {
			boolean result = validator.validatePassword("Passw0rd@");
			assertTrue(result);
		} catch (UserRegistrationException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void givenPassword_WhenNotValid_ShouldThrowException() {
		UserRegistrations validator = new UserRegistrations();
		try {
			validator.validatePassword("password");
		} catch (UserRegistrationException e) {
			assertEquals(UserRegistrationException.ExceptionType.INVALID_PASSWORD, e.type);
		}
	}
}
