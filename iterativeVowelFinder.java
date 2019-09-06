package oswaldo;

public class iterativeVowelFinder {

	// function to check vowel
	static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
	}

	// returns count of vowels in str
	static int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			// check for vowel
			if (isVowel(str.charAt(i))) {
				++count;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// string object
		String str = "julio";

		// total number of vowel
		System.out.println(str + " contains " + countVowels(str) + " vowels");

	}
}
