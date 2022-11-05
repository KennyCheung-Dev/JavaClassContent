package maincodes;

public class Palindrome {
	public static String sentence1 = "A Santa lived as a devil at NASA";
	public static String sentence2 = "Flo, gin is a sin! I golf.";
	public static String sentence3 = "Eva, can I stab bats in a cave?";
	// 2 Parts Questions - Determine if a sentence is a palindrome
	
	// 1) 
	// Helper functions setup:
	// StripBlanks(String s)
	// StripPunctuation(String s)
	// LowerCase(String s)
	
	// 2) 
	// boolean isPalindrome(String s, int startIndex, int endIndex) 
	// Return true if sentence is a palindrome
	
	public static void main(String[] args) {
		//Purify the sentence
		String purifiedSentence1 = Purify(sentence1);
		String purifiedSentence2 = Purify(sentence2);
		String purifiedSentence3 = Purify(sentence3);
		System.out.println(isPalindrome(purifiedSentence1, 0, purifiedSentence1.length() - 1));
		System.out.println(isPalindrome(purifiedSentence2, 0, purifiedSentence2.length() - 1));
		System.out.println(isPalindrome(purifiedSentence3, 0, purifiedSentence3.length() - 1));
	}
	
	public static String Purify(String s) {
		return s.replaceAll("[^a-zA-z]", "").toLowerCase();
	}
	
	public static boolean isPalindrome(String s, int startIndex, int endIndex) {
		if (endIndex - startIndex <= 0) {
			return true;
		} else if (s.toCharArray()[startIndex] == s.toCharArray()[endIndex] && 
				isPalindrome(s, startIndex + 1, endIndex - 1)){
			return true;
		} else {
			return false;
		}
	}
}
