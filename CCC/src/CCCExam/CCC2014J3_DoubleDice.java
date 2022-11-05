package CCCExam;

import java.util.Scanner;

public class CCC2014J3_DoubleDice {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int a = 100, b = 100;
		int times = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < times; i++) {
			String s = sc.nextLine();
			int c = Integer.valueOf(s.split(" ")[0]);
			int d = Integer.valueOf(s.split(" ")[1]);
			if (c < d) a -= d;
			else if (c > d) b -= c;
		}
		System.out.println(a);
		System.out.println(b);
	}
}
