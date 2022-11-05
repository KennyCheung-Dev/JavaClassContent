package main;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] sorted = SelectionSort(new int[]{76, 384, 372, 108, 849, 570, 868, 195, 873, 736, 934, 485, 264, 661, 653, 681, 601, 594, 374, 724, 974, 752, 65, 670, 309, 988, 723, 84, 467, 446, 330, 356, 314, 287, 533, 1, 764, 889, 75, 288, 154, 682, 405, 902, 122, 871, 411, 231, 790, 652});
		
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] SelectionSort(int[] arr) {
		//First outer loop loop through all the numbers 
		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	
	//Type any question I ll answer them when I'm back
	//Try implementing SelectionSort with the Psuedo Code
	//Bonus If you didn't need the psuedo code
	// It's actually a really fun process
	//  If you don't use the psuedo code.
	
	
}
