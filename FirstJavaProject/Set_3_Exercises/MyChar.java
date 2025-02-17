package Set_3_Exercises;

public class MyChar {

	// Method to determine if a character is a vowel
	public boolean isVowel(char ch) {

		// Use a switch statement to check for each vowel, both lowercase and uppercase
		switch (ch) {
		case 'a', 'e', 'i', 'o', 'u':
		case 'A', 'E', 'I', 'O', 'U':
			return true;

		default:
			return false;

		}

	}
}