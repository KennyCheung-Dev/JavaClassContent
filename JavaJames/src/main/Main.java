package main;

import java.util.Scanner;

public class Main {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Please type the amount of starting money:");
		long startMoney = Integer.valueOf(sc.nextLine());
		

		//float to int
		float y = 10.2123f;
		int z = (int)y; 
		System.out.println(z);
		
		//float vs double
		float a = 10.212509f;
		double b = 10.220123919293;
		b = a;
		a = (float)b;
		
		//String to number
		String num = "128";
		int num2 = Integer.valueOf(num);
		float num3 = Float.valueOf(num);
		
		//Number to String
		float c = 10.23f;
		String d = String.valueOf(c);
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");

		System.out.print("Hi");
		System.out.print("Hi");
		System.out.print("Hi");
		System.out.print("Hi");
		
		System.out.print("Helo" + "world" + 5 + 9);
		
		/*
		 * Hello "World"
		 */
		
		/*
		 * Hi 
		 * 
		 * John
		 * 
		 * 
		 * Meat
		 */
		
		/*
		 * Wow /"Hi"/
		 */
		
		
		
	}

}
