package SearchingSorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] sorted = MergeSort(new int[]{5, 4, 3, 2, 1, 0});
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] MergeSort(int[] c) {
		//The array only has 1 element
		if (c.length == 1) {
			return c;
		} else { //Otherwise, split and sort each arrays, then merge and return
			//Split arrays
			int[] a = Arrays.copyOfRange(c, 0, c.length/2);
			int[] b = Arrays.copyOfRange(c, c.length/2, c.length);
			
			//Recursively calling the MergeSort
			a = MergeSort(a);
			b = MergeSort(b);
			
			//Return the merged result
			return merge(a, b);
		}
	}
	
	public static int[] merge(int[] a, int[] b)  {
		int[] c = new int[a.length + b.length];
		
		int aIndex = 0;
		int bIndex = 0;
		int cIndex = 0;
		
		//While a and b both still have numbers
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
		
		//Only a still has numbers
		while (aIndex < a.length) {
			c[cIndex] = a[aIndex];
			aIndex++;
			cIndex++;
			for (int cNum : c) {
				System.out.print(cNum);
			}
			System.out.println();
		}
		
		//Only b still has numbers
		while (bIndex < b.length) {
			c[cIndex] = b[bIndex];
			bIndex++;
			cIndex++;
			for (int cNum : c) {
				System.out.print(cNum);
			}
			System.out.println();
		}
		
		//Finally return the filled array
		return c;
	}

}
