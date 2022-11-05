package CCC4_teaching;

import java.util.Scanner;

public class sum13 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * Return the sum of the numbers in the array
		 * Returning - for an empty array.
		 * Number 13 is unlucky, so it does not count and!
		 * the number that comes immediately after 13 also
		 * do not count
		 * 
		 * sum13(new int[] {1, 2, 2, 1}) -> 6  
		 * sum13(new int[] {1, 2, 2, 1, 13}) -> 6  
		 * sum13(new int[] {1, 2, 2, 1, 13, 5}) -> 6  
		 * sum13(new int[] {1, 2, 2, 1, 13, 5, 5}) -> 11
		 */
		
		// Take multi-line input into an array
		int[] arr = new int[sc.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Sum13(arr));
	}
	
	public static int Sum13(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				if (arr[i] == 13 || arr[i - 1] == 13) continue;
			} else {
				if (arr[i] == 13) continue;
			}
			sum += arr[i];
		}
		return sum;
	}
	
	

}
