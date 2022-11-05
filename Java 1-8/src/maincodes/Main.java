package maincodes;

public class Main {

	public static void main(String[] args) {
		// Recall Function call stack?
		// When calling another function, the original function 
		// that calls it is paused on hold, until the called function returns
		//printMessage("Kenny");
//		printMessage("Kenny", 5);
//		printNameItr("Kenny", 5);
//		printNameRcr("Kenny", 5);
//		System.out.println(FactorialMyVer(16));
//		System.out.println(FactorialItr(16));
//		System.out.println(FactorialRec(16));
		//Max amount of an int is 2147483647 therefore 16! is the max it can go haha
	}
	
	//Consider the following function, will the second println ever get executed?
	public static void printMessage(String name) {
		System.out.println("Hello " + name);
		printMessage(name);
		System.out.println("Can you hear me? " + name);
	}
	
	//Recursion is when a function calls itself.
	
	//A recursive function has 2 extra parts.
	//Base Case - A known case to stop calling the function 
		//Answer is known, or requires no.minimal calculation.
	//Recursive Call - Calling the same function within the function
	
	//Improving the above function with a base case
	public static void printMessage(String name, int count) {
		System.out.println("Hello " + name);
		if (count > 1) {
			printMessage(name, count - 1);
		}
		System.out.println("Bye " + name);
	}
	
	//Recursive Method vs Iterative Method: 
	//Here are two function that both print a String a number of times 
	//as specified by the parameter count. 
	public static void printNameItr(String s, int count) {
		for (int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	
	public static void printNameRcr(String s, int count) {
		if (count != 0) {
			System.out.println(s);
			printNameRcr(s, count - 1);
		}
	}
	
	//Factorials:
	//Factorial is the product (multiplied) of all positive integers less than or equal to n
	// 3! = 3 * 2 * 1 = 6
	// F(x) = x!
	
	public static int FactorialItr(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total *= i;
		}
		return total;
	}
	
	//To build Factorial recursively,
	//First find a base case:
	//F(1) = 1! = 1
	//F(0) = 0! = 0
	//We know that the calculation should stop when the result is 1, 
	//because further calculation will not be correct
	//You can't put in negative numbers for factorial.
	// F(2) = 2 * 1 = 2
	// F(2) = 2 * F(1)
	// F(2) = 2 * F(2 - 1)
	//Final equation:
	// F(n) = n * F(n - 1)
	
	public static int FactorialRec(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return n * FactorialRec(n - 1);
	}
	
	public static int FactorialMyVer(int i) {
		int temp = 1;
		if (i != 1) {
			temp = FactorialMyVer(i - 1);
		}
		return i * temp;
	}

}
