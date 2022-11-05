package main;

public class PalindromeRecur {

	public static String sentence1 = "A Santa lived as a devil at NASA";
	public static String sentence2 = "Flo, gin is a sin! I golf.";
	public static String sentence3 = "Eva, can I stab bats in a cave?";
	
	public static void main(String[] args) {
		String purifiedString = Purify(sentence2);
		System.out.println(IsPalindrome(purifiedString, 0, purifiedString.length() - 1));
	}

	public static String Purify(String s) {
		String result = s.replaceAll("[^\\w]", "");
		result = result.toLowerCase();
		return result;
	}
	
	public static boolean IsPalindrome(String s, int startIndex, int endIndex) {
		if (endIndex - startIndex <= 0) {
			return true;
		} else if (s.toCharArray()[startIndex] == s.toCharArray()[endIndex]) {
			return IsPalindrome(s, startIndex + 1, endIndex - 1);
		} else {
			return false;
		}
	}
}
