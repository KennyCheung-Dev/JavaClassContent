package CCC7;

import java.util.Scanner;

public class CCC2015J2_HappyOrSad {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String[] inputS = input.split("");
		int countHappy = 0;
		int countSad = 0;
		for (int i = 0; i < inputS.length-3; i++) {
			if (inputS[i].equals(":") && inputS[i+1].equals("-") && inputS[i+2].equals(")")) {
				countHappy++;
			}
		
			else if (inputS[i].equals(":") && inputS[i+1].equals("-") && inputS[i+2].equals("(")) {
				countSad++;
			}
		}
		System.out.println(countHappy + " " + countSad);
		if (countHappy > countSad) {
			System.out.println("happy");
		}
		else if (countSad > countHappy) {
			System.out.println("sad");
		}
		else if (countSad ==0 && countHappy ==0) {
			System.out.println("none");
		}
		else {
			System.out.println("unsure");
		}
	}
}