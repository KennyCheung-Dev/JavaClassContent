package CCC12_teaching;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < times; i++) {
			String s = sc.nextLine();
			String ps = s.substring(0, 1);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (!s.substring(j, j+1).contentEquals(ps)) {
					System.out.print(count + " " + ps + " ");
					count = 1;
				} else {
					count++;
				}
				ps = s.substring(j, j+1);
			}
			System.out.println(count + " " + ps);
		}
	}
}
