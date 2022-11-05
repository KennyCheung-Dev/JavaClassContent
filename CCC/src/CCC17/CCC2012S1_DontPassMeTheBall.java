package CCC17;

import java.util.Scanner;

public class CCC2012S1_DontPassMeTheBall {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int goalNum = Integer.valueOf(sc.nextLine());
		int count = 0; 
		for (int i = 1; i < goalNum; i++) {
			for (int j = 1; j < i; j++) {
				for (int k = 1; k < j; k++) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
