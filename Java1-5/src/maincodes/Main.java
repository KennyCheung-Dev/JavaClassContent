	package maincodes;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Arrays: 
		 * An ordered collection of elements of a single data type
		 */

		/*
		 * Just like list in python, but more restricted
		 * 
		 * Limitation1
		 * - Java is a strongly typed language, array has to be of 1 type of data
		 * - There is ways around it, like casting datas into an array of Object 
		 * - Generally, we don't use array if we want to store data of different types
		 * 
		 * Limitation2
		 * - Java array requires the exact size to be initialized 
		 * - You cannot change the size of the array later
		 * - The size is used to allocate memory
		 * - This is very inconvenient if you have a list of data that will keep growing
		 *   or you don't know how many elements there will be 
		 * - To overcome this limitation, we use ArrayList, 
		 *   which will be a future lesson in either this course or java 2
		 */
		
		/* 
		 * To setup an array, you need 2 steps
		 * - Declaration
		 * - Initialization
		 * just like usual variable
		 */
		
		//Declaration:
		//int[] listOfNumbers;
		
		//Initialization
		//listOfNumbers = new int[3];
		
		//We can also declare and initialize in the same line
//		int[] listOfNumbers = new int[3];
		
		//Another not preferred way of declaration and initialization
//		int listOfNumbers2[] = new int[3];
		
		//Graphical Representation of Array
		//[0] [1] [2]
		
		//Note that we created an array of size 3, but the indices of the array goes from 0 - 2.
		
		//Assigning Values to the array
//		listOfNumbers[0] = 1;
//		listOfNumbers[1] = 2;
//		listOfNumbers[2] = 3;
		
		//You can assign Values when declare too
//		int listOfNumbers3[] = {1,2,3}; //This will also automatically set the size
		
		//Getting Values from an array
//		System.out.println(listOfNumbers[0]);
		
		//What if we assign a value an extra position?
//		listOfNumbers[3] = 4;
		//IndexOutOfBounds Exception  very common error
		
		//Array of other types?
//		String[] listOfStrings = new String[4];
//		listOfStrings[0] = "Elsa";
//		listOfStrings[1] = "Sissi";
//		listOfStrings[2] = "Violet";
//		listOfStrings[3] = "Zorina";
		
		
		//Loops!!
		//To execute a section of code multiple times
		//repeat something 
		
		/*
		 * Loops execute a block of code as long as the condition is true
		 * In computers, "running" programs are stuck in an infinite loops.
		 * Operating System (OS) are an infinite loop. If they weren't, your OS would boot, then stop running
		 * When he code in a loop finishes (we reach the end of the code inside the loop), 
		 * it checks the condition again
		 * if condition is true, loop back to start and re-execute code
		 * Else, exit the loop
		 */
		
		//While Loops
//		while (true) {
//			System.out.println("Hello World");
//		}
		
		//Condition ->  (true),  therefore it will run forever
		//We need to give it a valid condition for it to stop running 
		
		//Example: 
		//Print Hello 5 times to the user
//		int count1 = 0;
//		while (count1 < 5) {
//			System.out.println("Hello World");
//			count++;
//		}
		
		//While Loop is good when you do not explicitly know how many times you want to repeat
//		float count2 = 0.0f;
//		while (count2 <= 4.0f) {
//			System.out.println("Hello World");
//			count2 += Math.random();
//		}
		
		//In our first case, where we know 5 times is enough, a for loop is better
		//This is short, very commonly used and beautiful
//		for (int count = 0; count3 < 5; count3++) {
//			System.out.println("Hello World");
//		}
		
		//Magical thing about for loop:
		//We are aware of which iteration we are currently in within the code
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		//We can modify how the loop goes each iteration
//		for (int i = 20; i < 40; i+=5) {
//			System.out.println(i);			
//		}
		
		//In-Class Exercise: 
		//Add up from 1 to 100   (1+2+3+4+....+100)  
		//Print out the answer at the very end
		//(shhhh if you know the answer, the computer doesn't know)
//		int answer = 0;
//		for (int i = 1; i < 101; i++) {
//			answer += i; 
//		}
//		System.out.println(answer);
		
		
		//Reason why we put data into array is because we want to control them in an algorithmic way
		//We often need to loop through all the elements inside
		//Let's loop through the names and print them out
//		String[] listOfStrings = new String[4];
//		listOfStrings[0] = "Elsa";
//		listOfStrings[1] = "Sissi";
//		listOfStrings[2] = "Violet";
//		listOfStrings[3] = "Zorina";
//		for (int i = 0; i < 4; i++) {
//			System.out.println(listOfStrings[i]);
//		}
		
		//If you simply want to loop through all elements in an array
		//Easier, more readable way
		//Foreach Loop
