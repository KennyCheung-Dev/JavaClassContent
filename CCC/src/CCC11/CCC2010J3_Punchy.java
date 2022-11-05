package CCC11;

import java.util.Scanner;

public class CCC2010J3_Punchy {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int A = 0;
		int B = 0;
		int temp1 = 0;
		int temp2 = 0;
		boolean running = true;
		while (running) {
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			switch (Integer.valueOf(ss[0])) {
				case 1:
					if (ss[1].equals("A")) A = Integer.valueOf(ss[2]);
					if (ss[1].equals("B")) B = Integer.valueOf(ss[2]);
					break;
				case 2:
					if (ss[1].equals("A")) System.out.println(A);
					if (ss[1].equals("B")) System.out.println(B);
					break;
				case 3:
					temp1 = (ss[1].equals("A"))? A : B;
					temp2 = (ss[2].equals("A"))? A : B;
					if (ss[1].equals("A"))
						A = temp1 + temp2;
					else
						B = temp1 + temp2;
					break;
				case 4:
					temp1 = (ss[1].equals("A"))? A : B;
					temp2 = (ss[2].equals("A"))? A : B;
					if (ss[1].equals("A"))
						A = temp1 * temp2;
					else
						B = temp1 * temp2;
					break;
				case 5:
					temp1 = (ss[1].equals("A"))? A : B;
					temp2 = (ss[2].equals("A"))? A : B;
					if (ss[1].equals("A"))
						A = temp1 - temp2;
					else
						B = temp1 - temp2;
					break;
				case 6:
					temp1 = (ss[1].equals("A"))? A : B;
					temp2 = (ss[2].equals("A"))? A : B;
					if (ss[1].equals("A"))
						A = (int)(temp1 / temp2);
					else
						B = (int)(temp1 / temp2);
					break;
				case 7:
					running = false;
					break;
			}
		}
	}
}
