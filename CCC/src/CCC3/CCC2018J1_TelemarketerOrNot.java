package CCC3;

import java.util.Scanner;

public class CCC2018J1_TelemarketerOrNot {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();
		int num3 =  sc.nextInt();
		int num4 =  sc.nextInt();
		
		boolean isTele = true; 
		if (!((num1 == 8 || num1 == 9) && (num4 == 8 || num4 == 9)))
			isTele = false;
		if (!(num2 == num3)) 
			isTele = false;
		if (isTele)
			System.out.println("ignore");
		else
			System.out.println("answer");
	}
}

