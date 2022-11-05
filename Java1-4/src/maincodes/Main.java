package maincodes;

public class Main {

	
	
	//Homework
			//Exercise: Create a new function that adds up two numbers
			//then prints a message if its even or not 
			//Next question: Modify this function so it returns true if even, false if odd
	
	//Possibly explain % 
	
	//Q1: 
	public static void IsSumEvenQ1(int a, int b) {
		if (a + b % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	//Q2: 
	public static boolean IsSumEvenQ2(int a, int b) {
		if (a + b % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	Today will be half concepts half implementation
	
	#Flow of Control Topic
	
	
	Black Box Concept
	Think about a coffee machine. 
	How does the machine work to normal user?
	1) Put in ingredients
	2) Press a button
	3) Coffee will come out
	We don't know the internal details of how everything works 
	The input is your ingredient and the press, the output is the dispensed coffee.
	
	Now pretend the coffee machine is a box, and this box is painted black 
	We cannot see how the box turns the input into output
	Do we really care how it works? No. We just want coffee!
	
	This is the black box concept. We only care about the input and output. 
	We don't care about the implementation
	
	Like methods, we don't care how a method is implemented 
	as long as we get the correct output after passing in a certain input
	
	The essence is: 
	User don't care about internal logics, 
	so we should hide, abstract them. 
	Which possible might also decrease the chance of our code breaking
	In turn, we need to very clearly state the pre-post condition so that the user knows what they need to know
	
	Pre-Condition : 
	The condition that needs to be satisfy to make our code work
	Example: 
	In out method IsSumEven:
	- Two input input must be above or equal to 0
	
	Post-Condition:
	The promised behavior or output your method guaranteed to provide. 
	Example:
	In our method IsSumEven:
	- The method return a boolean value output:
	 - True if the sum is even
	 - False if the sum is odd
	 
	 Pre: This is what I expect from you
	 Post: This is what I promise to do for you
	
	
	The application for this concept / Implication / Significance to software development
	1) In different layer, we want to treat the programs, classes, modules and methods 
	we write into black boxes. 
	- By turning into black box what I mean is:
		- To the end users, they only care about the input, output.
		- In order for your code to work properly, you should clearly indicate the 
		- Pre-condition and post-condition to user about the method, class, modules, program you are writing
	- By different layer, the black box concept applies to many levels in development
		- On the Methods, classes, modules
		- You need to state the pre and post condition for other programmers
		- On the Program level, you need a sophisticated documentation to let end user
		- Understand your program's input and output
		
	Let's say we are building a small method in a whole team of programmers
	We need to define the pre-condition and post-condition	
	How can we tell other programmers what inputs are valid? and the expected outcome?
	
	Consider:
	We are writing a method called findBirthYear
	This method is over 1000 lines long
	The user only want to know the inputs and output
	*/
	
	//Precondition: age must be >= 0
	//Postcondition: The birth year is returned
//	public static int FindBirthYear(int age, int currentYear) {
//		return currentYear - age;
//	}
	
	//Main Function that runs automatically
	public static void main(String[] args) {
		System.out.println(FindBirthYear(66, 2020));
	}
	
	/*
	
	Javadoc Comments
	We can use comments //   /*
	Javadoc comments is special syntax for comments that allows
	some programs to convert into an external document that other
	users of your code can read to understand what each class method does
	Typically, this "document" is a series of HTML pages. 
	
	Let's  try!
	*/
	
	//Wrong example: 
	
	/*
	 * This method  will tell you your birth year.
	 * @param age Person's current age.
	 * @param currentYear Current year.
	 * @return Birth year
	 */

	/** 
	* This method  will tell you your birth year.
	* @param age Person's current age.
	* @param currentYear Current year.
	* @return Birth year
	* 
	*/
	public static int FindBirthYear(int age, int currentYear) {
		return currentYear - age;
	}
	
	// Variable Scope
	
	//Function Call Stack
	
	//Method  Overloading
}
