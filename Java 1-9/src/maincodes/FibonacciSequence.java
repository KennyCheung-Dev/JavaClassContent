package maincodes;

public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("Final Answer: " + Fib(10));
		System.out.println("Recursion Answer: " + FibRcr(10));
		
	}
	
	//Explain with Tree Diagram
	public static int Fib(int n) {
		int counter = 0;
		//Start with the first number
		int i = 1;
		int back1 = 0;
		int back2 = 0;
		//End 1 before n, Loop through n times from 0, even though number starts from 1
		while (counter < n) {
			if (i == 1) {
				System.out.println(i + " " + back1 + " " + back2);
				back2 = back1;
				back1 = i;
				i = back1 + back2;
			} else {
				i = back2 + back1;
				System.out.println(i + " " + back1 + " " + back2);
				back2 = back1;
				back1 = i;
			}
			counter += 1;
		}
		return i;
	}
	
	//How to get the equation:
	// 1 1 2, 3, 5, 8, 13, 21, 34, 55
	// 8 = 5 + 3
	// Fib(5) = 8
	// Fib(5) = 5 + 3
	// Fib(5) = Fib(4) + Fib(3)
	// Fib(n) = Fib(n-1) + Fib(n-2)
	
	public static int FibRcr(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return FibRcr(n-1) + FibRcr(n-2);
		}
	}
}
