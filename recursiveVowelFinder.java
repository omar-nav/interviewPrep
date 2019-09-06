package oswaldo;

public class recursiveVowelFinder {
	// function to check vowel
	static int isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println("is a vowel:  " + ch);
			return 1;
		} else {
			System.out.println("not a vowel:  " + ch);
			return 0;
		}
	}

	// to count total number of vowel from 0 to n 
	static int countVowels(String str, int n) {
		if (n==1) {
			System.out.println(str.charAt(n) + " had n == 1");
			return isVowel(str.charAt(n-1));
		} else {
			System.out.println("other letters are at different index " + str.charAt(n - 1));
			return countVowels(str, n-1)+isVowel(str.charAt(n-1));
		}
	}
	
	public static void main(String[] args) {
		// string object
		String str = "Jose";
		
		// total number of vowels
		System.out.println(str + " contains " + countVowels(str, str.length()) + " vowels");
			
	}
}
