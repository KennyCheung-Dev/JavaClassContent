package maincodes;

public class Main {

	public static void main(String[] args) {
		//Strings - Array Like structures;
		
		//Substrings
		//Length
		//IndexOf
		//CharAt
		
		String name = "Harry Potter";
		//System.out.println(name.charAt(11));
//		System.out.println(  name.substring(3)  );
//		System.out.println(  name.substring(0, 7)  );
//		
//		System.out.println(name.length());
//		
//		System.out.println(name.indexOf('r'));
		
		//In-Class Exercise:
		//Loop through characters in a string and  print them in a different line
		
		for (char c : name.toCharArray()) {
//			 System.out.println(c);
		}
//		System.out.println(name.indexOf("kjbhgvcf"));
		
		//Replacing a character in a string
		String newName = name.replace("r", "i");
		
		char[] newName2 = new char[12];
		for (int i = 0; i < name.length(); i++) {
			newName2[i] = name.charAt(i);
			if (i == name.indexOf('r')) {
				newName2[i] = 'i';
			}
		}
		
		System.out.println(  newName2 );
		
		//In-Class Exercise
		//Build a function that takes in an array of strings
		//1) Process then print the result
		//2) and return the new array
		
		//Process:
		//For each of the strings inside the array:
		//	- Replace all vowel with "o"    (vowels: a, e, i, o, u)
		String[] names = {"Andy", "Alex", "John", "Jasmin", "Kevin", "Kenny"};
		
//		System.out.println( ProcessStrings(names)[0] );
		
		System.out.println(Cipher("Kenny", 1));
		
		//Hints
		//Character.toUpperCase('c');
		//Character.toLowerCase('c');
		//Cipher("Kenny", 1) -> Lfooz
	}
	
	public static String Cipher(String input, int code) {
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String output = "";
		
		for (char c : input.toCharArray()) {
			int currentIndex = alphabet.indexOf(c);
			int newIndex = currentIndex += code;
			char newChar = alphabet.charAt(newIndex);
			output += newChar;
		}
		
		return output;
	}
	
	
	
	

	public static String[] ProcessStrings(String[] input) {
		String[] results = new String[input.length];
		int count = 0;
		for (String str : input) {
			str = str.replace("a", "o");
			str = str.replace("e", "o");
			str = str.replace("i", "o");
			str = str.replace("u", "o");
			str = str.replace("A", "O");
			str = str.replace("E", "O");
			str = str.replace("I", "O");
			str = str.replace("U", "O");
			results[count] = str;
			System.out.println(str);
			count++;
		}
		return results;
	}
	/*
	 * Caesar's Cipher
	 * Requirements:
	 * - Parameters:
	 * 	- String input
	 *  - int code
	 *  - Example:  ("Kenny", 5)
	 *  
	 * - Return:
	 * 	- 1 String of encoded message
	 */
	
	
	
	
}
