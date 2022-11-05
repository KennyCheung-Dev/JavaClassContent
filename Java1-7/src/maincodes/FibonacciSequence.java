package maincodes;

public class FibonacciSequence {

	public static void main(String[] args) {
		System.out.println("Final Answer: " + Fib(15));
	}
	
	public static int Fib(int n) {
		int counter = 0;
		int i = 0;
		int back1 = 0;
		int back2 = 0;
		while (counter < n) {
			if (i <= 1) {
				System.out.println(i);
				back2 = back1;
				back1 = i;
			} else {
				i = back2 + back1;
				System.out.println(i);
				back2 = back1;
				back1 = i;
			}
			i += 1;
			counter += 1;
		}
		return i - 1;
	}

}
