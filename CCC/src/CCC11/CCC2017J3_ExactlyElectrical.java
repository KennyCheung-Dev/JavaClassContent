package CCC11;

import java.util.Scanner;

public class CCC2017J3_ExactlyElectrical {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String c1 = sc.nextLine();
		String c2 = sc.nextLine();
		int charge = sc.nextInt();
		int x1 = Integer.valueOf(c1.split(" ")[0]);
		int y1 = Integer.valueOf(c1.split(" ")[1]);
		int x2 = Integer.valueOf(c2.split(" ")[0]);
		int y2 = Integer.valueOf(c2.split(" ")[1]);
		int distance = Math.abs(x2 - x1) + Math.abs(y2 - y1);
		if (distance > charge) {
			System.out.println("N");
		} else if (distance == charge) {
			System.out.println("Y");
		} else {
			if (distance % 2 == charge % 2) 
				System.out.println("Y");
			else 
				System.out.println("N");
		}
	}

}
