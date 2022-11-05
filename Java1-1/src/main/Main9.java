package main;

public class Main9 {

	public static void main(String[] args) {
//		PrintStuff(0);
//		PrintMessageIter(100);
//		PrintMessageRecur(1, 100);
//		boolean yes = true;
		
		
		// Short form of a 2-case if statement
//		if (yes)
//			System.out.println("yes Is True");
//		else 
//			System.out.println("yes Is False");
		
//		System.out.println(yes ? "yes Is True" : "yes Is False");
		//Python version :  "yes Is True" if yes else "yes Is False
		
//		System.out.println(FactorialRecur(4));
		
//		System.out.println(FibItr(arr));
	}
	
//	public static void PrintStuff(int i) {
//		i += 1;
//		System.out.println("Going in! " + i);
//		if (i <= 10)
//			PrintStuff(i);
//		System.out.println("Coming Out! " + i);
//	}
	
	//Print 1 - 100 inclusive
	//1
	//2
	//3
	
//	public static void PrintMessageIter(int count) {
//		for (int i = 1; i < count + 1; i++)
//			System.out.println(i);
//	}
	
//	public static void PrintMessageRecur(int currNum, int count) {
//		if (currNum > count)
//			return;
//		System.out.println(currNum);
//		PrintMessageRecur(currNum + (currNum % 2 == 0 ? 9 : 1), count);
//	}
	
	/*
	 * Base Case:
	 * Answer that is already known, requires no/minimal calculation
	 * 
	 * Recursive Call:
	 * a call back to itself
	 */
	
	// f(4) = 4 * 3 * 2 * 1
	// f(2) = 2 * 1
	
//	public static int FactorialItr(int n) {
//		int temp = n;
//		for (int i = n - 1; i >= 1; i--)
//			temp *= i;
//		return temp;
//		// +=   -=   %=   /=  *= 			
//	}
	
	/*
	 * Goal, final outcome
	 * I get n * n-1 * n-2 * n-3 ... 1
	 * 
	 * Split the problem into cases/stages
	 * 
	 * Base Case
	 * Fac(1) = 1
	 * 
	 * Other cases
	 * return n * fac(n-1)
	 */
	
	public static int FactorialRecur(int n) {
		if (n == 1)
			return 1;
		return n * FactorialRecur(n - 1);
	}
	
	//Homework
	// n = 8     return 21
	public static int FibItr(int n) {
		
		return 0;
	}
}








