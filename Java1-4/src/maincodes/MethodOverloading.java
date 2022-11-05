package maincodes;

import java.util.Calendar;

public class MethodOverloading {
	public static void main(String[] args) {
		
		System.out.println(FindBirthYear(20));
	}
	
	//Method Overloading
	//Method with the same name.
	
	//Method to calclate our birth year
	//Most of the time, when we use it, we want to use the current year
	//If we create a new method that will have our current year built in, 
	//then we only need to pass 1 parameter in
	
	public static int FindBirthYear(int age, int year) {
		return year - age;
	}
	
	//This is the one
	//We know that we can't have multiple methods with the same name, or can we?
//	public int FindBirthYearCurrentYear(int age) {
//		int year = Calendar.getInstance().get(Calendar.YEAR);
//		return year - age;
//	}
	
	public static int FindBirthYear(int age) {
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year - age;
	}
	/*
	 * Turns out we can
	 * Methods can have the same name if  their argument lists are different.
	 * Parameters List.Argument List contains the required input when calling the function
	 * The argument we have in the 1st function is [int, int] 
	 * The second function - [int]
	 */
	
	/*
	 * But why?
	 * Method overloading allow us to provide a function to user with different required input, 
	 * and output accordingly
	 * For example, You make a method to spawn a skeleton enemy in the map
	 * User have the option to just spawn it;
	 * User have the option to spawn it with specified location
	 * User have the option to spawn it under certain boss's army
	 * User have the option to spawn it facing a direction
	 * and so on...
	 * 
	 * User should be able to use a function with different kinds of input, 
	 * that he/she desires, with possibly different outcome.
	 * Overloading allows us to do that.
	 */
	
	/*Helper Methods:
	 * Assist  other methods in completing its job
	 * Make code easier  to read by giving descriptive names to computations
	 * 	e.g. a method to calculate area of circle
	 * Easier to find  bugs in code
	 * Lets you reuse computations
	 */
	
	/* The way we find the current year seems like a good helper method,
	 * that we can reuse later 
	 */
	
	

}
