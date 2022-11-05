package CCC7;

import java.util.Scanner;

public class Warmup {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Warmup Questions
		//Print the following
		
//		*
//		**
//		***
//		****
//		*****
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//Print the multiplication table:
//		1 * 1 = 1 | 1 * 2 = 2 | 1 * 3 = 3 ... 1 * 9 = 9
//		2 * 1 = 2 | ...
//		................................... | 9 * 9 = 81
				
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(String.format("%d * %d = %d", i, j, i*j));
				if (j != 9) System.out.print(" | ");
			}
			System.out.println();
		}
		
		// There was 35 heads.
		// There was at least one chicken and at most 34.
		// There was 94 feat
		// There was at least one rabbit and at most 23.
		for (int i = 1; i < 35; i++) {
			if (i * 2 + (35 - i) * 4 == 94) 
				System.out.println(String.format("Combination Found: %d chicken and %d rabbit", i, (35 - i)));
		}
		
		//Slightly weird answer:
		for (int i = 1; i < 35; i++) {
			for (int j = 1; j < 25; j++) {
				if (i * 2 + j * 4 == 94 && i + j == 35) 
					System.out.println(String.format("Combination Found: %d chicken and %d rabbit", i, j)); 
			}
		}
		
		
		
		//Instantiate an int 2d array of random numbers (actually randomize them)
		
		//Print the entire 2d array in a grid form 
		//Extract the 3rd row, 1st column
		//Extract the 2nd row into individual rows
		
		// x | y | z
		// x | y | z
		// x | y | z
		//From a 2d array
		int[][] ints = new int[3][3];
		
		System.out.println("2d array in grid form : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				ints[i][j] = (int)(Math.random() * 5000);
				System.out.print(ints[i][j]);
				if (j != 2) System.out.print(" | ");
			}
			System.out.println();
		}
		
		System.out.println("3rd roll 1st column : " + ints[2][0]);
		
		System.out.println("2nd row into individual rows : ");
		for (int inta : ints[1]) {
			System.out.println(inta);
		}
		
		
		//Build a function to reverse any 2d array:
		//Use the following to test
//		{
//			{1, 2, 3},
//			{4, 5, 6},
//			{7, 8, 9}
//		}
		
		// Result printed:
//		9 | 8 | 7
//		6 | 5 | 4
//		3 | 2 | 1
		
		
		
//		{
//			{1, 2, 3, 4},
//			{5, 6, 7, 8},
//			{9, 10, 11, 12},
//			{13, 14, 15, 16},
//		}
		
		// Result printed:
//		16 | 15 | 14 | 13
//		12 | 11 | 10 | 9
//		8 | 7 | 6 | 5
//		4 | 3 | 2 | 1
		
		
//		int[][] nums = {
//			{1, 2, 3},
//			{4, 5, 6},
//			{7, 8, 9}
//		};
		
//		int[][] nums = {
//			{1, 2, 3, 4},
//			{5, 6, 7, 8},
//			{9, 10, 11, 12},
//			{13, 14, 15, 16},
//		};
		
		//Modify the above code so you take user's input to fill in the array
		// First two input: the row and column sizes
		// Second to infinite input: the actual values going left to right, then top to bottom
		// Example:
		// 3
		// 2
		// 1
		// 3
		// 5
		// 7
		// 9
		// 11
		// Array:
		// 1 | 3
		// 5 | 7
		// 9 | 11
		
		int[][] nums = new int[sc.nextInt()][sc.nextInt()];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j] = sc.nextInt();
			}
		}
		
		int[][] numsReversed = Reverse2DArray(nums);
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.print(numsReversed[i][j]);
				if (j != nums[0].length - 1) System.out.print(" | ");
			}
			System.out.println();
		}
	}
	
	public static int[][] Reverse2DArray(int[][] nums) {
		int[][] numsReversed = new int[nums.length][nums[0].length];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				numsReversed[i][j] = nums[nums.length - i - 1][nums[0].length - j - 1];
			}
		}
		return numsReversed;
	}

}
