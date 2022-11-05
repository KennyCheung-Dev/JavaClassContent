package maincodes;

public class Main {

	public static void main(String[] args) {
		//CHECK STUDENT EMAILS
		
		
		// Last Week Homework Answer
		// Color Combination
		// r = red,  g = green,  b = blue
				
		// r + g = yellow (y)
		// r + b = magenta (m)
		// g + b = cyan (c)
		// r + g + b = yellow (y)
				
		//  Use these operators  
		//  <  >  <=  >=  ==  !=
		//  &&  (and)   || (or)   ! (not)   ^ (xor)
				
		String color1 = "r";
		String color2 = "b";
				
		//print the resulting color if you combine both colors
		//If either variables have an invalid color, print "Invalid color"
		//example: color1 = "b", color2 = "g", prints "c"
		//Challenge: Can you do it within 9 if/elseif statements or less (lowest amount is 5)
			
		//Answer:
		if (color1 != "r" && color1 != "g" && color1 != "b" || 
				color2 != "r" && color2 != "g" && color2 != "b") {
			System.out.println("Invalid Color");
		} else if (color1 == color2) {
			System.out.println(color1);
		} else if (color1 == "r" && color2 == "g" || color1 == "g" && color2 == "r") {
			System.out.println("y");
		} else if (color1 == "r" && color2 == "b" || color1 == "b" && color2 == "r") {
			System.out.println("m");
		} else if (color1 == "g" && color2 == "b" || color1 == "b" && color2 == "g") {
			System.out.println("c");
		}		
		
		
		
		//Continuing on Code Structures
		
		//Switch Case
		//Lets see this else if statement:
//		int numCats = 2;
//		if (numCats == 1) {
//			System.out.println("I have 1 cat");
//		} else if (numCats == 2) {
//			System.out.println("I have 2 cats, nice");
//		} else if (numCats == 3) {
//			System.out.println("I have 3 cats, a bit too much but ok");
//		} else if (numCats > 3) {
//			System.out.println("I have too many cats");
//		} else {
//			System.out.println("I don't have cats");
//		}
		
		//Redundant, so many checks
		//We can use a switch case, when handling many cases
		//Useful when the execution of your program depends only on one variable
		//switch
		//case checks if the variable in the expression matches the value after
		//break; statement exit the entire switch statement
		//default keyword : what to do when none of the cases above are satisfied
//		int numCats = 2;
//		switch (numCats) {
//			case 1:
//				System.out.println("I have 1 cat");
//				break;
//			case 2:
//				System.out.println("I have 2 cats, nice");
//				break;
//			case 3:
//				System.out.println("I have 3 cats, a bit too much but ok");
//				break;
//			case 0:
//				System.out.println("I don't have cats");
//				break;
//			default:
//				System.out.println("I too many cats");
//				break;
//			
//		}
		
		//---------------------------------------------------------------------------------------------------
		
		//Another example for switch case :
//		int day = 1;
//		switch (day) {
//			case 1: 
//			case 2:
//			case 3:
//			case 4:
//			case 5:
//				System.out.println("It's a weekday");
//				break;
//			default:
//				System.out.println("Not a weekday");
//		}
		
		//---------------------------------------------------------------------------------------------------
		
		//Short Circuit Evaluation 
		//When evaluating Compound Boolean Expressions, the program checks each Boolean Expressions 
		//one by one from left to right, and stop as soon as the value of the expression is known (True or False)
		//Example:
		int age = 13;
		int height = 10;
		boolean allowedByParent = true;
		
//		if (age > 12 && height > 20 && allowedByParent == true)  {
//			System.out.println("You can ride the ride!");
//		} else {
//			System.out.println("You can ride the ride!");
//		}
		//That is a simple example, the program ahs to read the condition until the end to know that its true
		
		//How about this one
//		if (age > 12 || height > 20 || allowedByParent == true)  {
//			System.out.println("You can ride the ride!");
//		} else {
//			System.out.println("You can ride the ride!");
//		}
		
		//What if I change the age to 11 and the height to 30
		
		
		//---------------------------------------------------------------------------------------------------
		
		//Mention today's content are gonna be located mainly outside of the Main Function
		//Only Method calls  will be inside
		
		//Functions/Methods
		//In general, methods allow us to encapsulate or group many lines of code
		//for a specific task
		//Some use cases are:
		//1. To Group block of code and make them meaningful
		//2. Taking in Parameters (no Return)
		//3. Returning Values (no Parameters)
		//4. Taking in Parameters and Returning Values
		
		//---------------------------------------------------------------------------------------------------
		
		//Methods explanation
		//To use a method we first have to DECLARE it and DEFINE what it does
		//Recall that declaration means to state that something exists. 
		//Here we state that a function called getTheDouble exists
		//and that it takes in an integer parameter and returns an int. 
//		System.out.println(getTheDouble(10));

//		System.out.println(isSumEven(2, 3));
	}
	
