package CCC10_teaching;

import java.util.Arrays;
import java.util.Scanner;

public class SimpleEncryption {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println(HiddenPalindrome(sc.nextLine()));
	}
	
	public static int HiddenPalindrome(String s) {
		int longestLength = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String temp = s.substring(i, j+1);
				StringBuilder sb = new StringBuilder();
				sb.append(temp);
				if (sb.reverse().toString().equals(temp)) {
					if (temp.length() > longestLength) longestLength = temp.length();
				}
			}
		}
		return longestLength;
	}
}
