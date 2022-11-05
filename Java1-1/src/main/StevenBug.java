package main;
import java.util.Scanner;
public class StevenBug {

	static boolean palindrome(String word, int x, int y) {
		if	(x == y)
			return true;
		if (word.charAt(x) != word.charAt(y))
			return false;
		if (x < y + 1)
			return palindrome(word, x + 1, y - 1);
		return true; 
	}
	
	static boolean blank(String word) {
		int ifempty = word.length();
		if (ifempty == 0)
			return true;
		return palindrome(word, 0, ifempty -1);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
	}
}