package main;

public class Main10 {

	public static void main(String[] args) {
		
		System.out.println(FibRcr(8));

	}

//	public static int FibItr(int n) {
//		if (n == 1) 
//			return 0;
//		else if (n == 2)
//			return 1;
//					
//		int x = 0;
//		int y = 1;
//		for (int i = 0; i <= n - 2; i++) {
//			int newfib = x + y;
//			if (x >= y) {
//				y = newfib;
//			}else {
//				x = newfib;
//			}
//		}
//		return x >= y ? x : y;
//	}
	
	// fib(n) = fib(n-1) + fib(n-2)
	
	public static int FibRcr(int n) {
		if (n == 0 || n == 1)
			return 0;
		else if (n == 2) {
			return 1;
		}
		return FibRcr(n-1) + FibRcr(n-2);
	}
}
