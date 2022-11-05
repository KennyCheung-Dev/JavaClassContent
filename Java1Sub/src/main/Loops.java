package main;

public class Loops {

	public static void main(String[] args) {
		
		// From 0 to 100, each number that's a multiple of 5
		
		//KISS
		//Keep it stupid simple
		
		/*
		 * i starts at 0
		 * Loop until i >= 10, stop
		 * For every loop, i = i + 1
		 */
//		for (int i = 10; i < 20; i+=2) {
//			System.out.println(i);
//		}
		
		//In-class
		//Add all the numbers from 1 to 100
		// Using for-loop
		//Print the result
		
		//5050
		
//		int sum = 0;
//		for (int i = 0; i < 101; i+=1) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
//		for (int i = 0; i <= 100; i+= (int)(Math.random() * 5)) {
//			System.out.println(i);
//		}
		
//		int counter = 0;
//		int sum = 0;
//		while (sum < 100) {
//			counter++;
//			sum += (int)(Math.random() * 5);
//		}
//		System.out.println(counter);

		//in-class
		/*
		 * Create a while loop which prints out the numbers
		 * from 0 to 100
		 * without printing out the numbers from 20 to 30
		 */
		
//		int counter = 0;
//		while (counter <= 100) {
//			if (counter < 20 || counter > 30) {
//				System.out.println(counter);
//			}
//			counter++;
//		}
		
		/*
		 * Create a for-loop which prints out
		 * the numbers from 50 to -50
		 * backwards
		 * in the increment of -4
		 * might not need to include -50
		 * 
		 * 50
		 * 46
		 * 42
		 * ....
		 * 
		 */
		
		//Create a method called minToMax(int x, int y)
		//return the sum of all numbers between x and y inclusively
		//assume x and y are different numbers
		//e.g. minToMax(5, 10) returns 45 (5 + 6 + 7 + 8 + 9 + 10)
		
		
//		System.out.println(minToMax(5, 10));
		
		
		//Break keyword - break out of a loop
//		int i = 100;
//		while (i > 0) {
//			i -= (int)(Math.random() * 5);
//			if (i == 50) {
//				break;
//			}
//			System.out.println(i);
//		}
		
//		int counter = 0;
//		while (true) {
//			System.out.println("Hello World");
//			counter ++;
//			if (counter >= 20) {
//				break;
//			}
//		}
		
		//Skipping a loop turn
		int counter = -1;
		while (counter < 100) {
			counter++;
			if (counter >= 20 && counter <= 30) continue;
			System.out.println(counter);
		}
	}
	
	/*
	 * Homework:
	 * Count up by an increment of 2 from -20 upwards, print each number 
	 * if the value is a mulitple of 8, skip the print
	 * if the value is a multiple of 100, break out of the for loop
	 */
	
	
	public static int minToMax(int x, int y) {
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		return sum;
	}

}
