package CCC17;

import java.util.Scanner;

class CCC2009S1_CoolNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int high = sc.nextInt();
		int cool = 0;
		
		for (int i = low; i <= high; i++)
			if (Math.sqrt(i) % 1 == 0)
				if (Math.cbrt(i) % 1 == 0)
					cool++;
		
		System.out.println(cool);
	}

}
