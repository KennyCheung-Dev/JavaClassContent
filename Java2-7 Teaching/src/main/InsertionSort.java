package main;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] sorted = InsertionSort(new int[]{76, 384, 372, 108, 849, 570, 868, 195, 873, 736, 934, 485, 264, 661, 653, 681, 601, 594, 374, 724, 974, 752, 65, 670, 309, 988, 723, 84, 467, 446, 330, 356, 314, 287, 533, 1, 764, 889, 75, 288, 154, 682, 405, 902, 122, 871, 411, 231, 790, 652});
		
		for (int i : sorted) {
			System.out.println(i);
		}
	}
	
	public static int[] InsertionSort(int[] arr) {
		//Starting from the second position
		for (int i = 1;  i < arr.length; i++) {
			int currentIndex = i;
			for (int j = i - 1; j >= 0 && arr[j] > arr[currentIndex]; j--) {
				
				//Swap the numbers
				int temp = arr[j];
				arr[j] = arr[currentIndex];
				arr[currentIndex] = temp;
				
				//Update the currently checking number 
				currentIndex = j;
			}
		}
		
		return arr;
	}
}