package CCC4_teaching;

import java.util.Arrays;
import java.util.Scanner;

public class CCC4_teaching {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		/*
		 * RotateLeft, but uses array, and takes in int d and int n
		 */
		
		int[] result = RotateLeftSimpler(new int[] {1, 2, 3, 4, 5}, 3, 4);
		for (int c : result) {
			System.out.println(c);
		}
		
	}
	
	public static int[] RotateLeft(int[] arr, int d, int n) {
		for (int i = 0; i < n; i++) {
			int[] part1 = Arrays.copyOfRange(arr, 0, d);
			int[] part2 = Arrays.copyOfRange(arr, d, arr.length);
			for (int j = 0; j < part2.length; j++)
				arr[j] = part2[j];
			for (int k = part2.length; k < arr.length; k++)
				arr[k] = part1[k - part2.length];
		}
		return arr;
	}
	
	public static int[] RotateLeftSimpler(int[] arr, int d, int n) {
		for (int i = 0; i < n; i++) {
			int[] result = new int[arr.length];
			for (int j = d; j < arr.length; j++)
				result[j - d] = arr[j];
			for (int k = 0; k < d; k++)
				result[k + arr.length - d] = arr[k];
			arr = result;
		}
		return arr;
	}
}