//		for(String name : listOfStrings) {
//			System.out.println(name);
//		}
		//For every String name inside listOfStrings: Print
		
		//In-Class Exercise: 
		//Make a method that takes in an array of int as input, then print 2 lines: 
		//Line 1: The Sum is : { }
		//Line 2: The lowest number is : { }
		//Challenge: See if you an finish with just 1 loop
//		int[] data = {5, 68, 243, 3, 747, 1, 2, 50};
//		ProcessData(data);
		
		//Strings - Array Like Structures: 
		//Substrings means "part of a string"
		//In java, we can access a character from a String using string.charAt(); 
		//or getting substrings using  string.substring();
//		String name = "Harry Potter";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(1));
		
//		System.out.println(name.substring(3));
//		System.out.println(name.substring(0, 3));
//		System.out.println(name.substring(0, 100));
		
		//Using Length
//		System.out.println(name.length());
		
		//In-Class  Exercise
		//Loop through characters in a string
//		for (char individualChar : name.toCharArray()) {
//			System.out.println(individualChar);
//		}
		//OR
//		for (int i = 0; i < name.length(); i++) {
//			System.out.println(name.charAt(i));
//		}
		
		//Find the index of a substring using .indexOf()
//		System.out.println(name.indexOf("Harry"));
//		System.out.println(name.indexOf("Potter"));
//		System.out.println(name.indexOf("r"));
		
		//If you search a substring that does not exist, indexOf returns -1
//		System.out.println(name.indexOf("notHarry"));
		
		//Homework: 
		//Build a function that takes in an array of strings, 
		//1) process them, then print the result 
		//2) and return the new array
		//
		//Process needed: 
		//- For each of the strings inside the array:
		//		- Loop through the characters in the string, 
		//		- if the character is a vowel (a, e, i, o, u), change them to "o"
		//
		//Printing requirement: 
		//- Print each processed string in a new line
		//
		//Return the array with the processed content
		
		//Hint1: You will need to nest loops
		//first layer of loop: loops through the array entries
		//second layer of loop: loops through the characters in the one of the array entry
		
		//Hint2: To check if it is a vowel, just use if statement to compare to the 5 vowels
		
		//Hint3: The String[] from function argument (parameter) 
		//We need to build a new string with the characters we are looping through
		//Example to build a new array and copy the old values through a loop
		String[] listOfStrings = new String[4];
		listOfStrings[0] = "Elsa";
		listOfStrings[1] = "Sissi";
		listOfStrings[2] = "Violet";
		listOfStrings[3] = "Zorina";
		//You can loop using normal for loop or foreach loop, 
		//demonstrating for-each loop incorporating a counter
		String[] newList = new String[listOfStrings.length];
		int m_counter = 0;
		for (String str : listOfStrings) {
			newList[m_counter] = str;
			m_counter++;
		}
		//Now we have a copy of the names called "newList"
		
		
		//Testing finished Answer
		String[] testStringArray = { "hello", "world", "Harry", "Potter" };
//		String[] result = ProcessStrings(listOfStrings);
		String[] result2 = ProcessStrings(testStringArray);
	}
	
	//In-Class Exercise Answer
	public static void ProcessData(int[] input) {
		int sum = 0; 
		int lowest = input[0];
		for(int i : input) {
			if (i < lowest) {
				lowest = i;
			}
			sum += i;
		}
		System.out.println("The Sum is : " + sum);
		System.out.println("The lowest number is : " + lowest);
	}
	
	//Homework Answer: 
	//Method taking in an array of strings
	public static String[] ProcessStrings(String[] input) {
		//Create a counter for the foreach loop to know which iteration it is currently in
		//If you are using a normal for-loop, then you don't need the counter
		int counter = 0;
		//For each loop to loop through the strings in the array input
		for (String str : input) {
			//Create a new String to fill in the characters
			String newStr = "";
			//For-loop to loop through the characters within the string
			for (int i = 0; i < str.length(); i++) {
				//Check if it is a vowel, assign o to new string if true, 
				//assign original character if false  
				if (str.charAt(i) == 'a' ||
						str.charAt(i) == 'e' ||
						str.charAt(i) == 'i' ||
						str.charAt(i) == 'o' ||
						str.charAt(i) == 'u') {
					newStr += 'o';
				} else {
					newStr += str.charAt(i);
				}
			}
			//Plug the newly formed string into the input StringArray
			input[counter] = newStr;
			//Print the result, 1 string per line
			System.out.println(newStr);
			//Advance counter at the very end
			counter++;
		}
		//When all the loops are done, return the result input
		return input;
	}
	
}
