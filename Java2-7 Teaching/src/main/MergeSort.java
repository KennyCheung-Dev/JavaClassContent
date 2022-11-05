package main;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] sorted = MergeSort(new int[]{2, 1, 5, 3, 4});
		
		for (int i : sorted) {
			System.out.println(i);
		}
	
	}
	
	public static int[] merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		//While a and b both still have elements
		while (aIndex < a.length && bIndex < b.length) {
			if (a[aIndex] > b[bIndex]) {
				c[cIndex] = b[bIndex];
				bIndex++;
			} else {
				c[cIndex] = a[aIndex];
				aIndex++;
			}
			cIndex++;
		}
		
		while (aIndex < a.length) {
			c[cIndex] = a[aIndex];
			aIndex++;
			cIndex++;
		}
		
		while (bIndex < b.length) {
			c[cIndex] = b[bIndex];
			bIndex++;
			cIndex++;
		}
		return c;
	}
	
	public static int[] MergeSort(int[] c) {
		
		if (c.length == 1) {
			return c;
		} else {
			int[] a = Arrays.copyOfRange(c, 0, c.length/2);
			int[] b = Arrays.copyOfRange(c, c.length/2, c.length);
			
			a = MergeSort(a);
			b = MergeSort(b);
			
			return merge(a, b);
		}
	}

}
