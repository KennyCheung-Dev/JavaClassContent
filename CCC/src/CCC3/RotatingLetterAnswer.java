package CCC3;

import java.util.Scanner;

public class RotatingLetterAnswer {

	static Scanner sc = new Scanner(System.in);
	
	static String[] letters = new String[] {"I", "O", "S", "H", "Z", "X", "N"};
	
	public static void main(String[] args) {
		if (CheckWord(sc.nextLine())) 
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	public static boolean CheckWord(String word) {
		boolean temp = true;
		for (char letter : word.toCharArray()) {
			if (!CheckLetter(String.valueOf(letter))) temp = false;
		}
		return temp;
	}
	
	public static boolean CheckLetter(String letter) {
		boolean temp = false;
		for (String t : letters) {
			if (letter.equals(t)) temp = true;
		}
		return temp;
	}
}
