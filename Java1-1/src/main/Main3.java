package main;

import java.util.Scanner;

public class Main3 {
	
//	static int x = 10;
	
	
	public static void main(String[] args) {
//		int[] nums = new int[6];
//		nums[0] = 2;
//		nums[1] = 3;
		
//		System.out.println(nums[2]);
		
		String[] names = new String[6];
		
		String names2[] = new String[6];
		
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7,3 ,4 ,32 ,23 ,523,23, 2,323, 32 , 234,32, 4 };
		int[] nums2 = new int[] {};
		
//		System.out.println(names.length);
//		System.out.println(nums[2]);
//		int x = 0;
//		while (x <= 4) {
//			x += 1;
//			System.out.println("Kenny");
//		}
		
//		int y = 0;
//		while (true) {
//			while (true) {
//				y += 1;
//				System.out.println("Kenny");
//				if (y >= 4) {
//					break;
//				}
//			}
//		}
		
		
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		

		
		
		
		
		// In-Class Exercise:
		// Add up from 1 to 100 (1+2+3+4...+100)
		// Result would be 5050
		// Print the result
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
//		"1234567890"  len = 10
		String name = "KennyHello";
//		System.out.println(name.substring(name.length() - 1));
		
//		System.out.println(name.substring(10));
		
		
		//Homework
		/*
		 * Make a method that takes in an array of int as parameters, then print 2 lines:
		 * Line1: The sum is : {}
		 * Line2: The lowest number is : {}
		 */
		int lowest = 9999999;
		
		int[] data = {5, 68, 243, 3, 747, 1, 2, 50};
		ProcessData(data);
		
		//If you are not sure how we can do this,
		//You are free to research online
		//Hint, loop through the array
	}
	
	public static void ProcessData(int[] data) {
		
	}
	
	
//	//Method Overloads
//	public String CreateAnimal(String name) {
//		return name;
//	}
//	
//	public String CreateAnimal(String name, int age) {
//		return name;
//	}
//	
//	public String CreateAnimal() {
//		return "Mojo";
//	}
//	
//	public String CreateAnimal(int age) {
//		return "Mojo";
//	}
	
//	public int findBirthYear(int age, int year){ 
//		return year - age;
//	}
	
//	public static void HiPlayer(String name) {
//		System.out.println("Hi " + name);
//	}
//	
//	public static void HiPlayer(String names, String another) {
//		System.out.println("Hi!");
//	}
	
	
	
	//JavaDocs 
	
	/**
	 * Given name of character as string, return the greetings line accordingly.
	 * @param name Enters the name of the character.
	 * @return String line of greetings to given character.
	 */
	public static String GetHiPlayerLine(String name) {
		return "Hi2 " + name; 
	}
	
	/**
	 * Given a packet chosen and mode button pressed, return corresponding coffee.
	 * @param p Coffee packet chosen.
	 * @param bPressed Button pressed on the machine.
	 * @return Coffee
	 */
	public static Coffee MakesCoffee(Packet p, Button bPressed) {
		return new Coffee();
	}
	
	public static class Coffee {
		public Coffee() {}
	}
	public class Packet {}
	public class Button {}
	
	
	
	
}


