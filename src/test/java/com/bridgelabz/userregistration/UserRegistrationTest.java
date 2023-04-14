package com.bridgelabz.userregistration;

import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationTest {

	private String emailAddress;
	private boolean expectedResult;
	private UserRegistrations userRegistration;

	public UserRegistrationTest(String emailAddress, boolean expectedResult) {
		super();
		this.emailAddress = emailAddress;
		this.expectedResult = expectedResult;
	}

	@Before
	public void initialize() {
		userRegistration = new UserRegistrations();
	}

	@Parameterized.Parameters
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", false }, { "abc", false }, { "abc@.com.my", true }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", true }, { ".abc@abc.com", true },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", true },
				{ "abc.@gmail.com", true }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false } });
	}

	@Test
	public void testEmail() {
		boolean actualResult = userRegistration.validate(emailAddress);
		assertTrue(emailAddress, actualResult == expectedResult);
	}
}