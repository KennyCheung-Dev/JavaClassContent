package main;

import java.util.Scanner;

public class ccc1 {

	private static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		//Review of Scanner
//		int i = sc.nextInt();
//		int d = sc.nextInt();
//		sc.nextLine();
//		String s = sc.nextLine();
//		System.out.println(d + s);
		
//		String s = sc.nextLine();
//		String[] ss = s.split(" ");
//		for (String sss : ss) {
//			System.out.println(sss);
//		}
		
		// Warm up exercise:
		
		/*
		 * Warm up 1
		 * Input a number, determine if it is between 1 and 100 inclusive
		 */
//		int i = sc.nextInt();
//		if (0 <= i && i <= 100) {
//			
//		}
		
		/*
		 * Warm up 2
		 * Get user's input on min and max inclusive, to determine even and odd numbers and print all the results
		 * Input: 
		 * 1 6
		 * 
		 * E.G.  
		 * 1 is an odd number
		 * 2 is an even number
		 * 3 is an odd number
		 * 4 is an even number
		 * 5 is an odd number
		 * 6 is an even number
		 */
		
//		int min = sc.nextInt();
//		int max  = sc.nextInt();
//		for (int i = min; i <= max; i++) {
//			System.out.print(i);
//			if (i % 2 == 0)
//				System.out.println(" is an even number");
//			else
//				System.out.println(" is an odd number");
//		}
		
		
		
		/*
		 * Input a year, judge if it is a leap year
		 * The year that is a multiple of 4 is  usually a leap  year.
		 * Except those multiple of hundred, it has to be a multiple of 400 to be a leap year. 
		 * For example, 1900 is not a leap year. 2000 is a leap year.
		 */
//		int year = sc.nextInt();
//		boolean isLeap = false;
//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0) {
//					isLeap =  true;
//				} else {
//					isLeap = false;
//				}
//			} else {
//				isLeap = true;
//			}
//		} else {
//			isLeap = false;
//		}
//		if (isLeap)
//			System.out.println(year + " is a Leap year");
//		else
//			System.out.println(year + " is not a Leap year");
		
		/*
		 * Convert Celsius to Fahrenheit
		 * celsius  * 1/8 = fahrenheit - 32
		 */
		
		
		
		
		/* Prime numbers
		 * Prime numbers are numbers that have only 2 factors: 1 and themselves. 
		 * For example, the first 5 prime numbers are 2, 3, 5, 7, and 11.
		 * Prime number has to be bigger than 1.
		 * 
		 * Prompt an inclusive range, print all the prime numbers
		 */
//		int min = sc.nextInt();
//		int max  = sc.nextInt();
//		
//		for (int i = min; i <= max; i++) {
//			if (i > 1) {
//				boolean isPrime = true;
//				for (int j = 2; j < i; j++) {
//					if (i % j  == 0) {
//						isPrime = false;
//					}
//				}
//				if (isPrime) {
//					System.out.println(i);
//				}
//			}
//		}
		
		/*
		 * An Armstronng number is an n-digit number that is equal to the sum of the nth powers of its digits
		 * e.g. 153 = 1**3 + 5**3 + 3**3 = 1 + 125 + 27 = 153
		 * The armstrong numbers smaller than 1000: 
		 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407
		 * 
		 * Determine if the input number is an Armstrong number
		 * 
		 * For this question, only consider positive numbers
		 */
		
		// Two method, by string, by integer
		
		// By Integers:
//		int i = sc.nextInt();
//		int leng = String.valueOf(i).length();
//		boolean isArmstrong = true;
//		int sum = 0;
//		int j = i;
//		while (true) {
//			int lastdigit = j % 10;
//			sum += Math.pow(lastdigit, leng);
//			if (j < 10) {
//				break;
//			}
//			j = Math.floorDiv(j, 10);
//		}
//		if (sum == i)
//			System.out.println(i + " is an Armstrong number");
//		else 
//			System.out.println(i + " is not Armstrong number");
		
		//By String: 
//		String s = sc.nextLine();
//		int sum = 0;
//		char[] ss = s.toCharArray();
//		for (char c : ss) {
//			sum += Math.pow(Integer.valueOf(String.valueOf(c)), s.length());
//		}
//		
//		if (sum == Integer.valueOf(s))
//			System.out.println(s + " is an Armstrong number");
//		else 
//			System.out.println(s + " is not Armstrong number");
		
		
		/*
		 * pos_neg
		 * 
		 * Given 2 int values, return True if one is negative and one is positive.
		 * Except if parameter "negative" is true, then return True only if both are negative
		 * 
		 * Write function pos_neg(int a, int b, boolean negative)
		 * 
		 * pos_neg(1, -1, False) -> True
		 * pos_neg(-1, 1, False) -> True
		 * pos_neg(-4, -5, True) -> True
		 */
		
		
		/*
		 * Reverse an integer, 123 -> 321,  789 -> 987
		 */
		int i = sc.nextInt();
		String strResult = "";
		String s = String.valueOf(i);
		for (int j = s.length() - 1; j >= 0; j--) {
			strResult += String.valueOf(s.toCharArray()[j]);
		}
		System.out.println(strResult);
	}
	
	
	//pos_neg
	private static boolean pos_neg(int a, int b, boolean negative) {
		if (negative)
			return a < 0 && b < 0;
		else
			return a * b < 0;
	}
	
	
}
