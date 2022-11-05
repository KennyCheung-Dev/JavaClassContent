package maincodes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//About println and print
		//println: subsequent prints will switch to a new line after printing the statement 
		//print : subsequent prints will be merged into the same line
//		System.out.print("Hi");
//		System.out.print("Hi");
//		System.out.print("Hi");
//		System.out.println("");
//		System.out.print("Hi");
//		System.out.print("Hi");
		
		//---------------------------------------------------------------------------------------------------
		
		//If Statement 
		//Allow us to execute different code based on a condition
		//Code block only runs if the condition is true
		//Asking a question, depending on the answer, do something or not
		
		
		//Syntax:
//		if (condition) {
//			System.out.println("My Age is 10");
//		}
		
		//Condition is wrapped by a parenthesis 
		
		//Condition 
		//The condition inside will be evaluated to be true or false
		//which means it will be evaluated as a boolean value
		
		//When comparing numbers we can use a few comparison operators:
		// >  <  >=  <=  ==  != 
		
		//When comparing strings we can use .equals()
//		String name = "kenny";
//		if (name.equals("kenny")) {
//			System.out.println("I am kenny");
//		}
		
		//Example: 
//		int age = 10;
//		
//		if (age >= 10) {
//			System.out.println("I am older than 10");
//		}
//		
		
		//---------------------------------------------------------------------------------------------------
		
		//In class exercise:  What would the following print
//		int num = 35;  //10 = C, 20 = C, 25 = A+C, 30 = A+C, 35 = A+B
//		if (num > 20) {
//			System.out.println("A");
//		}
//		if (num > 30) {
//			System.out.println("B");
//		}
//		if (num <= 30) {
//			System.out.println("C");
//		}
		
		//What if you want to only print 1 answer
		
		//---------------------------------------------------------------------------------------------------
		
		//If Else Statements and Else If statements
		
		//If Else statements allows us to specify when the condition is false, what should be run
//		int x = 10;
//		int y = 20;
//		if (x < y) {
//			System.out.print("X is smaller than Y");
//		} else {
//			System.out.print("X is larger than Y");
//		}
		
		//---------------------------------------------------------------------------------------------------
		
		//Else If Statements allow us to specify an extra condition, that branches into another outcome
		//Think of it like a branching stories with 3 endings
//		int num = 25;
//		if (num == 10) {
//			System.out.println("Equals to 10");
//		} else if (num > 10) {
//			System.out.println("Above 10");
//		} else if (num < 10) {
//			System.out.println("Below 10");
//		}
		
//		OR We can just use ELSE at the end to handle the rest of the cases
		
//		int num = 25;
//		if (num == 10) {
//			System.out.println("Equals to 10");
//		} else if (num > 10) {
//			System.out.println("Above 10");
//		} else {
//			System.out.println("Below 10");
//		}
			
		//---------------------------------------------------------------------------------------------------
		
		//Nested If Statements
		
		//Example wants to check if it is between the range of 25 to 75
//		int num = 100;
//		if (num > 25) {
//			if (num < 75) {
//				System.out.println("Number is between 25 and 75");
//			}
//		}
		
		//Changing Question a little bit
		//25 to 75 inclusive
//		int num = 100;
//		if (num >= 25) {
//			if (num <= 75) {
//				System.out.println("Number is from 25 to 75");
//			}
//		}
		
		//If I want to add else statements to handle when the numbers are outside?
//		int num = 100;
//		if (num >= 25) {
//			if (num <= 75) {
//				System.out.println("Number is between 25 and 75");
//			} else {
//				System.out.println("Number is greater than 75");
//			}
//		} else {
//			System.out.println("Number is smaller than 25");
//		}
		
		
		//About the conditions
		//Compound Boolean Expressions
		//You can put multiple conditions in an if statement to form a compound expression 
		//that checks multiple conditions at the same time
//		int a = 10;
//		int b = 50;
//		if (a > 5 && b > 5) {
//			System.out.println("A and B are larger than 5");
//		}
		
		//Inside the parenthesis you can put as many as you want, separated by logical operators
		// && And  Example : if (x < 3 && y > 4)
		// || Or   Example:  if (age < 2 || height < 4) 
		// !  Not  Example: if (!found)
		// ^  Xor  Example: if (i > 0 ^ y > 0)
		
		//---------------------------------------------------------------------------------------------------
		
		//In-Class Exercise
		//You want to ride a rollercoaster
		//You need to be at least 5ft. to ride it
		//A ticket costs 10.00 dollars
		//If you can, print "I can ride the Roller Coaster!"
		//If you don't have enough money, print "I need x dollars more to ride." (Calculate x)
		//If you are not tall enough, print "I need to be x feet taller to ride." (Calculate x)
		//If both of the condition failed, just print one of them depending on the order
		
//		float height = 5.9f;  //Change these numbers to test
//		float money = 10.5f;  
		
		//Answer:
//		if (height >= 5 && money >= 10) {
//			System.out.println("I can ride the Roller Coaster!");
//		} else if (height < 5) {
//			System.out.println("I need to be " + (5 - height) + " feet taller to ride.");
//		} else if (money < 10) {
//			System.out.println("I need " + (10.0f - money) + " dollars more to ride.");
//			System.out.println("I need " + (float)Math.round((10.0f - money) * 10) / 10 + " dollars more to ride.");
//		}
		
		//---------------------------------------------------------------------------------------------------
		
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
		
		// In-class or homework
		
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
		
		
	}

}
