package CCC13;

import java.util.Scanner;

public class CCC2002S1_TheStudentsCouncilBreakfast {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
//		https://dmoj.ca/problem/ccc02s1
		
		int pink = Integer.valueOf(sc.nextLine());
		int green = Integer.valueOf(sc.nextLine());
		int red = Integer.valueOf(sc.nextLine());
		int orange = Integer.valueOf(sc.nextLine());
		int total = Integer.valueOf(sc.nextLine());
		
		int combination = 0;
		int minimumTicket = total;
		
		for (int i = 0; i <= total; i++) {
			for (int j = 0; j <= total; j++) {
				for (int k = 0; k <= total; k++) {
					for (int m = 0; m <= total; m++) {
						if (i * pink + j * green + k * red + m * orange == total) {
							System.out.println(String.format("# of PINK is %d # of GREEN is %d # of RED is %d # of ORANGE is %d", i, j, k, m));
							combination += 1;
							if (i + j + k + m < minimumTicket) minimumTicket = i + j + k + m;
						}
					}
				}
			}
		}
		System.out.println(String.format("Total combinations is %d.", combination));
		System.out.println(String.format("Minimum number of tickets to print is %d.", minimumTicket));
	}

}
