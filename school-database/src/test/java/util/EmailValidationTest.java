package util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import school.database.util.EmailValidation;

public class EmailValidationTest {

	@ParameterizedTest
	@ValueSource(strings = { "", "ericseriesreminder.com", "er#ic@seriesreminder.com", "eric@seriesreminder.co" })
	public void isEmailInvalidTest(String string) {
		EmailValidation ev = new EmailValidation();
		Assertions.assertFalse(ev.isValidEmail(string));
		Assertions.assertFalse(ev.isValidEmail(null));
		Assertions.assertTrue(ev.isValidEmail("eric@seriesreminder.com"));
	}

//	@Test
//	public void isEmailValidTest() {
//		EmailValidation ev = new EmailValidation();
//
//		
//	}
}

//package school.database.util;
//
//
//import static org.junit.Assert.assertFalse;
//import static org.junit.Assert.assertTrue;
//
//import org.junit.*;
//
//import school.database.util.EmailValidation;
//
//public class EmailValidationTest {
//	
//	EmailValidationTest email;
//	
//	@Before
//	public void setUp() {
//		email = new EmailValidationTest();
//	}
//	
//	@Test
//	public void testEmailForAtSign() {
//		assertTrue(email.isEmailValidTest("beavis@gmail.com"));
//	}
//	
//	// // has only letters or numbers before the @ sign
//	@Test
//	public void testEmailOnlyLettersNumbers() {
//		assertFalse(email.isValidEmail("taco!@yahoo.com"));
//	}
//	
//	
//}
