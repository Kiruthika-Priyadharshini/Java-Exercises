package Set_8_Exercises;

public class MyString {

	public String str;

	public MyString(String str) {
		this.str = str;
	}

	public boolean isHexadecimalChar(char ch) {
		return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
		// Write your code here
	}

	public boolean isHexadecimal() {
		if (str == null || str.equals("")) {
			return false;
		}

		for (char ch : str.toCharArray()) {
			if (!isHexadecimalChar(ch) && !Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
		// Write your code here
	}

}
