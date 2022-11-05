package maincodes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Strings - Array Like Structures:
		// Substrings means "part of a string"
		// In java, we can access a character from a String using string.charAt();
		// or getting substrings using string.substring();
//				String name = "Harry Potter";
//				System.out.println(name.charAt(0));
//				System.out.println(name.charAt(1));

//				System.out.println(name.substring(3));
//				System.out.println(name.substring(0, 3));
//				System.out.println(name.substring(0, 100));

		// Using Length
//				System.out.println(name.length());

		// 2 Ways of looping through array of names
		// Normal For Loop needed the exact numbers of item in the array
		// Now we have length!

		// In-Class Exercise
		// Loop through characters in a string
//				for (char individualChar : name.toCharArray()) {
//					System.out.println(individualChar);
//				}
		// OR
//				for (int i = 0; i < name.length(); i++) {
//					System.out.println(name.charAt(i));
//				}

		// Find the index of a substring using .indexOf()
//				System.out.println(name.indexOf("Harry"));
//				System.out.println(name.indexOf("Potter"));
//				System.out.println(name.indexOf("r"));

		// If you search a substring that does not exist, indexOf returns -1
//				System.out.println(name.indexOf("notHarry"));

		// Replace a character in a string
		String myName = "Kenny";
		// We can print out a specific character
//				System.out.println(myName.charAt(2));
		// But can we switch it to something else?
		myName = myName.replace("n", "o");
		System.out.println(myName);

		// In-Class Exercise
		// Build a function that takes in an array of strings,
		// 1) process them, then print the result
		// 2) and return the new array
		//
		// Process needed:
		// - For each of the strings inside the array:
		// - Loop through the characters in the string,
		// - if the character is a vowel (a, e, i, o, u), change them to "o"
		//
		// Printing requirement:
		// - Print each processed string in a new line
		//
		// Return the array with the processed content

		// Hint1: You will need to nest loops
		// first layer of loop: loops through the array entries
		// second layer of loop: loops through the characters in the one of the array
		// entry

		// Hint2: To check if it is a vowel, just use if statement to compare to the 5
		// vowels

		// Hint3: The String[] from function argument (parameter)
		// We need to build a new string with the characters we are looping through
		// Example to build a new array and copy the old values through a loop
		String[] listOfStrings = new String[4];
		listOfStrings[0] = "Elsa";
		listOfStrings[1] = "Sissi";
		listOfStrings[2] = "Violet";
		listOfStrings[3] = "Zorina";

		// Testing finished Answer
		String[] testStringArray = { "hello", "world", "Harry", "Potter" };
//				String[] result = ProcessStrings(listOfStrings);
		String[] result2 = ProcessStrings(testStringArray);

		for (int i = 0; i < 26; i++) {
			System.out.println(Cipher("AIGSIA QIGVWCB AMHV IDROHS", i));
		}

	}

	// Answer
	// Method taking in an array of strings
	public static String[] ProcessStrings(String[] input) {
		for (String str : input) {
			str = str.replace("a", "o");
			str = str.replace("e", "o");
			str = str.replace("i", "o");
			str = str.replace("u", "o");
			// Print the string
			System.out.println(str);
		}
		// When all the loops are done, return the result input
		return input;
	}
	
	
	
	
	

	// In-Class 2 : Ceaser Cipher
	public static String Cipher(String input, int code) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String output = "";
		while (code < 0) {
			code += 26;
		}
		for (char c : input.toCharArray()) {
			boolean isUpper = false;
			if (c == Character.toUpperCase(c)) {
				isUpper = true;
			}
			c = Character.toLowerCase(c);
			char newChar;
			if (alphabet.indexOf(c) != -1) {
				int currentIndex = alphabet.indexOf(c);
				int newIndex = (currentIndex += code) % 26;
				newChar = alphabet.charAt(newIndex);
			} else {
				newChar = Character.toUpperCase(c);
			}
			if (isUpper) {
				newChar = Character.toUpperCase(newChar);
			}
			output += newChar;
		}
		return output;
	}

	/*
	 * Hints
	 * 
	 */
}
