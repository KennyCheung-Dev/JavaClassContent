package maincodes;

public class TeachingBranch {

	public static void main(String[] args) {
		//Arrays : An ordered collection of elements of a single data type
		
		//Arrays are just like lists in Python
		//Arrays are more restricted than lists in Python
		
		/*
		 * Limitation: Arrays can only hold elements that are of 1 type
		 * Java is a strongly typed language, so arrays can only takes in 1 type
		 */
		
		/*
		 * Java Array requires the  exact size to be initialized
		 * When instantiating a Java array, you need to give it the number of slots you would have in the array
		 */
		
		/*
		 * To  setup an array, you need  2 steps
		 * - Declaration
		 * - Initialization
		 */
		
		//Declaration
//		int[] numbers;
		
		//Initialization
//		numbers = new int[5];
		
//		int[] numbers = new int[5];
		//Not Preffered Way
//		int numbers2[] = new int[5];

		//Assign values:
//		numbers[0] = 1;
//		numbers[1] = 2;
//		numbers[2] = 3;
//		numbers[3] = 4;
//		numbers[4] = 5;
		
		//Declare and initialize WITH THE VALUES
//		int[] numbers3 = {1, 2, 3, 4, 5};
		
		//InClass Exercise: 
		//Create an array of all our first names 
//		String[] names = {"Andy", "Alex", "Kevin", "Jason", "Jasmin", "Kenny"};
//		System.out.println(  names[5] );

		//Loops
		/*
		 * Loops execute a block of code as long as the condition is true
		 * 
		 */
		
		//While Loop
//		while (true) {
//			System.out.println(  "Hello World"  );
//		}
		
		//While loop that stops after 5 times
//		int count = 0;
//		while (count < 5) {
//			System.out.println(  "Hello World"  );
//			count++; //   count += 1     count = count + 1
//		}
		
		//While loop is good when you do not explicitly know how many
		//times you want to loop
//		float count2 = 0.0f;
//		while (count2 < 4.0f) {
//			System.out.println(  "Hello World"  );
//			count2 += Math.random(); 
//		}
		
		//For Loop 
//		for (int count = 0; count < 5; count++) {
//			System.out.println(  "Hello World"  );
//		}
		
		//Knowing which iteration it is currently running on
//		for (int i = 0; i < 5; i++) {
//			if (i != 2) {
//				System.out.println("Hello World");
//			} else {
//				System.out.println("Hello World In the Middle \\o/ ");
//			}
//		}
		
		
//		for (int i = -5; i < 20; i+=5) {
//			System.out.println(i);
//		}
		
		//In-Class Exercise super quick: 
		//Print this with for loop:
//		20
//		50
//		80
//		110
		
//		for (int i = 20; i <= 110; i += 30) {
//			System.out.println(i);
//		}
		
		//In-Class Exercise:
		//Add  up from 1 to 100 (1+2+3+4+5+..+100)
		//print the final answer
		//WITH FOR LOOP
		//(SHHH if you know the answer, computer doesn't)
//		int counter = 0;
//		for (int i = 1; i <= 100; i++) {
//			counter += i;
//		}
//		System.out.println(counter);
		
		String[] names = {"Andy", "Alex", "Kevin", "Jason", "Jasmin", "Kenny"};
		
//		for (int i = 0; i < 6; i++) {
//			System.out.println(    names[i]    );
//		}
		
		//For-each loop
//		for (String individualName : names) {
//			System.out.println(individualName);
//		}
		
		
		System.out.println(names.length);
		
		//In-Class Exercise Final:
		//Make a method that takes in an array of integer, then print 2 lines: 
		//Line 1: The sum is {}
		//Line 2: The lowest number is : {}
		//Challenge: See if you can finish with just 1 loop
		int[] data = {5, 68, 243, 3, 747, 1, 2, 50};
		ProcessIntegers(data);
	}
	
	public static void ProcessIntegers(int[] input) {
		//XXXXXXXXZ
		System.out.println("XXXXX");
		System.out.println("XXXXX");
	}
	//Homework: 
	//1) finish the question of ProcessIntegers
	//2) Read textbook p.64-67
}
