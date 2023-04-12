package com.bridgelabz.userregistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest {

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateFirstName("John");
		assertTrue(result);
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateFirstName("J");
		assertFalse(result);
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateLastName("Doe");
		assertTrue(result);
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateLastName("D");
		assertFalse(result);
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateEmail("john.doe@gmail.com");
		assertTrue(result);
	}

	@Test
	public void givenEmail_WhenNotValid_ShouldReturnFalse() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateEmail("johndoe.gmail.com");
		assertFalse(result);
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateMobile("91 9876543210");
		assertTrue(result);
	}

	@Test
	public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validateMobile("09876543210");
		assertFalse(result);
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validatePassword("Passw0rd@");
		assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNotValid_ShouldReturnFalse() {
		UserRegistrations validator = new UserRegistrations();
		boolean result = validator.validatePassword("password");
		assertFalse(result);
	}

}
