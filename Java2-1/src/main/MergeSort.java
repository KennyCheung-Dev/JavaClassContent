package main;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] sorted = MergeSort(new int[] {5, 3, 2, 4, 1, 0, -999, 100000});
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] MergeSort(int[] c) {
		
		//Expression:
		//Separate collection into two partition
		//Sort the first collection
		//Sort the second collection
		//Merge the two collection back together
		//Return merged result
		//Merge(MergeSort(ColletionA), MergeSort(CollectionB))
		
		//Base case, if there is only 1 number in collection, return the number by itself
		if (c.length == 1)
			return c;
		//Otherwise, split!
		int[] a = Arrays.copyOfRange(c, 0, c.length/2);
		int[] b = Arrays.copyOfRange(c,  c.length/2, c.length);
		
		//Run Recursive MergeSort on both
		a = MergeSort(a);
		b = MergeSort(b);
		//At this point, both a and b are sorted
		
		//Merge together
		return Merge(a, b);
	}
	
	//Merge two collection into a new, logic is to always take the smaller number from both
	public static int[] Merge(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		//While a and b both still have numbers:
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
		
		//Only 1 collection still has number(s)
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
	

}
