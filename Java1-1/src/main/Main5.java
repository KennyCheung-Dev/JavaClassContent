package main;

public class Main5 {

	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) {
		String name = "Kenny Hello";
		
		//Review on string operations
//		System.out.println(name.substring(4));
//		System.out.println(name.substring(4, 8));
//		
//		System.out.println(name.charAt(4));
		
//		String typeCastedString = String.valueOf('a');
//		System.out.println(typeCastedString);
		
		
		//String - Loop through each letter within a string
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
		
//		for (char letter : name.toCharArray()) {
//			System.out.println(letter);
//		}
		
		//Limitation for For-Each Loop
		int[] num = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				num[i] = 0;
			}
		}
		
		//For-Each loop makes a copy of the value and apply it to i,
		//Limitation: Cannot change value on actual array anymore, because i is a copy
		
		//Compare to normal for-loop, normal for-loop access value by array[index], 
		// which we can make changes directly
//		for (int i : num) {
//			if (i % 2 == 0) {
//				System.out.println("Setting " + i + " to 0!");
//				i = 0;
//			}
//		}
		
		//Another limitation : We cannot grab index in for-each loop
		//Let's say, extract the index of all of number 1
//		int[] nums = new int[] {1, 2, 2, 2, 2, 1, 2, 2, 1, 2};
//		for (int number : nums) {
//			if (number == 1)
//				System.out.println();// ???? We have no way of getting the index
//		}
		
		//Checking all nums
//		for (int n : num) {
//			System.out.println(n);
//		}
		
		
		//Make copies of arrays
		int[] numberList1 = new int[] {2, 4, 6, 8, 0, 1, 3, 5, 7, 9};
		//Wrong way of doing it, point to the same memory
		int[] numberList2 = numberList1;
		
//		numberList2 [0] = 999;
		//If this is a copy, numberList1's first 
		//element shouldn't be 999
		
//		System.out.println(numberList1[0]);
		
		
		//Right way - Short cut
//		numberList2 = numberList1.clone();
//		numberList2[0] = 999;
//		System.out.println(numberList1[0]); //Checks out, not copy! \o/
		
		//Right way, - Longer,  Looping through
//		numberList2 = new int[numberList1.length];
//		for (int i = 0; i < numberList1.length; i++) {
//			numberList2[i] = numberList1[i];
//		}
		
		//Comparing strings and char
//		String s1 = "Kenny";
//		String s2 = "Kenny";
//		
//		System.out.println(s1.contentEquals(s2));
//		
//		char c1 = 'a';
//		char c2 = 'a';
//		
//		System.out.println(c1 == c2);
		
		
		//Concatenations, adding on
//		String kenny = "";
//		kenny += "K";
//		kenny += "e";
//		kenny += "nn";
//		kenny += "y";
//		
//		System.out.println(kenny);
		
		
		//Homework + In-class
		/*
		 * Process a string array of names
		 * If the name has any vowels (a, e, i, o, u), replace them them with 
		 * the letter taken in from method argument
		 * 
		 * Method needs to print the new processed name, 
		 * and return the list of String of names back
		 * 
		 * 
		 * e.g. 
		 * Kenny,  "v"
		 * Output:
		 * Kvnny
		 */
		
		String[] ourNames = new String[] { "Kenny", "Daisy", "Devin", "Luke", "Philip", "RiceBender" };
		ProcessNames(ourNames, 'v');
	}
	
	static String vowels = "aeiou";
	
	public static String[] ProcessNames(String[] names, char letter) {
		
		//Loop through each string in string []
		//Building a new string
		//Within the string, loop through the character!
		//Check if character is vowel
			//If vowel, concatenate the replacing letter specified
			//If not vowel, concatenate the original letter
		//replace the string in the array with the new string
		//return the string[]
		
		
		//String Concatenation Way
//		for (int i = 0; i < names.length; i++) {
//			String newStr = "";
//			for (char c : names[i].toCharArray()) {
//				if (vowels.indexOf(c) == -1) {  // If -1, character is not a vowel
//					newStr += c;
//				} else { // character is a vowel!
//					newStr += letter;
//				}
//			}
//			names[i] = newStr;
//			System.out.println(newStr);
//		}
		
		//String Builder way
		for (int i = 0; i < names.length; i++) {
			for (char c : names[i].toCharArray()) {
				if (vowels.indexOf(c) == -1) {  // If -1, character is not a vowel
					sb.append(c);
				} else { // character is a vowel!
					sb.append(letter);
				}
			}
			names[i] = sb.toString();
			System.out.println(names[i]);
			sb.setLength(0);
		}
		return names;
	}
	
	//Hints:
	//	String = "";
	//	for (char letter : name.toCharArray()) {
	//		System.out.println(letter);
		//If not vowel, add to String,
		//If vowel, add with new string
	//	}
	

}
