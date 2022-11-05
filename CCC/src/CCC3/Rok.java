package CCC3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rok {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<String> alphabet = Arrays.asList("a", "b", "c" ,"d", "e", "f", "g", "h", "i", "j" ,"k", "l" ,"m", "n", "o", "p", "q" ,"r", "s", "t", "u", "v", "w", "x", "y" ,"z");
	
	static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
	
	static String result = "";
	
	public static void main(String[] args) {
		
		for (char c : sc.nextLine().toCharArray()) {
			String letter = String.valueOf(c);
			if (vowels.indexOf(letter) == -1) {
				//First Letter
				result += letter;
				
				//Second part - closest vowel
				int leftDiff = 99;
				int rightDiff = 99;
				String rightVowel = "";
				String leftVowel = "";
				
				//Right Vowel:
				for (int i = alphabet.indexOf(letter) + 1; i < 26; i++) {
					if (vowels.indexOf(alphabet.get(i)) != -1) {
						rightVowel = alphabet.get(i);
						rightDiff = i - alphabet.indexOf(letter);
						break;
					}
				}
				
				//Left Vowel:
				for (int i = alphabet.indexOf(letter) - 1; i > -1; i--) {
					if (vowels.indexOf(alphabet.get(i)) != -1) {
						leftVowel = alphabet.get(i);
						leftDiff = alphabet.indexOf(letter) - i;
						break;
					}
				}
				
				//Apply the result and add the vowel
				if (leftDiff <= rightDiff) {
					result += leftVowel;
				} else {
					result += rightVowel;
				}
				
				//Add Closest Consonant next:
				if (!letter.equals("z")) {
					for (int i = alphabet.indexOf(letter) + 1; i < 26; i++) {
						if (vowels.indexOf(alphabet.get(i)) == -1) {
							result += alphabet.get(i);
							break;
						}
					}
				} else {
					result += "z";
				}
			} else {
				result += letter;
			}
		}
		System.out.println(result);
	}
}
