package CCC3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ccc3 {

	public static void main(String[] args) {
		//Rotate Left cont.
		/*
		 * Wrote a function that takes in an int array, and two integer d and n
		 * RotateLeft(int[], int d, int n)
		 * Rotate left with length of d, for n times
		 */
//		for (int i : RotateLeftSimpler(new int[] {1, 2, 3, 4}, 2, 0)) {
//			System.out.println(i);
//		}
		
		//Count Even		
//		System.out.println(CountEven(new int[] {1, 2, 2, 2, 1, 1, 1, 2, 4}));
		
		//Sum13
		System.out.println(Sum13(new int[] {13, 2, 2, 1, 13, 13}));
	}
	
	public static int[] RotateLeft(int[] arr, int d, int n) {
		
		for (int i = 0; i < n; i ++) {
			int[] part1 = Arrays.copyOfRange(arr, 0, d);
			int[] part2 = Arrays.copyOfRange(arr, d, arr.length);
			for (int j = 0; j < part2.length; j++)
				arr[j] = part2[j];
			for (int k = part2.length; k < arr.length; k++) {
				arr[k] = part1[k-part2.length];
			}
		}
		return arr;
	}
	
	public static int[] RotateLeftSimpler(int[] arr, int d, int n) {
		
		for (int i = 0; i < n; i ++) {
			int[] result = new int[arr.length];
			for (int j = d; j < arr.length; j++) 
				result[j - d] = arr[j];
			for (int k = 0; k < d; k++) 
				result[k + arr.length - d] = arr[k];
			arr = result;
		}
		return arr;
	}
	
	public static int CountEven(int[] arr) {
		int count = 0;
		for (int num : arr)
			if (num % 2 == 0) count++;
		return count;
	}

	public static int Sum13(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				if (arr[i] != 13 && arr[i - 1] != 13) sum += arr[i];
			}
			else if (arr[i] != 13) sum += arr[i];
		}
		return sum;
	}
	
	public static int Sum13Alt(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 13 || arr[i - 1] == 13) continue;
			sum += arr[i];
		}
		return sum;
	}

}
