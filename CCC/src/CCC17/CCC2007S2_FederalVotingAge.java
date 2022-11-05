package CCC17;

import java.util.Scanner;

public class CCC2007S2_FederalVotingAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = Integer.valueOf(sc.nextLine());
		int[] birthday = new int[3];
		
		for (int i = 0; i < num; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < 3; j++)
				birthday[j] = Integer.valueOf(s.split(" ")[j]);
		
			//Check and print result
			if (birthday[0] < 1989) {
				System.out.println("Yes");
				continue;
			} else if (birthday[0] == 1989) {
				if (birthday[1] < 2) {
					System.out.println("Yes");
					continue;
				} else if (birthday[1] == 2) {
					if (birthday[2] <= 27) {
						System.out.println("Yes");
						continue;
					}
				}
			}
			System.out.println("No");
		}
		

	}

}
