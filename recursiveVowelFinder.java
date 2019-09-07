package oswaldo;

public class recursiveVowelFinder {
	// function to check vowel
	static int isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			// why is this return statement able to increment
			// an implicit variable
			// that seems elusive to capture
			return 1;
		} else {
			return 0;
		}
	}

	// to count total number of vowel from 0 to n 
	static int countVowels(String str, int n) {
		int isValue = 0;
		if (n==1) {
			System.out.println(str.charAt(n) + " had n == 1");
			return isVowel(str.charAt(n-1));
		} else {
			System.out.println("char at index " + n + ": " + str.charAt(n - 1));
			isValue += isVowel(str.charAt(n-1));
			System.out.println("isVowel " + isValue);
			return countVowels(str, n-1)+isVowel(str.charAt(n-1));
		}
	}
	
	public static void main(String[] args) {
		// string object
		String str = "Abcdefghio";
		
		// total number of vowels
		System.out.println(str + " contains " + countVowels(str, str.length()) + " vowels");
			
	}
}