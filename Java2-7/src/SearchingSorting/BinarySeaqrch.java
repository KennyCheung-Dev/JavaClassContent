package SearchingSorting;

import java.util.Arrays;

public class BinarySeaqrch {

	static int[] li = new int[]{76, 384, 372, 108, 849, 570, 868, 195, 873, 736, 934, 485, 264, 661, 653, 681, 601, 594, 374, 724, 974, 752, 65, 670, 309, 988, 723, 84, 467, 446, 330, 356, 314, 287, 533, 1, 764, 889, 75, 288, 154, 682, 405, 902, 122, 871, 411, 231, 790, 652};
	
	public static void main(String[] args) {
		li = InsertionSort(li);
//		for (int i : li) {
//			System.out.print(i);
//			System.out.print(" ");
//		}
		int value = 988;
//		int index = BinarySearch(li, value, 0, li.length);
		int index = BinarySearchIterative(li, value);
		if (index >= 0) {
			System.out.println("Found at position: " + index);
		} else {
			System.out.println("Not Found");
		}
	}

//	public static int BinarySearch(int[] li, int value, int left, int right) {
//		if (left >= right) {
//			return -1;
//		}
//		int midIndex = left + ((right - left) / 2);
//		
//		if (value == li[midIndex]) {
//			return midIndex;
//		} else if (value > li[midIndex]) {
//			return BinarySearch(li, value, midIndex + 1, right);
//		} else {
//			return BinarySearch(li, value, left, midIndex);
//		}
//	}
	
	public static int BinarySearchIterative(int[] li, int value) {
		int left = 0;
		int right = li.length;
		while (left < right) {
			int midIndex = left + ((right - left) / 2);
			
			if  (value == li[midIndex]) {
				return midIndex;
			} else if (value > li[midIndex]) {
				left = midIndex + 1;
			} else {
				right = midIndex;
			}
		}
		return -1;
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
