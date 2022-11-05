package maincodes;

public class PalindromeSolution {

	public static String sentence1 = "A Santa lived as a devil at NASA";
	public static String sentence2 = "Flo, gin is a sin! I golf.";
	public static String sentence3 = "Eva, can I stab bats in a cave?";
	
	public static void main(String[] args) {
		
	/*
	 * 1)
	 * Functions to strip all the symbols and blanks and  turn all of the letters to lower case. 
	 * Takes in a String  return a String
	 */
	System.out.println(
			
			isPalindrome(
					Purify(sentence1), 
					0, 
					Purify(sentence1).length()-1
					)
			
			);
	}
	
	public static boolean isPalindrome(String s, int first, int last) {
		if (last - first <= 0) {
			return true;
		} else if (s.toCharArray()[first] == s.toCharArray()[last] &&
				isPalindrome(s, first + 1, last - 1)) {
			return true;
		} else {
			return false;	
		}
		
	}
	
	public static String Purify(String s) {
		return s.replaceAll("[^a-zA-Z]", "").toLowerCase();
	}
	
	//s : ABCBA
	
	// True If : A = A && B = B && C
	// True If : s[0] = s[4]  && s[1] = s[3]  &&  s[2]
	// True If : s[first] = s[last] && s[first+1] == s[last-1] && s[middle]
	
//	abcba = true
//	AbcBa = true
	
//	Hint: To determine if it is the middle letter, or no middle letter
//		  Try (last - first) 
	
	
	

}
