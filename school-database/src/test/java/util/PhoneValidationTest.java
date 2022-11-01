package util;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.Before;

import school.database.util.PhoneValidation;

import org.junit.*;

public class PhoneValidationTest {
	PhoneValidation phoneValidation;
	
	@Before
	public void setUp() {
		phoneValidation  = new PhoneValidation();
	}
	
	@Test
	public void isNineNumbersTest() {
		assertEquals(10, phoneValidation.isNineNumbers("919-200-1202"));
		assertEquals(10, phoneValidation.isNineNumbers("9192001202"));
		assertNotEquals(10, "349-3452");
		assertNotEquals(10, "turtle");
		assertNotEquals(10, "");
	}
	
	@Test
	public void hasInvalidCharactersTest() {
		assertTrue(phoneValidation.hasInvalidCharacters("845*432#143"));
		assertTrue(phoneValidation.hasInvalidCharacters("875?432!143"));
		assertFalse(phoneValidation.hasInvalidCharacters("845-432-1431"));
		assertFalse(phoneValidation.hasInvalidCharacters("845 432 1431"));
		assertFalse(phoneValidation.hasInvalidCharacters("845.432.1431"));
	}
	
	@Test
	public void isNotNullOrEmptyTest() {
		assertFalse(phoneValidation.isNotNullOrEmpty(null));
		assertFalse(phoneValidation.isNotNullOrEmpty(""));
		assertTrue(phoneValidation.isNotNullOrEmpty("cat"));
		assertTrue(phoneValidation.isNotNullOrEmpty("9384732"));
	}
	
	@Test
	public void beginsWithTest() {
		assertTrue(phoneValidation.beginsWith("555-430-2109"));
		assertFalse(phoneValidation.beginsWith("556-430-2109"));
		assertFalse(phoneValidation.beginsWith("5 5 5 -430-2109"));
	}
	
	

}