	//Methods explanation - each parts, each type
//	public static int getTheDouble(int number) {
	//Possibly calculation between
//		return number * 2;
//	}
	//Return Type: What type does this function give us? IF "void": nothing
	//Name of the function: Required when calling the method
	//Parameters: What does this function need to work? (Can have multiple)
	//Return Statement: returns a value, if "void": no need for return
	
	//Methods can take in multiple parameters
	//But return ONLY ONE data type
//	public static int getTheDouble(int number, int number2) {
//		return number * number2;
//	}
	
	//Method Declaring Location !
	//A class has to be created when you program in Java
	//Don't worry about what a  class is at the moment
	//Inside the class (within the code blocks)  
	// You must declare function within those  first initial curly braces
	
	//In-Class exercise for function header building:
	// A function named PrintName that do not return, and takes no parameter
	// A function named GetPos that return 2 float, but takes no parameter
	// A function named Shoot that do not return, but takes 1 float parameter
	// A function named Multiply that returns an int with parameter of 2 int
	
	//Calling a method
	//To execute a method (aka method call), we write the method signature 
	//in the place where we want to use it.
	//Think of method calls like asking  someone to do a task
	//We can spot a method easily because there will be parenthesis ().
	//Where is a method call in this code? 
	//Try calling this method:
//	public static int giveMe10() {
//		return 10;
//	}
	
	//Also talks about how to treat method returns in a println.
	
	//In-class Exercise pt. 1
	//Make a method that returns the square of an int parameter
	
	//In-Class Exercise pt.2 - Call the method to get the result : 4-9-16-25
	
	//Answer: 
//	public static int sqrt(int num) {
//		return num*num;
//	}
	
	
	//Method Signature and Header
	//Method Signature: Method name and the number, type of its parameter
	//Method Header: access level modifier + return type + Method signature  
	//Access level modifier is the public thingy, 
	//It will not be discussed in this course. For now, make sure that it always says public
	//Method Example:
//	public int getTheDouble(int number) {
//		return number * 2;
//	}
	//Signature: getTheDouble(int number)
	//Header:  public int getTheDouble(int number) 
	
	//Example method: 
	public static void isNumberEven(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
	}
	//Exercise: Create a new function that adds up two numbers
	//then prints a message if its even or not 
	
	//Answer:
//	public static void isSumEven(int num1, int num2) {
//		int sum = num1 + num2;
//		if (sum % 2 == 0) {
//			System.out.println(sum + " is Even");
//		} else {
//			System.out.println(sum + " is Odd");
//		}
//	}
	//Next question: Modify this function so it returns true if even, false if odd
	
	//Answer: 
//	public static boolean isSumEven(int num1, int num2) {
//		int sum = num1 + num2;
//		if (sum % 2 == 0) {
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	
	//Flow of Control
	//Show the 2 flow of control examples
	//You are counting money, you opened an empty container, there shouldn't been 
	//another briefcase in the container, you realize you left it at Vancouver. 
	//You ask personA to get if for you.
	//You have to wait for him since without the briefcase, you can't count the money
	//Person A does his job, return to your room, put the briefcase in the empty container
	//Person A finished his task, he is no longer needed, 
	//he stays on the side and ready for his next task.
	//Now that you have your briefcase, you continue and finish counting money.
	
	//Rest of the  content in slides
	
	
	//Homework for this week
	
	
	
	
	
	
}
