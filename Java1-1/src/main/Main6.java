package main;

import java.util.Scanner;

public class Main6 {

	static Scanner sc = new Scanner(System.in);
	static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	public static void main(String[] args) {
		String h = GetStringInput();
		System.out.println(CeasarSalad(h, GetIntInput()));
		//Output: Mjqqt Btwqi
	}
	
	public static String CeasarSalad(String input, int code) {
		String output = "";
		for (char c : input.toCharArray()) {
			boolean isUpper = Character.isUpperCase(c);
			c = Character.toLowerCase(c);
			if (alphabet.indexOf(c) == -1) {
				output += c;
				continue;
			}
			int currentIndex = alphabet.indexOf(c);
			currentIndex += code;
			currentIndex = currentIndex % 26;
			char newChar = alphabet.charAt(currentIndex);
			if (isUpper)
				newChar = Character.toUpperCase(newChar);
			output += newChar;
		}
		return output;
	}
	
	public static String GetStringInput() {
		while (true) {
			System.out.println("Please enter a message for encoding:");
			String temp = sc.nextLine();
			if (temp.isEmpty()) {
				System.out.println("Message is empty");
				continue;
			}
			return temp;
		}
	}
	
	public static int GetIntInput() {
		while (true) {
			try {
				System.out.println("Please enter your encoding index:");
				int temp = Integer.valueOf(sc.nextLine());
				return temp;
			} catch (Exception e) {
				System.out.println("Input requires an integer!");
			}
		}
		
		// Try Catch Block
//		try {
////			String temp = null;
////			System.out.println(temp.charAt(0));
////			return temp;
//			
//			System.out.println("Please enter your encoding index:");
//			int temp = Integer.valueOf(sc.nextLine());
//			
//		} catch (NullPointerException e) {
//			System.out.println("Hey, you don't have an object here.");
//		} catch (NumberFormatException e) {
//			System.out.println("Hey, your number doesn't look correct.");
//		}
//		return "";
		
	}

}
