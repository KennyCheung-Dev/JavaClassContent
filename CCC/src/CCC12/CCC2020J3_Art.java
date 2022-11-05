package CCC12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CCC2020J3_Art {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int times = Integer.valueOf(sc.nextLine());
		int[] x = new int[times];
		int[] y = new int[times];
		for (int i = 0; i < times; i++) {
			String s = sc.nextLine();
			x[i] = Integer.valueOf(s.split(",")[0]);
			y[i] = Integer.valueOf(s.split(",")[1]);
		}
		Arrays.sort(x);
		Arrays.sort(y);
		System.out.println(String.valueOf(x[0] - 1) + "," + String.valueOf(y[0] - 1));
		System.out.println(String.valueOf(x[x.length - 1] + 1) + "," + String.valueOf(y[y.length - 1] + 1));
	}

}
