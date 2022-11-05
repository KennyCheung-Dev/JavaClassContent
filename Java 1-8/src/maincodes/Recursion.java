package maincodes;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(FactorialRcr(5));
	}
	
//	public static void printMessage(String name) {
//		System.out.println(name);
//		printMessage(name);
//		System.out.println("Hello");
//	}
	
	//To prevent recursive function to run on forever, we need
	//A Base Case
	//A known case to stop calling the function
	
	
	//Factorials:
	// 10! = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 
	
	public static int FactorialItr(int n) {
		int total = 1;
		for (int i = 1; i <= n; i++) {
			total *= i;
		}
		return total;
	}
	
	//Answer is known, or requires no/minimal calculation
	
		public static void printMessageRcr(String name, int count) {
			System.out.println(name);
			if (count > 1) printMessageRcr(name, count - 1);
			System.out.println("Hello");
		}
		
		public static void printMessageItr(String name, int count) {
			for (int i = 0; i < count; i++) {
				System.out.println(name);
			}
		}
		
	/*Recursive equation
		Base Case:
		F(0) = 0! = 0
		F(1) = 1! = 1
		F(2) = 2! = 2 * 1 = 2
		
		F(2) = 2 * 1 = 2
		F(2) = 2 * F(1)
		
		F(3) = 3 * 2 * 1
		F(3) = 3 * F(2)
		
		F(n) = n * F(n-1)
		
		n! = n * (n-1)!
		*/
		
		public static int FactorialRcr(int n) {
			if (n == 1 || n == 0) {
				return 1;
			}
			return n * FactorialRcr(n - 1);
		}
		
		//Homework:
		//Fibonacci Sequence
		//1 1 2 3 5 8
		
		//Figure out the iterative method to solve this, given the position of numbers
		
		
		
		
		
	
	
}
