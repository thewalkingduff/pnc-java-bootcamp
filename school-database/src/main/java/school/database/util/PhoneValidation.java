package school.database.util;


public class PhoneValidation {
//	public boolean isValidPhoneNumber(String phone) {
//		return false;
//	}
	public int isNineNumbers(String phone) {
		int count = 0;
		for(char c : phone.toCharArray()){
		  if(Character.isDigit(c))
		    count++;
		}
		return count;
	}

	public boolean hasInvalidCharacters(String string) {
		if(string.contains("-") || string.contains(".") || string.contains(" ")) {
			return false;
		}
		return true;
	}

	public boolean isNotNullOrEmpty(String string) {
		// TODO Auto-generated method stub
		if(string == null || string.isEmpty()) {
			return false;
		}
		return true;
	}

	public boolean beginsWith(String string) {
		// TODO Auto-generated method stub
		if(string.substring(0, 3).equals("555")) {
			return true;
		}
		return false;
	}
}
