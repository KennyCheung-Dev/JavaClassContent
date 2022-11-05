package CCCExam;

import java.util.Scanner;

public class CCC005J2_RSANumber {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int total = 0;
		int low = sc.nextInt();
		int high = sc.nextInt();
		sc.nextLine();
		for (int i = low; i < high + 1; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 4) total++;
		}
		System.out.println("The number of RSA numbers between " + low + " and " + high + " is " + total);
	}

}
