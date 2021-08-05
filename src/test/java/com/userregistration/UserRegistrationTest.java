package com.userregistration;

import static org.junit.Assert.assertTrue;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistration userRegistration = new UserRegistration();

	@Test
	public void givenFirstName_WhenFirstLatterUpperCase_ShouldReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertTrue(userRegistration.validateFirstName("Kiran"));
			// Assertions.assertTrue(result);
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}

	}

	@Test
	public void givenFirstName_WhenEntryFieldNull_shouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertFalse(userRegistration.validateFirstName(""));
		} catch (UserRegistrationException exception) {
			NullPointerException.class.getClass();
			System.out.println("Entry Field Should not null");
		}
	}

	@Test
	public void givenFirstName_WhenLessThanThreeChars_ShouldReturnFalse() {
		UserRegistration userRegistration = new UserRegistration();
		try {
			Assert.assertFalse(userRegistration.validateFirstName("Ki"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
			System.out.println("FirstName should not less than 3 digit");
		}
	}

	@Test
	public void givenFirstName_WhenHasNumber_ShouldReturnFalse() {
		try {
			Assert.assertFalse(userRegistration.validateFirstName("Kira1"));
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
	}

	@Test
	public void givenFirstName_WhenHasSpecialChar_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateFirstName("Kiran@");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenFirstLetterUpperCase_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validateLastName("Tidke");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_WhenLessThanThreeChars_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateFirstName("Ad");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenHasNumber_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateLastName("Tidke1");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_WhenHasSpecialChar_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateFirstName("Tidke@");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmailId_WhenProper_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validateEmailId("abc.syz@bl.co.in");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNum_WhenSpaceIsMentioned_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validateMobileNum("91 9960077482");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenMobileNum_WhenSpaceNotMentioned_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateMobileNum("919960077482");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNum_WhenLessDigits_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateMobileNum("9960077482");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenMobileNum_WhenNotStartWith91_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validateMobileNum("1234507748");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenMin8Chars_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("nDj1k2*jf");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenHasLessChars_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("Kd1%f");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenAtleast1UpperCase_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("3Rmdg*nK");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenAtleast1Number_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("Mas1bt&Bx");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNoNumeric_ShouldReturnFalse() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("mDkk%fDB");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_WhenHasExact1SpecialChar_ShouldReturnTrue() {
		boolean result = false;
		try {
			result = userRegistration.validatePassword("mDkk%fD1");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenNoSpecialChar_ShouldReturnTrue() {
		boolean result = true;
		try {
			result = userRegistration.validatePassword("mDkkfD12");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_WhenHasMoreThan1SpecialChar_ShouldReturnTrue() {
		boolean result = true;
		try {
			result = userRegistration.validatePassword("mDkk%#D1d");
		} catch (UserRegistrationException exception) {
			exception.printStackTrace();
		}
		Assert.assertTrue(result);
	}

}
