package CCC4;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rovarspraket {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<String> alphabet = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j" ,"k", "l", "m", "n", "o" ,"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
		List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
		
		String newText = "";
		
		for (char c : sc.nextLine().toCharArray()) {
			String letter = String.valueOf(c);
			
			//If Consonant
			if (vowels.indexOf(letter) == -1) {
				//First add the letter itself
				newText += letter;
				
				//Create variables to check which vowel is closer
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
					newText += leftVowel;
				} else {
					newText += rightVowel;
				}
				
//				Add Closest consonant next:
				if (!letter.equals("z")) {
					for (int i = alphabet.indexOf(letter) + 1; i < 26; i++) {
						if (vowels.indexOf(alphabet.get(i)) == -1) {
							newText += alphabet.get(i);
							break;
						}
					}
				} else {
					newText += "z";
				}
			} else { //If not a vowel
				newText += letter; //Add the vowel 
			}
		}
		System.out.println(newText);
	}
}
