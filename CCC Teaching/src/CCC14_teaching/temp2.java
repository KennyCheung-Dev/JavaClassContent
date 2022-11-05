package CCC14_teaching;

import java.util.Scanner;

public class temp2 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int pink = Integer.valueOf(sc.nextLine());
		int green = Integer.valueOf(sc.nextLine());
		int red = Integer.valueOf(sc.nextLine());
		int orange = Integer.valueOf(sc.nextLine());
		int total = Integer.valueOf(sc.nextLine());
		
		
		int combination = 0;
		int minimumTicket = total;
		
		for (int i = 0; i < total + 1; i++) {
			for (int j = 0; j < total + 1; j++) {
				for (int k = 0; k < total + 1; k++) {
					for (int l = 0; l < total + 1; l++) {
						if (i * pink + j * green + k * red + l * orange == total) {
							System.out.println(String.format("# of PINK is %d # of GREEN is %d # of RED is %d # of ORANGE is %d", i, j, k, l));
							combination++;
							int numTickets = i + j + k + l;
							if (numTickets < minimumTicket) minimumTicket = numTickets;
						}
					}
				}
			}
		}
		System.out.println(String.format("Total combinations is %d.", combination));
		System.out.println(String.format("Minimum number of tickets to print is %d.", minimumTicket));
	}

}
