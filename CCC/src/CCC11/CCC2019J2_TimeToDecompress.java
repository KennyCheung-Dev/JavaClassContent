package CCC11;

import java.util.Scanner;

public class CCC2019J2_TimeToDecompress {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int times = Integer.valueOf(sc.nextLine());
		for (int i = 0; i < times; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < Integer.valueOf(s.split(" ")[0]); j++) {
				System.out.print(s.split(" ")[1]);
			}
			System.out.println();
		}
	}
}
