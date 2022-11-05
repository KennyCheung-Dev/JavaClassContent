package CCC16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CCC2017S2_HighTideLowTide {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		
		int[] arr = new int[n];
		String s = sc.nextLine();
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(s.split(" ")[i]);
		}
		Arrays.sort(arr);
		
		int lowIndex = Integer.valueOf(n % 2 == 0? arr.length / 2 - 1 : arr.length / 2);
		int highIndex = Integer.valueOf(n % 2 == 0? arr.length / 2 : arr.length / 2 + 1);
		
		ArrayList<Integer> tides = new ArrayList<Integer>();
		
		while (true) {
			if (lowIndex >= 0)
				tides.add(arr[lowIndex]);
			if (highIndex < arr.length)
				tides.add(arr[highIndex]);
			lowIndex--;
			highIndex++;
			if (lowIndex < 0 && highIndex >= arr.length) 
				break;
		}
			
		for (int i = 0; i < arr.length; i++) {
			System.out.print(tides.get(i));
			if (i != arr.length - 1) 
				System.out.print(" ");
		}

	}

}





