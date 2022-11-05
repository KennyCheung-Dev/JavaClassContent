package maincodes;
import java.util.Scanner;


public class CeasarsCipher {
	// Using Scanner for Getting Input from User 
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String msg = GetStringInput();
		int index = GetIntInput();
		System.out.println(Cipher(msg, index));
	}
	
	//Homework: To Handle Upper Case Characters Answer: 
//	public static String Cipher(String input, int code) {
//		String alphabet = "abcdefghijklmnopqrstuvwxyz";
//		String output = "";
//		
//	    //Loop through characters
//		for (char c : input.toCharArray()) {
//			
//			/* Handle for Upper/Lower Case*/
//			//boolean to store if the char is upper case
//			boolean isUpperCase = false;
//			//Check if the character is an Upper Case character or not
//			if (Character.toUpperCase(c) == c) {
//				isUpperCase = true;
//			}
//			//Always make it lower case
//			c = Character.toLowerCase(c);
//			
//			/* Encoding */
//			int currentIndex = alphabet.indexOf(c);
//			int newIndex = (currentIndex += code) % 26;
//			char newChar = alphabet.charAt(newIndex);
//			
//			/* Revert to Upper Case if applicable */
//			if (isUpperCase) newChar = Character.toUpperCase(newChar);
//			output += newChar;
//		}
//		
//		return output;
//	}
	
	/* Topic to handle still:
	 * - % 26
	 * - Index < 0
	 * - Symbol should not be encoded
	 * - User Input
	 * - User's Input validation
	 */
	
	// Final Code
	public static String Cipher(String input, int code) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String output = "";
		
		//Handle index < 0
		while (code < 0) {
			code += 26;
		}
		
		//Loop through characters
		for (char c : input.toCharArray()) {
			
			/* Handle for Upper/Lower Case*/
			//boolean to store if the char is upper case
			boolean isUpperCase = false;
			//Check if the character is an Upper Case character or not
			if (Character.toUpperCase(c) == c) {
				isUpperCase = true;
			}
			//Always make it lower case
			c = Character.toLowerCase(c);
			
			/* Encoding */
			Character newChar;
			//Check if the character exist in the alphabet
			if (alphabet.indexOf(c) != -1) {
				// IS in the alphabet
				int currentIndex = alphabet.indexOf(c);
				int newIndex = (currentIndex += code) % 26;
				newChar = alphabet.charAt(newIndex);
			} else {
				/// NOT in the alphabet
				newChar = c;
			}
			
			/* Revert to Upper Case if applicable */
			if (isUpperCase) newChar = Character.toUpperCase(newChar);
			output += newChar;
		}
		//Return
		return output;
	}
	
	public static String GetStringInput() {
		while (true) {
			System.out.println("Please enter a message for encoding:");
			String temp = in.nextLine();
			if (temp.isEmpty()) {
				System.out.println("Message is empty");
				continue; 
			}
			return temp;
		}
	}
	
	public static int GetIntInput() {
		while (true) {
			try {
				System.out.println("Please enter your encoding index:");
				int temp = in.nextInt();
				return temp;
			} catch (Exception e) {
				System.out.println("Input requires an integer!");
				in.nextLine();
			}
		}
	}
	
	
}























