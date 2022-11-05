package CCC19;

import java.util.Scanner;

public class CCC2011S1_EnglishOrFrench {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lines = Integer.valueOf(sc.nextLine());
		int numT = 0;
		int numS = 0;
		for (int i = 0; i < lines; i++) {
			String line = sc.nextLine();
			for (char c : line.toCharArray()) {
				if (c == 't' || c == 'T') numT++;
				if (c == 's' || c == 'S') numS++;
			}
		}
		if (numT > numS) System.out.println("English");
		else System.out.println("French");

	}

}
