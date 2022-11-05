package maincodes;

public class FibonacciSequence {

	public static void main(String[] args) {
		/* 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
		 * 
		 * 8 = 5 + 3
		 * Fib(6) = 5 + 3
		 * Fib(6) = Fib(5) + Fib(4)
		 * Fib(n) = Fib(n-1) + Fib(n-2) 
		 */
		
		System.out.println(Fib(5));
	} 
	
	// Think of a base case, where it requires minimum calculation, we already know the answer
	// Fib(4) = Fib(1) + Fib(0) + Fib(1) + Fib(1) + Fib(0)
	
	//Fib(0) = 1
	//Fib(1) = 1
	//Fib(2) = ?
	
	public static int Fib(int n) {
		if (n == 1 || n == 0) {
			return 1;
		}
		return Fib(n-1) + Fib(n-2);
	}
	
	
	
}
