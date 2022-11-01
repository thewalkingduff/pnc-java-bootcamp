package school.database.util;

import org.apache.commons.lang3.StringUtils;

public class EmailValidation {

	public boolean isValidEmail(String email) {
		if (email == null || email.equals("") || !email.contains("@")) {
			return false;
		} 

		String before = email.substring(0, email.indexOf("@"));
		if (!StringUtils.isAlphanumeric(before)) {
			return false;
		}
		
		String end = email.substring(email.lastIndexOf(".") + 1 );
		if ( ! StringUtils.isAlpha(end)) {
			return false;
		}
		
		if ( end.length() != 3 ) {
			return false;
		}
		
		return true;
	}
}

