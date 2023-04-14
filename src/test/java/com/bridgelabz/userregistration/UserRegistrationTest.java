package com.bridgelabz.userregistration;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegistrationTest {

	UserRegistrations validator = new UserRegistrations();

	@Test
	public void givenFirstName_WhenValid_ShouldReturnTrue() {
		assertTrue(validator.validateFirstName.test("John"));
	}

	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		assertFalse(validator.validateFirstName.test("J"));
	}

	@Test
	public void givenLastName_WhenValid_ShouldReturnTrue() {
		assertTrue(validator.validateLastName.test("Doe"));
	}

	@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		assertFalse(validator.validateLastName.test("D"));
	}

	@Test
	public void givenEmail_WhenValid_ShouldReturnTrue() {
		assertTrue(validator.validateEmail.test("john.doe@gmail.com"));
	}

	@Test
	public void givenEmail_WhenNotValid_ShouldReturnFalse() {
		assertFalse(validator.validateEmail.test("johndoe.gmail.com"));
	}

	@Test
	public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
		assertTrue(validator.validateMobile.test("91 9876543210"));
	}

	@Test
	public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
		assertFalse(validator.validateMobile.test("09876543210"));
	}

	@Test
	public void givenPassword_WhenValid_ShouldReturnTrue() {
		assertTrue(validator.validatePassword.test("Passw0rd@"));
	}

	@Test
	public void givenPassword_WhenNotValid_ShouldReturnFalse() {
		assertFalse(validator.validatePassword.test("password"));
	}
}
