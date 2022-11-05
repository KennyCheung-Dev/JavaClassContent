package main;

import java.util.ArrayList;

public class Math {
	
	public static int Sum(int[] nums) {
		int sum = 0;
		for (int i : nums) {
			sum += i;
		}
		return sum;
	}
	
}
