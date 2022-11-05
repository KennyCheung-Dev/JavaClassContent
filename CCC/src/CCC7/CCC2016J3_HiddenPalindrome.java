package CCC7;

import java.util.Scanner;

public class CCC2016J3_HiddenPalindrome {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Hidden palindrome
		//https://dmoj.ca/problem/ccc16j3
		String s = sc.nextLine();
		System.out.println(HiddenPalindrome(s));
				

	}
	
	public static int HiddenPalindrome(String s) {
		
		int longestLength = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String temp = s.substring(i, j + 1);
				StringBuilder builder = new StringBuilder();
				builder.append(temp);
				if (builder.reverse().toString().equals(temp)) {
					if (temp.length() > longestLength) longestLength = temp.length();
				}
			}
		}
		return longestLength;
	}
	
	

}
