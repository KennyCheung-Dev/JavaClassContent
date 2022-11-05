package CCC7;

import java.util.Scanner;

public class CCC2012J3_IconScaling {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// CCC2012J3_IconScaling
		// https://dmoj.ca/problem/ccc12j3
		String[][] icon = {
				{"*", "x", "*"},
				{" ", "x", "x"},
				{"*", " ", "*"},
		};
		
		int scale = sc.nextInt();
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < scale; j++) { 
				for (int k = 0; k < 3; k++) {
					for (int l = 0; l < scale; l++) {
						System.out.print(icon[i][k]);
					}
				}
			System.out.println();
			}
		}
	}

}
