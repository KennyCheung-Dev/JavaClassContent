package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		float decimalNum = 10.2f;
//		int intNum = decimalNum;
		
		//2 ways to typecast 
		
		//First Way, parseXXXX
//		Integer.parseInt("56.2");
//		Double.parseDouble("241.21");
		
		//Second way, (double)
//		int intExample = (int) 10.2f;
//		double douExample = (double) 10.2f;
		
		//Third Way valueOf
//		float thirdWay = Float.valueOf("120.42");
		
//		String s = "Helloworld";
//
//		System.out.print("HelloWorld");
//		System.out.print("HelloWorld");
//		
//		System.out.print("HelloWorld");
//		System.out.print("HelloWorld");
//		
//		System.out.print("HelloWorld" + "Hellllllllllo");
		int x = 20;
		
		
		switch (x) { 
			case 10:
				System.out.println("It's 10");
				
			case 20:
				System.out.println("It's 20");
				break;
			case 30:
				System.out.println("It's 30");
				
			case 40:
				System.out.println("40");
				break;
			default:
				System.out.println("No hit");
				
		}
		
				
		
		
		/*
		 * In-Class Exercise:
		 * you want to ride a roller coaster
		 * You need to be at least 5ft. to ride
		 * A ticket costs 10.00 dollars
		 * If you can, print "I can ride the Roller Coaster!"
		 * If you don't have enough money, print "I need x dollars more!"
		 * If you are not tall enough print "I need to be x feet taller!"
		 * If both of the condition failed, just print one depending on order.
		 * 
		 */
		
//		float height = 5.9f;
//		float money = 10.5f;
		
		
		/*
		 * Color Combination
		 * r = red,  g = green,  b = blue
		 * 
		 * r + g = yellow (y)
		 * r + b = magenta (m)
		 * g + b = cyan (c)
		 * r + g + b = white (Not handled)
		 * 
		 */
		
		String color1 = "r";
		String color2 = "b";
		
		/*
		 * Print the resulting color if you combine both colors
		 * If either variables have an invalid color, print "Invalid Color"
		 * example: color1 = "b", color2 = "g",  prints "c"
		 * Challenge: Can you do it within 9 if/elseif statements or less 
		 * Lowest is 5 
		 */
		
		
		
		
		if (color1.equals("r") ^ color2.contentEquals("b")) {
			System.out.println("Match");
		}
		
		//Run your method here
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		int[] myNum = {10, 20, 30, 40};
		float[] myFloat = {(float) 0.1, (float) 0.2,(float) 0.3, (float) 0.4};
		double[] doubleyes = {0.1, 0.2, 0.3, 0.4};
		boolean[] booleanyes = {true, false};
		
		int[] az = yez(myNum);
		
		System.out.println("----");
		for (int stuff3 = 0;stuff3 < az.length; stuff3++) {
			System.out.println(az[stuff3]);
			
			
		}
		System.out.println("----");
		for (int stuff = 1;stuff < 4; stuff+=2) {
			System.out.println(myNum[stuff]);
			System.out.println(myFloat[stuff]);
			System.out.println(doubleyes[stuff]);
			System.out.println(booleanyes[stuff]);
		}
	}
	public static int[] yez(int[] myNum) {
		for (int stuff2 = 0; stuff2<=myNum.length; stuff2++)
			if (stuff2 % 2 == 1) {
				myNum[stuff2] = myNum[stuff2]-10;
			}
		return myNum;
	}
	
	
	/*
	 * Homework:
	 * (Panelty 200)
	 * Make two integer array, of same length
	 * Exchange their values on all of the odd numbers positions
	 * Example: 
	 * arr1: 1, 3, 5, 7, 9
	 * arr2: 2, 4, 6, 8, 10
	 * Result:
	 * arr1: 1, 4, 5, 8, 9
	 * arr2: 2, 3, 6, 7, 10
	 */
	
}
