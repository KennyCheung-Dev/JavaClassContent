package main;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] li = new int[] { 1, 2, 3, 4, 7, 9, 10, 22222, 2555555};
		System.out.println(BinarySearchIter(li, 22222, 0, li.length - 1));
	}
	
	public static int BinarySearch(int[] li, int value, int left, int right) {
		if (left > right)
			return -1;
		
		int midIndex = left + ((right - left) / 2);
		
		if (value == li[midIndex])
			return midIndex;
		else if (value > li[midIndex]) 
			return BinarySearch(li, value, midIndex + 1, right);
		else 
			return BinarySearch(li, value, left, midIndex - 1);
	}
	
	public static int BinarySearchIter(int[] li, int value, int left, int right) {

		while (left <= right) {
			int midIndex = left + ((right - left) / 2);
			
			if (value == li[midIndex])
				return midIndex;
			else if (value > li[midIndex]) 
				left = midIndex + 1;
			else 
				right = midIndex - 1;
		}
		return -1;
	}
}
