package CCC12;

import java.util.HashMap;
import java.util.Scanner;

public class CCC2007J4_AnagramChecker {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String s1 = StripSymbols(sc.nextLine());
		String s2 = StripSymbols(sc.nextLine());
		HashMap<String, Integer> dict1 = new HashMap<String, Integer>();
		HashMap<String, Integer> dict2 = new HashMap<String, Integer>();
		for (int i = 0; i < s1.length(); i++) {
			String letter = s1.substring(i, i+1);
			if (dict1.containsKey(letter)) {
				dict1.replace(letter, dict1.get(letter) + 1);
			} else {
				dict1.put(letter, 1);
			}
		}
		for (int i = 0; i < s2.length(); i++) {
			String letter = s2.substring(i, i+1);
			if (dict2.containsKey(letter)) {
				dict2.replace(letter, dict2.get(letter) + 1);
			} else {
				dict2.put(letter, 1);
			}
		}
		
		if (dict1.equals(dict2)) {
			System.out.println("Is an anagram.");
		} else {
			System.out.println("Is not an anagram.");
		}
	}
	
	public static String StripSymbols(String s) {
		return s.replaceAll("[^a-zA-Z]", "");
	}

}
