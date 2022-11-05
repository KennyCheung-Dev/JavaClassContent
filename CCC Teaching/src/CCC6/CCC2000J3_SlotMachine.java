package CCC6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CCC2000J3_SlotMachine {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
			
		// need reference of the amount
		int[] reference = {100, 500, 1000};
		ArrayList<Integer> casesLeft = new ArrayList<Integer>();
		casesLeft.add(100);
		casesLeft.add(500);
		
		//2
		//3
		//8
		
		int times = sc.nextInt();
		for (int i = 0; i < times; i++) {
			//grab your new input, into an array, or just do everything inside this for loop
			//Use num 3,  go into reference to grab the amount $,
			// remove the amount of money from the ArrayList
			casesLeft.remove(casesLeft.indexOf(1000));
			
		}
		
		
		
	}
}
