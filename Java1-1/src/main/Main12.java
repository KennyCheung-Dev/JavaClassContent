package main;

public class Main12 {

	//Homework 1
	public static void main(String[] args) {
		// Turn any decimal numbers into base-8 (octal) value
		System.out.println(DecToOctRecur(200));
		// Return and print 144
	}

	public static int DecToOctRecur(int num) {
		if (num < 8)
			return num;
		return Integer.valueOf(DecToOctRecur(num / 8) + String.valueOf(num % 8));
		// Statement: F(n) = F(int(n / 8)) Concatenate with n % 8
	}
		
	
	//Homework 2: 
	// Think about how you would check if a word is a palindrome with recursion
	
	
	
}
