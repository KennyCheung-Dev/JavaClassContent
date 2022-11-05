package main;

import java.util.Scanner;

public class CCC1 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 10 20
		// HelloWorld
//		int i = sc.nextInt();
//		int d = sc.nextInt();
//		sc.nextLine();
//		String hello = sc.nextLine();
//		System.out.println(i + ", " + d + ", " + hello);
		
		// Kenny Andy Eric Henry Ivan Kevin
//		String s = sc.nextLine();
//		String[] ss = s.split(" ");
//		
//		for (String sss : ss) {
//			System.out.println(sss);
//		}
		
		/*
		 * Warm up 1
		 * Input a number, determine if it is between
		 * 1 and 100 inclusively
		 * 
		 * Input: 
		 * 25
		 * Output:
		 * true
		 * 
		 * Input:
		 * 101
		 * Output:
		 * false
		 */
		
//		int i = sc.nextInt();
//		if (0 < i && i < 101) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
		
		/*
		 * Warm up 2
		 * From 1 to 6 inclusively, determine if the number is even or odd,
		 * print  all the results
		 * Use loops
		 * Input:
		 * null
		 * Output:
		 * 1 is an odd number
		 * 2 is an even number
		 * ...
		 * 6 is an even number
		 */
		
//		Integer.valueOf("20");
		
		// dog 10 cat 20 pikachu 30
		
//		for (int i = 1; i <= 6; i++) {
//			System.out.print(i);
//			if (i % 2 == 0)
//				System.out.println(" is an even number");
//			else 
//				System.out.println(" is an odd number");
//		}
		
		/*
		 * Input a year, judge if it is a leap year
		 * The year that is a multiple of 4 is usually a leap year
		 * Except those multiple of hundred, it has to also be a multiple
		 * of 400 to be a leap year
		 * For example, 1900 is not a leap year, 2000 is a leap year
		 * 
		 * Input: 
		 * 1900
		 * Output:
		 * false
		 * 
		 * Input:
		 * 2004:
		 * Output:
		 * true
		 */
		
//		int year = sc.nextInt();
//		boolean isLeap =  false;
//		if (year % 4 == 0) {
//			if (year % 100 == 0) {
//				if (year % 400 == 0) {
//					isLeap = true;
//				} else {
//					isLeap = false;
//				}
//			} else {
//				isLeap = true;
//			}
//		} else {
//			isLeap = false;
//		}
//		System.out.println(isLeap);
		
		/* 
		 * Prime numbers
		 * Prime numbers are numbers that have only 2 factors, 1 and itself
		 * Examples: 2, 3, 5, 7, 11
		 * Prime numbers are bigger than 1
		 * 
		 * Prompt for an inclusive range, print all the prime numbers inside
		 * 
		 * Input:
		 * 1
		 * 1000
		 * Output:
		 * 2
		 * 3
		 * 5
		 * 7
		 * 11
		 * ...
		 * 997
		 */
		
		int min = sc.nextInt();
		int max = sc.nextInt();
		
		for (int i = min; i <= max; i++) {
			if (i > 1) {
				boolean isPrime = true;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) 
						isPrime =  false;
				}
				if (isPrime) System.out.println(i);
			}
		}
		
		
		
		
	}
}
